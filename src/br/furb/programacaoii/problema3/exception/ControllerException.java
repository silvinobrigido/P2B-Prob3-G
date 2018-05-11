package br.furb.programacaoii.problema3.exception;

/**
 * Define a Exception base para os controladores
 * 
 * @author ariel
 */
public abstract class ControllerException extends Exception {

	private static final long serialVersionUID = 2801070162197715863L;

	public ControllerException(String msg) {
		super(msg);
	}
}
