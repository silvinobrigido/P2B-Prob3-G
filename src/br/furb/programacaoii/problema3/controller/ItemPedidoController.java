package br.furb.programacaoii.problema3.controller;

import java.util.Collection;

import br.furb.programacaoii.problema3.model.ItemPedido;

/**
 * Define a camada de controle do {@link ItemPedido}
 *
 * @author ariel
 */
public class ItemPedidoController extends Controller {

	public int getPesoItens(Collection<ItemPedido> itens) {
		return itens.stream() //
				.map(item -> getPesoItem(item)) //
				.reduce(Integer::sum) //
				.orElse(0);
	}

	public int getPesoItem(ItemPedido itemPedido) {
		return itemPedido.getQuantidade() * itemPedido.getProduto().getPeso();
	}

}
