package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Telha extends Material {
	private String formato;
	
	Telha(){
		super();
	}
	
	Telha(int quantidade, float espessura, float tamanho, String formato){
		super(quantidade, espessura, tamanho);
		this.formato = formato;
	}
	
	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
}
