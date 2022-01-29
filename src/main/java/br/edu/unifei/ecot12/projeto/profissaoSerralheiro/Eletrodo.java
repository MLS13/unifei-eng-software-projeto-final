package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Eletrodo extends ItemConsumivel {
	private String tipoRevestimento;
	
	Eletrodo(){
		super();
	}
	
	Eletrodo(int quantidade, float espessura, float tamanho, String tipoRevestimento){
		super(quantidade, espessura, tamanho);
		this.tipoRevestimento = tipoRevestimento;
	}
	
	public String getTipoRevestimento() {
		return tipoRevestimento;
	}

	public void setTipoRevestimento(String tipoRevestimento) {
		this.tipoRevestimento = tipoRevestimento;
	}

	@Override
	public boolean aceitar(Ferramenta ferramenta) {
		return ferramenta.visitar(this);
	}

}
