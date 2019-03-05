package Aula13Exercicios;

import java.util.Scanner;

public class Exercicio11numInteReal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro ");
        int num1 = entrada.nextInt();

        System.out.println("Digite outro numero inteiro ");
        int num2 = entrada.nextInt();

        System.out.println("Digite um numero real ");
        double num3 = entrada.nextDouble();

        int a = (num1 * 2) * (num2 / 2);
        double b = (num3 * 3) + num3;
        double c = Math.pow(num3, 3);

        System.out.println("O resultado do dobro do primeiro com metade do segundo é " + a + "\n");
        System.out.println("O resultado da soma do triplo do primeiro com o terceiro é " + b + "\n");
        System.out.println("O terceiro elevado ao cubo é " + c + "\n");


    }
}