package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Barra extends Material {
	private String tipoBarra;
	
	Barra(){
		super();
	}
	
	Barra(int quantidade, float espessura, float tamanho, String tipoBarra){
		super(quantidade, espessura, tamanho);
		this.tipoBarra = tipoBarra;
	}
	
	public String getTipoBarra() {
		return tipoBarra;
	}

	public void setTipoBarra(String tipoBarra) {
		this.tipoBarra = tipoBarra;
	}
	
}
