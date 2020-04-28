package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArraysReferencias {

	public static void main(String[] args) {
		
//		Conta[] contas = new Conta[5];
		
		// referencia para um objeto mais genérico ainda 
		Object [] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaPoupanca cc2 = new ContaPoupanca(33, 11);
		referencias[0] = cc1;
		referencias[1] = cc2;
		
//		System.out.println(cc2.getNumero());
		
		// acessando a referência através do array 
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
//		Object referenciaGenerica = contas[1];
//		System.out.println(referenciaGernerica.getNumero());
		
		ContaCorrente ref = (ContaCorrente) referencias[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		}

}
