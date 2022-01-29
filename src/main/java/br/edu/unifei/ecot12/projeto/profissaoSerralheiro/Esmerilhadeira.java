package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Esmerilhadeira extends Eletrica {	
	
	Esmerilhadeira(){
		super();
	}
	
	Esmerilhadeira(int tensao, boolean bivolt){
		super(tensao, bivolt);
	}
	
	@Override
	public boolean ligar(int tensao) {
		if(this.bivolt) {
			System.out.println("Esmerilhadeira foi ligada!");
			return true;
		} else if(this.tensao == tensao) {
			System.out.println("Esmerilhadeira foi ligada!");
			return true;
		} else {
			System.out.println("Esmerilhadeira não foi ligada, tensões diferentes!");
			return false;
		}
	}

	@Override
	public void desligar() {
		System.out.println("Esmerilhadeira foi desligada!");
	}
	
	@Override
	public boolean visitar(Disco disco) {
		if(disco.getQuantidade()>0) {
			disco.consumir(1);
			return true;			
		}else return false;		
	}

	@Override
	public boolean visitar(Broca broca) {
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
