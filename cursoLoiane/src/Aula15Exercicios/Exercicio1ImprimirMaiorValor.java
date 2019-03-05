package Aula15Exercicios;

import java.util.Scanner;

public class Exercicio1ImprimirMaiorValor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite um número ");
        numero1 = entrada.nextInt();

        System.out.println("Digite outro número" );
        numero2 = entrada.nextInt();

        if(numero1 > numero2){
            System.out.println("O maior numero digitado foi "+numero1+"\n");
        } else {
            System.out.println("O maior numero digitado foi "+numero2+"\n");
        }

    }
}
