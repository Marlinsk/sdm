package br.unibh.sdm.revisao1.entidades;

import java.util.Date;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String rg;
	private Date dataNascimento;
	
	public PessoaFisica() {
		super();
	}
	

	public PessoaFisica(Long id, String nome, String endereco, String email, String telefone, String cpf, String rg,
			Date dataNascimento) {
		super(id, nome, endereco, email, telefone);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", getId()=" + getId()
				+ ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco() + ", getEmail()=" + getEmail()
				+ ", getTelefone()=" + getTelefone() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}
	
	
	
}
