package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

public class Cliente extends Pessoa {
	private String endereco;
	private String numeroCasa;
	private String cidade;
	private String cep;
	
	Cliente() {
		nome = null;
		cpf = null;
		telefone = null;
		email = null;
		endereco = null;
		numeroCasa = null;
		cidade = null;
		cep = null;
	}
	
	Cliente(String nome, String cpf, String telefone, String email, String endereco, String numeroCasa, String cidade, String cep){
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.cep = cep;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNumeroCasa() {
		return numeroCasa;
	}
	
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
