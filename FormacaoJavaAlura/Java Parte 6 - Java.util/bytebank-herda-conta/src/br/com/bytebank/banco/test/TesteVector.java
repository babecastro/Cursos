package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteVector {
	
	public static void main(String[] args) {

		//Vector � threadSafe
        List<Conta> lista = new Vector<Conta>();

        Conta cc = new ContaCorrente(22, 11);

        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println("Tamanho: " + lista.size());
//        Object ref = lista.get(0);
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());
        
        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);
        
//        <> isso se chama generics
        ArrayList<String> nomes = new ArrayList<String>();
        
        for(int i = 0; i < lista.size(); i++) {
        	Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        
        System.out.println("-------");
        
        for(Conta conta : lista) {
            System.out.println(conta);
		}
	}

}
