package br.unibh.sdm.revisao1;

import java.math.BigDecimal;
import java.util.HashSet;

import br.unibh.sdm.revisao1.entidades.Categoria;
import br.unibh.sdm.revisao1.entidades.Compra;
import br.unibh.sdm.revisao1.entidades.ItemCompra;
import br.unibh.sdm.revisao1.entidades.PessoaFisica;
import br.unibh.sdm.revisao1.entidades.PessoaJuridica;
import br.unibh.sdm.revisao1.entidades.Produto;
import br.unibh.sdm.revisao1.negocio.CaixaImpl;

public class Main {

	public static void main(String args[]) {
		
		System.out.println("Olá Mundo!");
		
		PessoaFisica cliente = new PessoaFisica(1L, "João da Silva", "Rua A", "joao@mail", "3334444", "2312312312", "2342342", null);
		System.out.println(cliente);
		
		PessoaJuridica loja = new PessoaJuridica(1L, "Dell", "Rua X", "dell@mail", "23423423", "34234234", "2134112312", null);
		System.out.println(loja);
		
		Categoria cat1 = new Categoria(1L, "Notebooks");  
		Produto p1 = new Produto(1L, "Notebook XYZ", null, new BigDecimal(5000), cat1, loja);
		Categoria cat2 = new Categoria(2L, "Impressoras");
		Produto p2 = new Produto(1L, "EcoTank", null, new BigDecimal(1200), cat2, loja);
		System.out.println(p1);
		System.out.println(p2);
		
		HashSet<ItemCompra> itens = new HashSet<ItemCompra>();
		itens.add(new ItemCompra(p1, 5));
		itens.add(new ItemCompra(p2, 1));
		
		CaixaImpl caixa = new CaixaImpl();
		Compra compra = caixa.registar(itens, cliente, loja, new BigDecimal(100), new BigDecimal(500));
		System.out.println(compra);
		
	}

}

