package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
	
//	Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; // inicializa com zero
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 49;
//		idades[3] = 59;
//		idades[4] = 69;
//
//		
//		int idade4 = idades[4];
//
//		System.out.println(idade4);	
//		System.out.println(idades.length); 
		
		for(int i = 0; i < idades.length; i ++) {
			idades[i] = i * i; 
			System.out.println(idades[i]);
		}
		
//		for(int i = 0; i < idades.length; i ++) {
//			System.out.println(idades[i]);
//		}
		
	}

}
