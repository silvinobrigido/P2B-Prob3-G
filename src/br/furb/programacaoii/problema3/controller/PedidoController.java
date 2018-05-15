package br.furb.programacaoii.problema3.controller;

import java.util.List;

import br.furb.programacaoii.problema3.controller.calculo.CalculoEntrega;
import br.furb.programacaoii.problema3.exception.ModalidadeFreteNaoInformadaException;
import br.furb.programacaoii.problema3.exception.TipoEntregaInvalido;
import br.furb.programacaoii.problema3.factory.CalculoFactory;
import br.furb.programacaoii.problema3.factory.ControllerFactory;
import br.furb.programacaoii.problema3.model.ItemPedido;
import br.furb.programacaoii.problema3.model.ModalidadeFrete;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 * Define a camada de controle do {@link Pedido}
 *
 * @author ariel
 */
public class PedidoController extends Controller {

	/**
	 * Calcula o valor da entrega e seta ela no pedido
	 *
	 * @param pedido
	 * @throws TipoEntregaInvalido
	 */
	public void definirValorEntrega(Pedido pedido) throws TipoEntregaInvalido {
		ModalidadeFrete modalidadeFrete = pedido.getModalidadeFrete();
		if (null == modalidadeFrete) {
			throw new ModalidadeFreteNaoInformadaException();
		}

		CalculoEntrega calculoEntrega = CalculoFactory.getCalculoEntrega(modalidadeFrete);
		double valorEntrega = calculoEntrega.calcularValorEntrega(pedido);
		pedido.setValorEntrega(valorEntrega);
	}

	public int getPesoPedido(Pedido pedido) {
		List<ItemPedido> itens = pedido.getItens();
		return ControllerFactory.getController(ItemPedidoController.class).getPesoItens(itens);
	}

}
