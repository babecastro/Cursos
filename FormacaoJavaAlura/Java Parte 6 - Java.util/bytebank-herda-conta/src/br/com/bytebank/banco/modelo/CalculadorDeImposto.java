package br.com.bytebank.banco.modelo;

/**
 * Classe que representa uma calculadora de imposto. 
 * 
 * @author Barbara.Castro
 *
 */
public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
