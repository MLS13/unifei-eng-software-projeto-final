package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public abstract class Material {
	protected int quantidade;
	protected float espessura;
	protected float tamanho;
	
	Material(){
		quantidade = 0;
		espessura = 0;
		tamanho = 0;
	}
	
	Material(int quantidade, float espessura, float tamanho){
		this.espessura = espessura;
		this.quantidade = quantidade;
		this.tamanho = tamanho;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public float getEspessura() {
		return espessura;
	}
	
	public void setEspessura(float espessura) {
		this.espessura = espessura;
	}
	
	public float getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public boolean utilizar(int qtd) {
		if (qtd <= quantidade)
			quantidade -= qtd;
		else return false;
		return true;
	}
}
