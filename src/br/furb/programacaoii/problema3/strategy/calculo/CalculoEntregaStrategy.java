package br.furb.programacaoii.problema3.strategy.calculo;

import br.furb.programacaoii.problema3.exception.TipoEntregaInvalido;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 * Define a interface de calculo do valor de entrega de um {@link Pedido}
 *
 * @author ariel
 */
public interface CalculoEntregaStrategy {

	double calcularValorEntrega(Pedido pedido) throws TipoEntregaInvalido;
}
