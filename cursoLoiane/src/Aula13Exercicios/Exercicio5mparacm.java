package Aula13Exercicios;

import java.util.Scanner;

public class Exercicio5mparacm {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a quantidade de metros: ");
        double metros = entrada.nextDouble();

        //1m = 100 cm
        double cm = metros * 100;

        System.out.println("A quantidade digitada em centímetros é: " +cm+ "\n");

    }
}
