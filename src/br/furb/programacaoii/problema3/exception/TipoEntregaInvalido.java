/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.programacaoii.problema3.exception;

/**
 * Define a exception para o tipo de entrega inválido. Utilizado quando a
 * ModalidadeFrete não atende a um pedido.
 *
 * @author jardelangelo
 */
public class TipoEntregaInvalido extends ControllerException {

	private static final long serialVersionUID = 1L;

	public TipoEntregaInvalido() {
		super("O tipo de entrega é inválido!");
	}

}
