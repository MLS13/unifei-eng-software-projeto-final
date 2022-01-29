package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public abstract class Eletrica extends Ferramenta {
	protected int tensao;
	protected boolean bivolt;
	
	Eletrica(){
		tensao = 127;
		bivolt = false;
	}
	
	Eletrica(int tensao, boolean bivolt){
		this.tensao = tensao;
		this.bivolt = bivolt;
	}
	
	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public boolean isBivolt() {
		return bivolt;
	}

	public void setBivolt(boolean bivolt) {
		this.bivolt = bivolt;
	}

	public abstract boolean ligar(int tensao);
	
	public abstract void desligar();
	
}
