package br.furb.programacaoii.problema3.strategy.calculo;

import br.furb.programacaoii.problema3.exception.TipoEntregaInvalido;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 * @author silvinos
 */
public class CalculoSedex implements CalculoEntregaStrategy {

	private static CalculoSedex instance;

	private CalculoSedex() {
	}

	public static CalculoEntregaStrategy getInstance() {
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
