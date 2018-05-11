package br.furb.programacaoii.problema3.factory;

import br.furb.programacaoii.problema3.controller.calculo.CalculoEntrega;
import br.furb.programacaoii.problema3.controller.calculo.CalculoPAC;
import br.furb.programacaoii.problema3.model.ModalidadeFrete;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 * Define a fabrica de calculadores de valor de entrega para {@link Pedido} por
 * {@link ModalidadeFrete}
 *
 * @author ariel
 */
public abstract class CalculoFactory {

	public static CalculoEntrega getCalculoEntrega(ModalidadeFrete modalidade) {
		switch (modalidade) {
		case PAC:
			return CalculoPAC.getInstance();
		case RETIRADA_LOCAL:
			return CalculoRetiradaLocal.getInstance();
		case SEDEX:
			return CalculoSedex.getInstance();
		}
	}
}