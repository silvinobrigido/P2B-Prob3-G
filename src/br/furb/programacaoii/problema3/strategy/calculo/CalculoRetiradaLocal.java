/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.programacaoii.problema3.strategy.calculo;

import br.furb.programacaoii.problema3.exception.TipoEntregaInvalido;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 * @author silvinos
 */
public class CalculoRetiradaLocal implements CalculoEntregaStrategy {

	private static CalculoRetiradaLocal instance;

	private CalculoRetiradaLocal() {
	}

	public static CalculoEntregaStrategy getInstance() {
		if (null == instance) {
			instance = new CalculoRetiradaLocal();
		}
		return instance;
	}

	@Override
	public double calcularValorEntrega(Pedido pedido) throws TipoEntregaInvalido {
		return 0D;
	}

}
