package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Chapa extends Material {
	private String tipoChapa;
	
	Chapa(){
		super();
	}
	
	Chapa(int quantidade, float espessura, float tamanho, String tipoChapa){
		super(quantidade, espessura, tamanho);
		this.tipoChapa = tipoChapa;
	}
	
	public String getTipoChapa() {
		return tipoChapa;
	}

	public void setTipoChapa(String tipoChapa) {
		this.tipoChapa = tipoChapa;
	}
	
}
