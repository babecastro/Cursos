package Aula13Exercicios;
import java.util.Scanner;

public class Exercicio4Media {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Double nota1, nota2, nota3, nota4;


        System.out.println("Digite a primeira nota ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota ");
        nota2 = entrada.nextDouble();

        System.out.println("Digite a primeira nota ");
        nota3 = entrada.nextDouble();

        System.out.println("Digite a primeira nota ");
        nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media das notas digitadas é: "+ media + "\n");

    }
}
