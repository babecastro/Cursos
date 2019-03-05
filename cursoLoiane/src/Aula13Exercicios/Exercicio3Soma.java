package Aula13Exercicios;
import java.util.Scanner;

public class Exercicio3Soma {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite um numero ");
        num1 = entrada.nextInt();

        System.out.println("Digite outro numero ");
        num2 = entrada.nextInt();

        System.out.println("A soma dos números digitados é " +(num1+num2)+ "\n");

    }
}
