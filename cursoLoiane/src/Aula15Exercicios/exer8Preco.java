package Exercicios15;

import java.util.Scanner;

public class exer8Preco {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro preço ");
        double preco1 = entrada.nextDouble();

        System.out.println("Entre com o segundo preço ");
        double preco2 = entrada.nextDouble();

        System.out.println("Entre com o terceiro preço ");
        double preco3 = entrada.nextDouble();

        if(preco1 <= preco2 && preco1 <= preco3){
            System.out.println("O menor preço é o primeiro: "+preco1+", pode comprar");
        } else if(preco2 <= preco1 && preco2 <= preco3){
            System.out.println("O menor preço é o segundo: "+preco2+", pode comprar");
        } else if(preco3 <= preco1 && preco3 <= preco2){
            System.out.println("O menor preço é o terceiro: "+preco3+", pode comprar");
        }

    }
}
