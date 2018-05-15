package br.furb.programacaoii.problema3.exception;

public class ModalidadeFreteNaoInformadaException extends RuntimeException {

	private static final long serialVersionUID = -8459029798177002378L;

	public ModalidadeFreteNaoInformadaException() {
		super("Modalidade de frete não informada");
	}

}
