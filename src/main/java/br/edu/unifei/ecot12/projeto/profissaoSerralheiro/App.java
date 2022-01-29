package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//Criando Clientes		
		Cliente gustavo = new Cliente("Gustavo", "123456789" , "35912349876", "gustavo@gmail.com", "Rua 1", "46B", "Itajuba", "37440-999" );
		Cliente ademilson = new Cliente("Ademilson", "123456999" , "35912342468", "ademilsono@hotmail.com", "Rua 2", "100", "Itajuba", "37440-999" );
		Cliente leonardo = new Cliente("Leonardo", "432156789" , "35913579246", "leonardo@gmail.com", "Rua 3", "10A", "Itajuba", "37440-999" );
		
		//Criando materiais p/ serivico
		Barra barra01 = new Barra(10, (float)1.0, (float)6, "Redondo");
		Barra barra02 = new Barra(2, (float)1.5, (float)6, "Quadrado");
		Chapa chapa01 = new Chapa(1, (float)0.2, (float)5, "Fina");
		Chapa chapa02 = new Chapa(3, (float)0.3, (float)5, "Fina");
		Metalon metalon01 = new Metalon(2, (float)1.0, (float)6, 40);
		Metalon metalon02 = new Metalon(3, (float)1.0, (float)6, 50);
		Telha telha01 = new Telha(20, (float)0.3, (float)10, "Ondulada");
		Telha telha02 = new Telha(30, (float)0.4, (float)20, "Ondulada");
		
		//Criando servicos
		Servico servico01 = new Servico("Portao", (float) 1200, gustavo);
		servico01.setMateriais(metalon01);
		servico01.setMateriais(chapa02);
		Servico servico02 = new Servico("Grade", (float) 950, leonardo);
		servico02.setMateriais(barra01);
		Servico servico03 = new Servico("Cobertura",(float) 2300, ademilson);
		servico03.setMateriais(telha02);
		
		//Criando list de estoque
		List<Material> estoque = new ArrayList<Material>();
		estoque.add(telha02);
		estoque.add(telha01);
		estoque.add(barra01);
		estoque.add(barra02);
		estoque.add(chapa01);
		estoque.add(metalon01);
		estoque.add(metalon02);
		
		//Criando ferramentas
		Esmerilhadeira esmerilhadeira = new Esmerilhadeira(127, false);
		MaquinaSolda maquinaDeSolda = new MaquinaSolda(220, true);
		Chave chave10 = new Chave(10);
		Chave chave12 = new Chave(12);
		Martelo martelo = new Martelo();
		Furadeira furadeira = new Furadeira(220, false);
		Alicate alicate = new Alicate();
		Rebitadeira rebitadeira = new Rebitadeira();
		//List ferramentas
		List<Ferramenta> ferramentas = new ArrayList<Ferramenta>();
		ferramentas.add(martelo);
		ferramentas.add(chave12);
		ferramentas.add(chave10);
		ferramentas.add(maquinaDeSolda);
		ferramentas.add(esmerilhadeira);
		ferramentas.add(rebitadeira);
		ferramentas.add(alicate);
		ferramentas.add(furadeira);
		
		//Itens consumiveis
		Parafuso parafuso10 = new Parafuso(10, (float)2.5, (float) 4, 10);
		Parafuso parafuso12 = new Parafuso(1, (float)2.8, (float) 9, 12);
		Eletrodo eletrodo = new Eletrodo(10, (float)1.2, (float)8, "Duplo");
		Disco disco = new Disco(2, (float)0.7, (float)4, "Corte");
		//List consumiveis
		List<ItemConsumivel> itens = new ArrayList<ItemConsumivel>();
		itens.add(eletrodo);
		itens.add(disco);
		itens.add(parafuso10);
		
		
		//Criando serralheiro
		Serralheiro serralheiro = new Serralheiro("Joao", "123456789" , "35912349876", "joao@gmail.com");
		serralheiro.setFerramentas(ferramentas);
		serralheiro.setListaItensConsumiveis(itens);
		serralheiro.setEstoque(estoque);
		serralheiro.setServicos(servico01);
		serralheiro.setServicos(servico02);
		serralheiro.setServicos(servico03);
		
		
		//Teste operacoes
		System.out.println("\n \nVerificar se é possível executar serviço, com o estoque atual:");
		serralheiro.consultaEstoque();
		//Apertar
		System.out.println("\n \nRealizar aperto:");
		serralheiro.apertar();
		//Cochar
		System.out.println("\n \nCochar parafuso:");
		serralheiro.cochar(12);
		//Descochar
		System.out.println("\n \nDescochar parafuso:");
		serralheiro.descochar(parafuso12);
		//Cortar
		System.out.println("\n \nRealizar corte:");
		System.out.println("Quantidade de discos: " + disco.getQuantidade());
		serralheiro.cortar(127, (float) 0.7);
		System.out.println("Quantidade de discos: " + disco.getQuantidade());
		//Furar
		System.out.println("\n \nRealizar furo:");
		serralheiro.furar(220, (float) 1.2);
		//Esmerilhar
		System.out.println("\n \nEsmerilhar:");
		serralheiro.esmerilhar(220, (float) 10);
		//Martelar
		System.out.println("\n \nMartelar algo:");
		serralheiro.martelar();
		//Rebitar
		System.out.println("\n \nRebitar chapa:");
		serralheiro.rebitar((float)1.2);
		//Soldar
		System.out.println("\n \nSoldar:");
		serralheiro.soldar(220, (float)1.2);
		
		
	}

}
