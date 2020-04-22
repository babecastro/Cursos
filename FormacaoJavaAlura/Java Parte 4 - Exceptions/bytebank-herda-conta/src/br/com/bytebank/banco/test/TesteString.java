package br.com.bytebank.banco.test;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal
		
//		nome.replace("A", "a");
//		nome.toLowerCase();
		
		//conceito de sobrecarga
		String outra = nome.replace('A', 'a');
//		String outra = nome.replace("Al", "aL");
		
		char c = nome.charAt(2);
		int pos = nome.indexOf("ur");
		String sub = nome.substring(1);

//		String vazio = "";
		String vazio ="    Alura    ";
		String outroVazio = vazio.trim(); 
		
		System.out.println(vazio.isEmpty());
		System.out.println(outroVazio.isEmpty());
		System.out.println(vazio.contains("Alu"));
		
		System.out.println(outra);
		System.out.println(nome);
		System.out.println(c);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(nome.length());

		for(int i = 0; i < nome.length(); i++) {
		    System.out.println(nome.charAt(i));
		}


	}

}
