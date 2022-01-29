package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Alicate extends Manual {
	private boolean pressao;
	Alicate(){
		super();
	}
	
	public boolean isPressao() {
		return pressao;
	}

	public void setPressao(boolean pressao) {
		this.pressao = pressao;
	}

	@Override
	public void devolverBancada() {
		if(this.isBancada())
			System.out.println("Alicate ja esta na bancada!");
		else
			System.out.println("O alicate foi colocado na bancada");
		this.setBancada(true);
	}

	@Override
	public void pegarBancada() {
		if(this.isBancada()) {
			System.out.println("O alicate foi pego na bancada");
			this.setBancada(false);
		}else 
			System.out.println("O alicate ja esta em uso");		
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
