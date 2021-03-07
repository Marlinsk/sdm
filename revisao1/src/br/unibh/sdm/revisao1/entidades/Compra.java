package br.unibh.sdm.revisao1.entidades;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Compra {

	private Long id;
	private Date data;
	private Set<ItemCompra> itens;
	private PessoaFisica cliente;
	private PessoaJuridica loja;
	private BigDecimal valorTotal;
	private BigDecimal desconto;
	private BigDecimal valorFrete;
	private BigDecimal valorFinal;
		
	public Compra() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Set<ItemCompra> getItens() {
		return itens;
	}

	public void setItens(Set<ItemCompra> itens) {
		this.itens = itens;
	}

	public PessoaFisica getCliente() {
		return cliente;
	}

	public void setCliente(PessoaFisica cliente) {
		this.cliente = cliente;
	}

	public PessoaJuridica getLoja() {
		return loja;
	}

	public void setLoja(PessoaJuridica loja) {
		this.loja = loja;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", data=" + data + ", itens=" + itens + ", cliente=" + cliente + ", loja=" + loja
				+ ", valorTotal=" + valorTotal + ", desconto=" + desconto + ", valorFrete=" + valorFrete
				+ ", valorFinal=" + valorFinal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((desconto == null) ? 0 : desconto.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itens == null) ? 0 : itens.hashCode());
		result = prime * result + ((loja == null) ? 0 : loja.hashCode());
		result = prime * result + ((valorFinal == null) ? 0 : valorFinal.hashCode());
		result = prime * result + ((valorFrete == null) ? 0 : valorFrete.hashCode());
		result = prime * result + ((valorTotal == null) ? 0 : valorTotal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (desconto == null) {
			if (other.desconto != null)
				return false;
		} else if (!desconto.equals(other.desconto))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itens == null) {
			if (other.itens != null)
				return false;
		} else if (!itens.equals(other.itens))
			return false;
		if (loja == null) {
			if (other.loja != null)
				return false;
		} else if (!loja.equals(other.loja))
			return false;
		if (valorFinal == null) {
			if (other.valorFinal != null)
				return false;
		} else if (!valorFinal.equals(other.valorFinal))
			return false;
		if (valorFrete == null) {
			if (other.valorFrete != null)
				return false;
		} else if (!valorFrete.equals(other.valorFrete))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}
	
	
	
}
