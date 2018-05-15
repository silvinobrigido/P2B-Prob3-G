package br.furb.programacaoii.problema3.factory;

import br.furb.programacaoii.problema3.strategy.calculo.CalculoEntregaStrategy;
import br.furb.programacaoii.problema3.strategy.calculo.CalculoPAC;
import br.furb.programacaoii.problema3.strategy.calculo.CalculoRetiradaLocal;
import br.furb.programacaoii.problema3.strategy.calculo.CalculoSedex;
import br.furb.programacaoii.problema3.exception.ModalidadeFreteNaoInformadaException;
import br.furb.programacaoii.problema3.model.ModalidadeFrete;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 * Define a fabrica de calculadores de valor de entrega para {@link Pedido} por
 * {@link ModalidadeFrete}
 *
 * @author ariel
 */
public abstract class CalculoFactory {

	public static CalculoEntregaStrategy getCalculoEntrega(ModalidadeFrete modalidade) {
		if (null == modalidade) {
			throw new ModalidadeFreteNaoInformadaException();
		}

		switch (modalidade) {
		case PAC:
			return CalculoPAC.getInstance();
		case RETIRADA_LOCAL:
			return CalculoRetiradaLocal.getInstance();
		case SEDEX:
			return CalculoSedex.getInstance();
		default:
			return null;
		}
	}
}
