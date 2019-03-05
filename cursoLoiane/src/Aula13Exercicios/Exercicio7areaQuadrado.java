package Aula13Exercicios;

import java.util.Scanner;

public class Exercicio7areaQuadrado {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado ");
        double lado = entrada.nextDouble();

        // area = lado x lado
        double area = Math.pow(lado, 2);
        System.out.println("A area do quadrado é "+area+"\n");
        System.out.println("O dobro da area do quadrado é "+(area)*2+"\n"); }
}
