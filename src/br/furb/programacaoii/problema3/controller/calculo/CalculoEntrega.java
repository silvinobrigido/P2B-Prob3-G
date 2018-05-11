package br.furb.programacaoii.problema3.controller.calculo;

import br.furb.programacaoii.problema3.model.Pedido;

/**
 * Define a interface de calculo do valor de entrega de um {@link Pedido}
 *
 * @author ariel
 */
public interface CalculoEntrega {

	Double calcularValorEntrega(Pedido pedido);
}
