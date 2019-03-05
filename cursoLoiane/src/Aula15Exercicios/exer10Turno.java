package Aula15Exercicios;

import java.util.Scanner;

public class exer10Turno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a letra do turno que você estuda ");
        String input = entrada.next();

       /* if(input.equalsIgnoreCase("M")){
            System.out.println("O turno digitado foi M - Matutino. Bom dia! ");
        } else if (input.equalsIgnoreCase("V")){
            System.out.println("O turno digitado foi V - Vespertino. Boa tarde! ");
        } else if (input.equalsIgnoreCase("N")){
            System.out.println("O turno digitado foi N - Noturno. Boa noite! ");
        } else {
            System.out.println("Valor Inválido!");
        } */

        switch(input){
            case "m":
            case "M": System.out.println("Bom dia!"); break;
            case "v":
            case "V": System.out.println("Boa tarde!"); break;
            case "n":
            case "N": System.out.println("Boa noite!"); break;
            default: System.out.println("Valor Inválido!");
        }
    }
}