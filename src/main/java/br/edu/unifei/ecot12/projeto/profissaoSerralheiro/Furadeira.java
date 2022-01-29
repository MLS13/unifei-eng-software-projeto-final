package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

import java.util.Random;

public class Furadeira extends Eletrica {
	
	Furadeira(){
		super();
	}
	
	Furadeira(int tensao, boolean bivolt){
		super(tensao, bivolt);
	}
	
	@Override
	public boolean ligar(int tensao) {
		if(this.bivolt) {
			System.out.println("Furadeira foi ligada!");
			return true;
		} else if(this.tensao == tensao) {
			System.out.println("Furadeira foi ligada!");
			return true;
		}else
			System.out.println("Furadeira não foi ligada, tensões diferentes!");
		return false;
	}

	@Override
	public void desligar() {
		System.out.println("Furadeira foi desligada!");
	}

	@Override
	public boolean visitar(Broca broca) {
		if(broca.getQuantidade()>0) {
			Random quebrou =  new Random();
			if(quebrou.nextInt(10) > 7 ) { //Se random maior que 7, a broca quebra no processo de furar.
				broca.consumir(1);
				System.out.println("Broca quebrou!");
			}else
				broca.consumir(0);
			return true;
			
		}else return false;	
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
