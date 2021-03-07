package br.unibh.sdm.revisao1.entidades;

import java.util.Date;

public class PessoaJuridica extends Pessoa {

	private String inscricaoEstadual;
	private String cnpj;
	private Date dataConstituicao;
	
	public PessoaJuridica() {
		super();
	}
	

	public PessoaJuridica(Long id, String nome, String endereco, String email, String telefone,
			String inscricaoEstadual, String cnpj, Date dataConstituicao) {
		super(id, nome, endereco, email, telefone);
		this.inscricaoEstadual = inscricaoEstadual;
		this.cnpj = cnpj;
		this.dataConstituicao = dataConstituicao;
	}


	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getDataConstituicao() {
		return dataConstituicao;
	}

	public void setDataConstituicao(Date dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [inscricaoEstadual=" + inscricaoEstadual + ", cnpj=" + cnpj + ", dataConstituicao="
				+ dataConstituicao + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getEndereco()="
				+ getEndereco() + ", getEmail()=" + getEmail() + ", getTelefone()=" + getTelefone() + ", toString()="
				+ super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((dataConstituicao == null) ? 0 : dataConstituicao.hashCode());
		result = prime * result + ((inscricaoEstadual == null) ? 0 : inscricaoEstadual.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (dataConstituicao == null) {
			if (other.dataConstituicao != null)
				return false;
		} else if (!dataConstituicao.equals(other.dataConstituicao))
			return false;
		if (inscricaoEstadual == null) {
			if (other.inscricaoEstadual != null)
				return false;
		} else if (!inscricaoEstadual.equals(other.inscricaoEstadual))
			return false;
		return true;
	}
	
	
	
}
