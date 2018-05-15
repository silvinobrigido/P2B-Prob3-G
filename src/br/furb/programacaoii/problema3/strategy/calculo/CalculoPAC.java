package br.furb.programacaoii.problema3.strategy.calculo;

import br.furb.programacaoii.problema3.controller.PedidoController;
import br.furb.programacaoii.problema3.exception.TipoEntregaInvalido;
import br.furb.programacaoii.problema3.factory.ControllerFactory;
import br.furb.programacaoii.problema3.model.ModalidadeFrete;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 * Define a classe de calculo de entrega da {@link ModalidadeFrete} PAC
 *
 * @author ariel
 */
public class CalculoPAC implements CalculoEntregaStrategy {

	private static final int UM_KG = 1000;
	private static final int DOIS_KG = 2000;
	private static final int TRES_KG = 3000;
	private static final int CINCO_KG = 5000;

	private static final Double DEZ_REAIS = 10D;
	private static final Double QUINZE_REAIS = 15D;
	private static final Double VINTE_REAIS = 20D;
	private static final Double TRINTA_REAIS = 30D;

	private static CalculoPAC instance;

	private CalculoPAC() {
	}

	public static CalculoPAC getInstance() {
		if (null == instance) {
			instance = new CalculoPAC();
		}
		return instance;
	}

	@Override
	public double calcularValorEntrega(Pedido pedido) throws TipoEntregaInvalido {
		int pesoPedido = ControllerFactory.getController(PedidoController.class).getPesoPedido(pedido);
		if (UM_KG >= pesoPedido) {
			return DEZ_REAIS;
		} else if (DOIS_KG >= pesoPedido) {
			return QUINZE_REAIS;
		} else if (TRES_KG >= pesoPedido) {
			return VINTE_REAIS;
		} else if (CINCO_KG >= pesoPedido) {
			return TRINTA_REAIS;
		}

		throw new TipoEntregaInvalido();
	}

}
