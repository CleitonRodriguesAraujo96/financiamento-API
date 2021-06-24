package br.sp.gov.cleiton.financiamento.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class ClienteDto implements Serializable {
	
	
	private static final long serialVersionUID = 1L;	
	private Long id;
	@NotBlank
	private String nomeCliente;
	@NotBlank
	private String endereco;
	private Integer nCasa;
	private String Cidade;
	private Integer cep;
	private String contatos;
	@NotNull
	private Integer cpf;
	private String rg;
	private String dataNascimento;
	private String Email;
	private String telefoneResidencial;
	private Integer quantidadeParcelas;
	private Integer Salario;
	private String Categoria;
	private Integer valorIntencao;	
	

	public Integer getnCasa() {
		return nCasa;
	}
	public void setnCasa(Integer nCasa) {
		this.nCasa = nCasa;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}
	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}
	public Integer getSalario() {
		return Salario;
	}
	public void setSalario(Integer salario) {
		Salario = salario;
	}
	
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
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
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