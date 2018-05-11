/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.programacaoii.problema3.controller.calculo;

import br.furb.programacaoii.problema3.model.Pedido;

/**
 *
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
    public Double calcularValorEntrega(Pedido pedido) {
        return null;
        
    }
    
}
