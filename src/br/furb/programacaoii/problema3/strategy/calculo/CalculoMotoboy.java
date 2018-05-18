/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.programacaoii.problema3.strategy.calculo;

import br.furb.programacaoii.problema3.controller.PedidoController;
import br.furb.programacaoii.problema3.exception.TipoEntregaInvalido;
import br.furb.programacaoii.problema3.factory.ControllerFactory;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 *
 * @author jardelangelo
 */
public class CalculoMotoboy implements CalculoEntregaStrategy {

    private static CalculoMotoboy instance;

    private CalculoMotoboy() {
        
    }

    public static CalculoMotoboy getInstance() {
        if (null == instance) {
            instance = new CalculoMotoboy();
        }
        return instance;
    }

    @Override
    public double calcularValorEntrega (Pedido pedido) throws TipoEntregaInvalido {
        int pesoPedido = ControllerFactory.getController(PedidoController.class).getPesoPedido(pedido);

        if (pesoPedido > 25 || pedido.getItens().size() > 30) {
            throw new TipoEntregaInvalido();
        }
        return 7.00D;
    }
    
}
