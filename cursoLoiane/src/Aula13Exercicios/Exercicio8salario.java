package Aula13Exercicios;

import java.util.Scanner;

public class Exercicio8salario {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o quanto você ganha por hora ");
        double salarioHora = entrada.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês ");
        double qthoras = entrada.nextDouble();

        double salarioMes = salarioHora * qthoras;

        System.out.println("O salário referente ao mês trabalhado é "+salarioMes+"\n");
    }
}
