package br.sp.gov.cleiton.financiamento.model;

import java.io.Serializable;

public class Cliente  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nomeCliente;
	private String endereco;
	private String contatos;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String Categoria;
	private Integer valorIntencao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContatos() {
		return contatos;
	}

	public void setContatos(String contatos) {
		this.contatos = contatos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public Integer getValorIntencao() {
		return valorIntencao;
	}

	public void setValorIntencao(Integer valorIntencao) {
		this.valorIntencao = valorIntencao;
	}
	
	
		

}
