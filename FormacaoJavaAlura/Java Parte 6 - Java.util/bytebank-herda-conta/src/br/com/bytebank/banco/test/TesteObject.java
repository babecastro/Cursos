package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject extends Object {
	public static void main(String[] args) {
		System.out.println("x");
		System.out.println(4);
		System.err.println(false);
		
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cli = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		
		println(cli);
	}
	
	static void println() {
		
	}
	
	static void println(int a) {
		
	}
	
	static void println(Object referencia) {
		
	}

}
