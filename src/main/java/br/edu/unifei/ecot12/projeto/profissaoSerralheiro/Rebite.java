package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Rebite extends ItemConsumivel {
	private int numPino; //numero do pino de encaixe
	
	Rebite(){
		super();
	}
	
	Rebite(int quantidade, float espessura, float tamanho){
		super(quantidade, espessura, tamanho);
	}
	
	public int getNumPino() {
		return numPino;
	}

	public void setTipoRebite(int numPino) {
		this.numPino = numPino;
	}

	@Override
	public boolean aceitar(Ferramenta ferramenta) {
		return ferramenta.visitar(this);
	}

}
