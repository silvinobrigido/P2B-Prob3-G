package br.furb.programacaoii.problema3.controller.calculo;

import br.furb.programacaoii.problema3.exception.TipoEntregaInvalido;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 * @author silvinos
 */
public class CalculoSedex implements CalculoEntrega {

	private static CalculoSedex instance;

	private CalculoSedex() {
	}

	public static CalculoEntrega getInstance() {
		if (null == instance) {
			instance = new CalculoSedex();
		}
		return instance;
	}

	@Override
	public double calcularValorEntrega(Pedido pedido) throws TipoEntregaInvalido {
		return 0D;
	}

}
