package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

import java.util.ArrayList;
import java.util.List;

public class Serralheiro extends Pessoa {
	private List<Servico> servicos = new ArrayList<Servico>();
	private List<Material> estoque = new ArrayList<Material>();
	private List<ItemConsumivel> listaItensConsumiveis = new ArrayList<ItemConsumivel>();
	private List<Ferramenta> ferramentas = new ArrayList<Ferramenta>();
	
	Serralheiro(){
		nome = null;
		cpf = null;
		telefone = null;
		email = null;
	}
	
	Serralheiro(String nome, String cpf, String telefone, String email){
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}
	
	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos.addAll(servicos);
	}
	
	public void setServicos(Servico servico) {
		this.servicos.add(servico);
	}

	public List<Material> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Material> estoque) {
		this.estoque.addAll(estoque);
	}
	
	public void setEstoque(Material estoque) {
		this.estoque.add(estoque);
	}

	public List<ItemConsumivel> getListaItensConsumiveis() {
		return listaItensConsumiveis;
	}

	public void setListaItensConsumiveis(List<ItemConsumivel> listaItensConsumiveis) {
		this.listaItensConsumiveis.addAll(listaItensConsumiveis);
	}
	
	public void setListaItensConsumiveis(ItemConsumivel ItemConsumivel) {
		this.listaItensConsumiveis.add(ItemConsumivel);
	}

	public List<Ferramenta> getFerramentas() {
		return ferramentas;
	}

	public void setFerramentas(List<Ferramenta> ferramentas) {
		this.ferramentas.addAll(ferramentas);
	}
	
	public void setFerramentas(Ferramenta ferramenta) {
		this.ferramentas.add(ferramenta);
	}
	
	public void consultaEstoque() {
		boolean executar = true;
		
		for(Servico servico: servicos) {
			System.out.println("Cliente: " + servico.getCliente().getNome());
			System.out.println("Descrição:  " + servico.getDescricao());
			executar = true;
			for(Material material: servico.getMateriais()) {
				if(material instanceof Barra) {	
					boolean encontrou = false;
					for(Material materialEstoque: estoque) {
						if(materialEstoque instanceof Barra) {
							if(material.getEspessura() == materialEstoque.getEspessura()) {
								encontrou = true;
								if(material.getQuantidade() > materialEstoque.getQuantidade()) {
									System.out.println("Necessario comprar " + (material.getQuantidade() - materialEstoque.getQuantidade()) + " barras de espessura " + material.getEspessura());
									executar = false;
									break;
								}else break;
								
							}
						}
					}
					
					if(!encontrou) {
						System.out.println("Necessario comprar " + material.getQuantidade() + " barras de espessura " + material.getEspessura());
						executar = false;
					}
				}
				
				if(material instanceof Metalon) {
					boolean encontrou = false;
					for(Material materialEstoque: estoque) {
						if(materialEstoque instanceof Metalon) {
							if(material.getEspessura() == materialEstoque.getEspessura()) {
								encontrou = true;
								if(material.getQuantidade() > materialEstoque.getQuantidade()) {
									System.out.println("Necessario comprar " + (material.getQuantidade() - materialEstoque.getQuantidade()) + " metalons de espessura " + material.getEspessura());
									executar = false;
									break;
								}else break;
								
							}
						}
					}
					if(!encontrou) {
						System.out.println("Necessario comprar " + material.getQuantidade() + " metalons de espessura " + material.getEspessura());
						executar = false;
					}
				}

				if(material instanceof Chapa) {
					boolean encontrou = false;
					for(Material materialEstoque: estoque) {
						if(materialEstoque instanceof Chapa) {
							if(material.getEspessura() == materialEstoque.getEspessura()) {
								encontrou = true;
								if(material.getQuantidade() > materialEstoque.getQuantidade()) {
									System.out.println("Necessario comprar " + (material.getQuantidade() - materialEstoque.getQuantidade()) + " chapas de espessura " + material.getEspessura());
									executar = false;
									break;
								}else break;
								
							}
						}
					}
					if(!encontrou) {
						System.out.println("Necessario comprar " + material.getQuantidade() + " chapas de espessura " + material.getEspessura());
						executar = false;
					}
				}

				if(material instanceof Telha) {
					boolean encontrou = false;
					for(Material materialEstoque: estoque) {
						if(materialEstoque instanceof Telha) {
							if(material.getEspessura() == materialEstoque.getEspessura()) {
								encontrou = true;
								if(material.getQuantidade() > materialEstoque.getQuantidade()) {
									System.out.println("Necessario comprar " + (material.getQuantidade() - materialEstoque.getQuantidade()) + " telhas de espessura " + material.getEspessura());
									executar = false;
									break;
								}else break;
								
							}
						}
					}
					if(!encontrou) {
						System.out.println("Necessario comprar " + material.getQuantidade() + " telhas de espessura " + material.getEspessura());
						executar = false;
					}
				}
			}
			
			if(executar) {
				System.out.println("E possivel executar este servico com o estoque atual");		
			}else {
				System.out.println("NAO e possivel executar este servico com o estoque atual");
				
			}
			
		}
		
		
		
	}
	
	public void cortar(int tensaoTomada, float espessuraDisco) {
		//Procurar por esmerilhadeira nas ferramentas
		boolean encontrou = false;
		boolean cortou = false;
		for(Ferramenta ferramenta: ferramentas) {
			if(ferramenta instanceof Esmerilhadeira) {
				Esmerilhadeira esmerilhadeira = ((Esmerilhadeira) ferramenta);
				if(esmerilhadeira.ligar(tensaoTomada)) {//Se ligar, busca um disco e manda cortar
					encontrou = true;
					for(ItemConsumivel item: listaItensConsumiveis) {
						if(item.getEspessura() == espessuraDisco)//Busca disco com espessura x
							if(item.aceitar(esmerilhadeira)) {
								System.out.println("Cortou...");
								cortou = true;
								break;
							}
					}
					esmerilhadeira.desligar();
					if(!cortou) System.out.println("Sem discos disponiveis");//Se não encontrou disco 
					break;
				}
			}
		}
		
		if(!encontrou)
			System.out.print("Não temos esmerilhadeira compativel com a tensao!");
		
	}
	
	public void esmerilhar(int tensaoTomada, float espessuraDisco) {
		//Procurar por esmerilhadeira nas ferramentas
		boolean cortou = false;
		for(Ferramenta ferramenta: ferramentas) {
			if(ferramenta instanceof Esmerilhadeira) {
				Esmerilhadeira esmerilhadeira = ((Esmerilhadeira) ferramenta);
				if(esmerilhadeira.ligar(tensaoTomada)) {//Se ligar, busca um disco e manda cortar
					for(ItemConsumivel item: listaItensConsumiveis) {
						if(item.getEspessura() == espessuraDisco)//Busca disco com espessura x
							if(item.aceitar(esmerilhadeira)) {
								System.out.println("Esmerilhou...");
								cortou = true;
								break;
							}
					}
					esmerilhadeira.desligar();
					if(!cortou) System.out.println("Sem discos disponiveis");//Se não encontrou disco 
					break;
				}
			}
		}
	}
	
	public void furar(int tensaoTomada, float espessuraFuro) {
		//Procurar por furadeira nas ferramentas
		boolean encontrou = false;
		boolean furou = false;
		for(Ferramenta ferramenta: ferramentas) {
			if(ferramenta instanceof Furadeira) {
				Furadeira furadeira = ((Furadeira) ferramenta);
				if(furadeira.ligar(tensaoTomada)) {//Se ligar, busca uma broca e manda furar
					encontrou = true;
					for(ItemConsumivel item: listaItensConsumiveis) {
						if(item.getEspessura() == espessuraFuro)//Busca broca com espessura x, para realizar um furo na espessura desejada
							if(item.aceitar(furadeira)) {
								System.out.println("Furou...");
								furou = true;
								break;
							}
					}
					furadeira.desligar();		
					if(!furou) System.out.println("Sem broca disponiveis");//Se não encontrou broca 
					break;
				}
			}
		}
		
		if(!encontrou)
			System.out.print("Sem furadeira compativel com a tensao!");
	}
	
	public void soldar(int tensaoTomada, float espessuraEletrodo) {
		//Procurar por uma maquina de solda nas ferramentas
		boolean encontrou = false;
		boolean soldou = false;
		for(Ferramenta ferramenta: ferramentas) {
			if(ferramenta instanceof MaquinaSolda) {
				MaquinaSolda maquinaSolda = ((MaquinaSolda) ferramenta);
				if(maquinaSolda.ligar(tensaoTomada)) {//Se ligar, busca um eletrodo
					encontrou = true;
					for(ItemConsumivel item: listaItensConsumiveis) {
						if(item.getEspessura() == espessuraEletrodo)//Busca eletrodo especifico
							if(item.aceitar(maquinaSolda)) {
								System.out.println("Soldou...");
								soldou = true;
								break;
							}
					}
						
					maquinaSolda.desligar();
					if(!soldou) System.out.println("Sem eletrodos");//Se não encontrou broca 
					break;
				}
			}
		}
		
		if(!encontrou)
			System.out.print("Sem maquina de solda compativel com a tensao!");		
	}
	
	public void apertar() {
		//Busca alicate nas ferramentas
		boolean encontrou = false;
		for(Ferramenta ferramenta: ferramentas) {
			if(ferramenta instanceof Alicate) {
				Alicate alicate = ((Alicate) ferramenta);
				encontrou = true;
				alicate.pegarBancada();
				System.out.println("Apertou...");
				alicate.devolverBancada();
				break;
			}
		}
		
		if(!encontrou)
			System.out.print("Nao possui alicate!");
	}
	
	public void cochar(int numParafuso) {
		//Procurar por chave nas ferramentas
		boolean encontrou = false;
		boolean cochou = false;
		for(Ferramenta ferramenta: ferramentas) {
			if(ferramenta instanceof Chave) {
				Chave chave = ((Chave) ferramenta);
				if(chave.getNumero() == numParafuso) {
					encontrou = true;
					for(ItemConsumivel item: listaItensConsumiveis) {						
						if(item.aceitar(chave)) {
							System.out.println("Cochou...");
							cochou = true;
							break;
						}
					}
					
					if(!cochou) System.out.println("Sem parafuso disponivel na medida desejada!");//Se nao encontrou parafuso
					break;
				}
			}
		}
		
		if(!encontrou)
			System.out.print("Nao possui chave na numeracao do parafuso!");	//Nao encontrou chave
					
	}
	
	public void descochar(Parafuso parafuso) {
		//Procurar por chave nas ferramentas
		boolean encontrou = false;
		boolean inseriu = false;
		for(Ferramenta ferramenta: ferramentas) {
			if(ferramenta instanceof Chave) {
				Chave chave = ((Chave) ferramenta);
				if(chave.getNumero() == parafuso.getNumParafuso()) {
					encontrou = true;
					System.out.println("Descochou...");
					
					for(ItemConsumivel item: listaItensConsumiveis) {	//Acrescentar parafuso na lista de itens					
						if(item instanceof Parafuso) {
							Parafuso parafusoList = ((Parafuso) item);
							if(parafusoList.getNumParafuso() == parafuso.getNumParafuso()) {
								parafusoList.inserirConsumivel(1);	
								inseriu = true;
								break;
							}

						}
					}
					
					if(!inseriu) 
						listaItensConsumiveis.add(parafuso);//se nao existia um parafuso com as caracteristicas do retirado, insere ele na lista					
					
					break;
				}
			}
		}
		
		if(!encontrou)
			System.out.print("Nao possui chave na numeracao do parafuso!");	//Nao encontrou chave		
	}
	
	public void martelar() {
		//Busca alicate nas ferramentas
		boolean encontrou = false;
		for(Ferramenta ferramenta: ferramentas) {
			if(ferramenta instanceof Martelo) {
				Martelo martelo = ((Martelo) ferramenta);
				encontrou = true;
				martelo.pegarBancada();
				System.out.println("Martelou...");
				martelo.devolverBancada();
				break;
			}
		}
		
		if(!encontrou)
			System.out.print("Nao possui martelo!");		
	}
	
	public void rebitar(float espessuraRebite) {
		//Procurar por rebitadeira nas ferramentas
		boolean encontrou = false;
		boolean rebitou = false;
		for(Ferramenta ferramenta: ferramentas) {
			if(ferramenta instanceof Rebitadeira) {
				Rebitadeira rebitadeira = ((Rebitadeira) ferramenta);
				encontrou = true;
				
				for(ItemConsumivel item: listaItensConsumiveis) {
					if(item.getEspessura() == espessuraRebite)//Busca rebite com espessura x
						if(item.aceitar(rebitadeira)) {
							System.out.println("Rebitou...");
							rebitou = true;
								break;
						}
				}
							
				if(!rebitou) System.out.println("Sem rebite disponivel na espessura desejada");//Se nao encontrou rebite 
				break;
			}
		}
		
		if(!encontrou)
			System.out.print("Nao possui rebitadeira");		
	}
}
