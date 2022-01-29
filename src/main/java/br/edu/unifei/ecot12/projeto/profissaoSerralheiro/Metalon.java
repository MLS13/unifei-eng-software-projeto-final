package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Metalon extends Material {
	private float dimensao;
	
	Metalon(){
		super();
		dimensao = 0;
	}
	
	Metalon(int quantidade, float espessura, float tamanho, float dimensao){
		super(quantidade, espessura, tamanho);
		this.dimensao = dimensao;
	}
	
	public float getDimensao() {
		return dimensao;
	}

	public void setDimensao(float dimensao) {
		this.dimensao = dimensao;
	}
	
}
