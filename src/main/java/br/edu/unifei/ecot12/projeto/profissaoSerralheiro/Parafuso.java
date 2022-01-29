package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Parafuso extends ItemConsumivel {
	private int numChave;
	
	Parafuso(){
		super();
	}
	
	Parafuso(int quantidade, float espessura, float tamanho, int numChave){
		super(quantidade, espessura, tamanho);
		this.numChave = numChave;
	}
	
	public int getNumParafuso() {
		return numChave;
	}

	public void setNumParafuso(int numChave) {
		this.numChave = numChave;
	}

	@Override
	public boolean aceitar(Ferramenta ferramenta) {
		return ferramenta.visitar(this);
	}

}
