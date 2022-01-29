package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class MaquinaSolda extends Eletrica {
	
	MaquinaSolda(){
		super();
	}
	
	MaquinaSolda(int tensao, boolean bivolt){
		super(tensao, bivolt);
	}
	
	@Override
	public boolean ligar(int tensao) {
		if(this.bivolt) {
			System.out.println("Maquina de solda foi ligada!");
			return true;
		} else if(this.tensao == tensao) {
			System.out.println("Maquina de solda foi ligada!");
			return true;			
		} else
			System.out.println("Maquina de solda não foi ligada, tensões diferentes!");
		
		return false;
	}

	@Override
	public void desligar() {
		System.out.println("Maqunia de solda foi desligada!");
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
		if(eletrodo.getQuantidade()>0) {
			eletrodo.consumir(1);
			return true;
		}else return false;
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
