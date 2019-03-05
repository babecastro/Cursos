package Aula13Exercicios;

import java.util.Scanner;

public class Exercicio10CparaF {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius ");
        double grausC = entrada.nextDouble();

        double grausF = (grausC * 1.8)+32;

        System.out.println("A temperatura em graus Farenheit é "+grausF+ "\n");


    }
}
