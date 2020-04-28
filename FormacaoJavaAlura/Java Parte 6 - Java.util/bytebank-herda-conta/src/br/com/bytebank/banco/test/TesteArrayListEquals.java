package br.com.bytebank.banco.test;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        Conta cc3 = new ContaCorrente(22, 22);
//        lista.add(cc3);
        boolean existe = lista.contains(cc3);
        
        System.out.println("Já existe? "+ existe);
        
        for(Conta conta : lista) {
            System.out.println(conta);
		}
		
//		Conta cc = new ContaCorrente(22, 11);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc.ehIgual(cc2);
//		
//		System.out.println("É igual? "+igual);
   
	}

}
