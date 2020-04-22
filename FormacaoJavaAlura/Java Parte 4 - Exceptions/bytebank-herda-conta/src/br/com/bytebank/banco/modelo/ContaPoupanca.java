package br.com.bytebank.banco.modelo;


/**
 * Classe que representa uma Conta Poupança no bytebank.
 * 
 * @author Barbara.Castro
 *
 */
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
}
