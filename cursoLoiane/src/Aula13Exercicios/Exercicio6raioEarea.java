package Aula13Exercicios;

import java.util.Scanner;

public class Exercicio6raioEarea {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio do círculo ");
        double raio = entrada.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do circulo é "+area+"\n");
    }
}
