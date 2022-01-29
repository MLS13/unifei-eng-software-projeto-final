package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Disco extends ItemConsumivel {
	private String finalidade;
	
	Disco(){
		super();
	}
	
	Disco(int quantidade, float espessura, float tamanho, String finalidade){
		super(quantidade, espessura, tamanho);
		this.finalidade = finalidade;
	}
	
	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	@Override
	public boolean aceitar(Ferramenta ferramenta) {
		return ferramenta.visitar(this);
	}

}
