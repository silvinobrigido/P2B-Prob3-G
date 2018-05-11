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
public class CalculoRetiradaLocal implements CalculoEntrega {
 
        
    private static CalculoRetiradaLocal instance;
    
    private CalculoRetiradaLocal() {
    }
    
    

    public static CalculoEntrega getInstance() {
        if (null == instance) {
			instance = new CalculoRetiradaLocal();
		}
		return instance;
    }

    @Override
    public Double calcularValorEntrega(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
