package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Broca extends ItemConsumivel {
	private String tipoBroca;
	
	Broca(){
		super();
		tipoBroca = "";
	}
	
	Broca(int quantidade, float espessura, float tamanho, String tipoBroca){
		super(quantidade, espessura, tamanho);
		this.tipoBroca = tipoBroca;
	}
	
	public String getTipoBroca() {
		return tipoBroca;
	}

	public void setTipoBroca(String tipoBroca) {
		this.tipoBroca = tipoBroca;
	}

	
	@Override
	public boolean aceitar(Ferramenta ferramenta) {
		return ferramenta.visitar(this);
	}

}
