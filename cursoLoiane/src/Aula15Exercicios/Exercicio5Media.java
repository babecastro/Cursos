package Aula15Exercicios;

import java.util.Scanner;

public class Exercicio5Media {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a primeira nota ");
        double nota1 = entrada.nextDouble();

        System.out.println("Entre com a segunda nota ");
        double nota2 = entrada.nextDouble();

        double media = (nota1+nota2)/2;

        if(media == 10){
            System.out.println("Aprovado com distinção ");
        } else if(media >= 7){
            System.out.println("Aprovado ");
        } else {
            System.out.println("Reprovado");
        }
    }
}
