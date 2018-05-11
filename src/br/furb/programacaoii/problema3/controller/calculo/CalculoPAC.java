package br.furb.programacaoii.problema3.controller.calculo;

import br.furb.programacaoii.problema3.model.ModalidadeFrete;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 * Define a classe de calculo de entrega da {@link ModalidadeFrete} PAC
 *
 * @author ariel
 */
public class CalculoPAC implements CalculoEntrega {

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
	public Double calcularValorEntrega(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}

}
