package Aula14CondicionaisIfElse;

import java.util.Scanner;

public class Aula14MultiplusIfElse {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o preço do item");
        double valor = entrada.nextDouble();

        // barato <= 10
        // 10 < valor < 15 - pedir desconto
        // 15 <= valor 17 - pesquisar mais
        // >= 17 - muito caro

        if(valor <= 10){
            System.out.println("Está barato, pode comprar ");
        } else if (valor > 10 && valor < 15){
            System.out.println("Você pode pedir um desconto ");
        } else if (valor >= 15 && valor < 17){
            System.out.println("Pode pesquisar mais ");
        } else { //>=17
            System.out.println("Está muito caro");
        }

    }
}
