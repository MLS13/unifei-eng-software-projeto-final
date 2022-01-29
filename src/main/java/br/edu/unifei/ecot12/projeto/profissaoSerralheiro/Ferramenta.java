package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public abstract class Ferramenta {
	public abstract boolean visitar(Broca broca);
	public abstract boolean visitar(Disco disco);
	public abstract boolean visitar(Eletrodo eletrodo);
	public abstract boolean visitar(Parafuso parafuso);
	public abstract boolean visitar(Rebite rebite);
}
