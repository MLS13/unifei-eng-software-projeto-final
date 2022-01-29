package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public abstract class Manual extends Ferramenta {
	protected boolean bancada;
	protected int numero;//Numero da chave ou do rebitador
	
	Manual(){
		numero = 0;
		bancada = true;
	}
	
	Manual(int numero){
		this.numero = numero;
		bancada = true;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isBancada() {
		return bancada;
	}

	public void setBancada(boolean bancada) {
		this.bancada = bancada;
	}
	
	public abstract void devolverBancada();
	public abstract void pegarBancada();
	
	
}
