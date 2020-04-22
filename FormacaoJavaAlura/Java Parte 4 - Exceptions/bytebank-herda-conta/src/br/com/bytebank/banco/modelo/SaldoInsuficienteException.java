package br.com.bytebank.banco.modelo;


/**
 * Exceção para saldo insuficiente.
 * 
 * @author Barbara.Castro
 *
 */
public class SaldoInsuficienteException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
