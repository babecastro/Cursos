package Aula15Exercicios;

import java.util.Scanner;

public class Exercicio3VerificaMasculinoFeminino {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println("Entre com uma letra ");
        String input = entrada.next();

        if (input.equalsIgnoreCase("F")){
            System.out.println("F - feminino");
        } else if (input.equalsIgnoreCase("M")){
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo inválido ");
        }
    }
}
