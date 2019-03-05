package Aula13Exercicios;

import java.util.Scanner;

public class Exercicio12Altura {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua altura ");
        double altura = entrada.nextDouble();

        double resultado = (72.7*altura) - 58;

        System.out.println("O seu peso ideal é "+resultado+ "\n");
    }
}
