package br.unibh.sdm.revisao1.negocio;

import java.math.BigDecimal;
import java.util.Set;

import br.unibh.sdm.revisao1.entidades.Compra;
import br.unibh.sdm.revisao1.entidades.ItemCompra;
import br.unibh.sdm.revisao1.entidades.PessoaFisica;
import br.unibh.sdm.revisao1.entidades.PessoaJuridica;

public interface Caixa {

	public Compra registar(Set<ItemCompra> itens, PessoaFisica cliente, PessoaJuridica loja, BigDecimal frete, BigDecimal desconto);
	public Compra cancelar(Compra compra);
	
}
