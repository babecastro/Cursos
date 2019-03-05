package Aula13Exercicios;

import java.util.Scanner;

public class Exercicio9grausCelsius {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de graus Farenheit ");
        double grauF = entrada.nextDouble();

        double grauC = (5*(grauF-32)/9);

        System.out.println("A quantidade de graus em Celsius é "+grauC+"\n");

    }
}
