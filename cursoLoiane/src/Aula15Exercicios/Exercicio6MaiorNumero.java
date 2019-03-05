package Aula15Exercicios;

import java.util.Scanner;

public class Exercicio6MaiorNumero {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero ");
        int num1 = entrada.nextInt();

        System.out.println("Entre com o segundo numero ");
        int num2 = entrada.nextInt();

        System.out.println("Entre com o terceiro numero ");
        int num3 = entrada.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("Num1 é maior "+num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("Num2 é maior "+num2);
        } else if (num3 >= num1 && num3 >= num2){
            System.out.println("Num3 é maior "+num3);
        }
    }
}
