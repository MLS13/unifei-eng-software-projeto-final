package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Rebitadeira extends Manual {
	
	Rebitadeira(){
		super();
	}
	
	@Override
	public void devolverBancada() {
		if(this.isBancada())
			System.out.println("Rebitadeira ja esta na bancada!");
		else
			System.out.println("A rebitadeira foi colocada na bancada");
		this.setBancada(true);
	}

	@Override
	public void pegarBancada() {
		if(this.isBancada()) {
			System.out.println("A rebitadeira foi pega na bancada");
			this.setBancada(false);
		}else 
			System.out.println("A rebitadeira ja esta em uso");	
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
		if(rebite.getQuantidade()>0) {
			if(rebite.getNumPino() == this.getNumero()) {
				rebite.consumir(1);
				return true;
			}else{
				System.out.println("Rebite incompativel com o pino da rebitadeira!");
				return false;
			}
		}else {
			System.out.println("Sem rebites!");
			return false;
		}
	}

}
