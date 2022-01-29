package br.edu.unifei.ecot12.projeto.profissaoSerralheiro;

import java.util.ArrayList;
import java.util.List;

public class Servico {
	private String descricao;
	private float valor;
	private Cliente cliente;
	private List<Material> materiais = new ArrayList<Material>();
	
	Servico(String descricao, float valor, Cliente cliente){
		this.descricao = descricao;
		this.valor = valor;
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public List<Material> getMateriais() {
		return materiais;
	}
	
	public void setMateriais(Material material) {
		this.materiais.add(material);
	} 	
	
	public void setMateriais(List<Material> materiais) {
		this.materiais.addAll(materiais);
	}
	
}
