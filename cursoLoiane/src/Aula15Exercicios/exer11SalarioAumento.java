package Aula15Exercicios;

import java.util.Scanner;

public class exer11SalarioAumento {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário ");
        double salario = entrada.nextDouble();

        double aumentoDe20 = 20;
        double aumentoDe15 = 15;
        double aumentoDe10 = 10;
        double aumentoDe5 = 5;

        System.out.println("O salário anterior era "+salario+"\n");
        if(salario <= 280){
            System.out.println("O percentual de aumento foi de 20%");
            System.out.println("O aumento foi de "+(salario*(aumentoDe20/100))+"\n");
            System.out.println("O salário após o aumento ficou "+(salario+(salario*(aumentoDe20/100)))+"\n");
        } else if(salario > 280 && salario < 700){
            System.out.println("O percentual de aumento foi de 15%");
            System.out.println("O aumento foi de "+(salario*(aumentoDe15/100))+"\n");
            System.out.println("O salário após o aumento ficou "+(salario+(salario*(aumentoDe15/100)))+"\n");
        } else if(salario > 700 && salario < 1500){
            System.out.println("O percentual de aumento foi de 10%");
            System.out.println("O aumento foi de "+(salario*(aumentoDe10/100))+"\n");
            System.out.println("O salário após o aumento ficou "+(salario+(salario*(aumentoDe10/100)))+"\n");
        } else if(salario > 1500){
            System.out.println("O percentual de aumento foi de 5%");
            System.out.println("O aumento foi de "+(salario*(aumentoDe5/100))+"\n");
            System.out.println("O salário após o aumento ficou "+(salario+(salario*(aumentoDe5/100)))+"\n");
        }
    }
}
