package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Chave extends Manual {
	
	Chave(int numero){
		super(numero);	
	}
	
	@Override
	public void devolverBancada() {
		if(this.isBancada())
			System.out.println("Chave ja esta na bancada!");
		else
			System.out.println("A chave foi colocada na bancada");
		this.setBancada(true);
	}

	@Override
	public void pegarBancada() {
		if(this.isBancada()) {
			System.out.println("A chave foi pega na bancada");
			this.setBancada(false);
		}
		else
			System.out.println("A chave ja esta em uso");		
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
		if(parafuso.getQuantidade()>0) {
			if(parafuso.getNumParafuso() == this.getNumero()) {//Compara se o numero da chave e igual ao do parafuso
				parafuso.consumir(1);
				return true;
			}else
				System.out.println("Parafuso incorreto!");
				return false;
		}else {
			//System.out.println("Sem parafusos!");
			return false;
		}
	}

	@Override
	public boolean visitar(Rebite rebite) {
		// TODO Auto-generated method stub
		return false;
	}

}
