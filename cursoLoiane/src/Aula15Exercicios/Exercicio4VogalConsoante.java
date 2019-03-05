package Aula15Exercicios;

import java.util.Scanner;

public class Exercicio4VogalConsoante {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com uma letra ");

        String input = entrada.next();
        /*
        if(input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e")
        || input.equalsIgnoreCase("i") || input.equalsIgnoreCase("o")
        || input.equalsIgnoreCase("u")){
            System.out.println("Essa letra é uma vogal ");
        } else {
            System.out.println("Essa letra é uma consoante ");
        } */

        if (input.length() > 1){
           System.out.println("Não é uma letra válida ");
        } else {
        switch (input) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("vogal");
                break;
            default:
                System.out.println("consoante");
            }
        }
    }
}
