/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.programacaoii.problema3.exception;

/**
 *
 * @author jardelangelo
 */
public class TipoEntregaInvalido extends RuntimeException {
    
    public TipoEntregaInvalido(){
        super("O tipo de entrega é inválido.");
    }
    
}
