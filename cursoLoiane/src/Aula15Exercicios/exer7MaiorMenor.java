package Exercicios15;
import java.util.Scanner;

public class exer7MaiorMenor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero ");
        int num2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero ");
        int num3 = entrada.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("O primeiro número é o maior: "+num1+"\n");
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("O segundo número é o maior: "+num2+"\n");
        } else if(num3 >= num1 && num3 >= num2){
            System.out.println("O terceiro número é o maior: "+num3+"\n");
        }

        if(num1 <= num2 && num1 <=num3){
            System.out.println("O primeiro número é o menor: "+num1+"\n");
        } else if(num2 <= num1 && num2 <= num3){
            System.out.println("O segundo número é o menor: "+num2+"\n");
        } else if(num3 <= num1 && num3 <= num2){
            System.out.println("O terceiro número é o menor: "+num3+"\n");
        }

    }
}
