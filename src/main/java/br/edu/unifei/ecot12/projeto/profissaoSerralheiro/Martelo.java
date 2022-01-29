package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Martelo extends Manual {
	private boolean borracha;
	Martelo(){
		super();
	}
	
	public boolean isBorracha() {
		return borracha;
	}

	public void setBorracha(boolean borracha) {
		this.borracha = borracha;
	}

	@Override
	public void devolverBancada() {
		if(this.isBancada())
			System.out.println("Martelo ja esta na bancada!");
		else
			System.out.println("O martelo foi colocado na bancada");
		this.setBancada(true);
	}

	@Override
	public void pegarBancada() {
		if(this.isBancada()) {
			System.out.println("O martelo foi pego na bancada");
			this.setBancada(false);
		}else 
			System.out.println("O martelo ja esta em uso");	
	}

	@Override
	public boolean visitar(Broca broca) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitar(Disco disco) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitar(Eletrodo eletrodo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitar(Parafuso parafuso) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitar(Rebite rebite) {
		// TODO Auto-generated method stub
		return false;
	}

}
