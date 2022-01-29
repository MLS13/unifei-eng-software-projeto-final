package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public abstract class ItemConsumivel {
	protected float espessura;
	protected int quantidade;
	protected float tamanho;
	
	ItemConsumivel(){
		quantidade = 0;
		espessura = 0;
		tamanho = 0;
	}
	
	ItemConsumivel(int quantidade, float espessura, float tamanho){
		this.quantidade = quantidade;
		this.espessura = espessura;
		this.tamanho = tamanho;
	}
	
	public float getEspessura() {
		return espessura;
	}
	
	public void setEspessura(float espessura) {
		this.espessura = espessura;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void inserirConsumivel(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public float getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public abstract boolean aceitar(Ferramenta ferramenta); 
	
	public void consumir(int quantidade) {
		this.quantidade -= quantidade;
	}
	
}
