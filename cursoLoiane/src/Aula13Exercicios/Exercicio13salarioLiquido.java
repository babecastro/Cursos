package Aula13Exercicios;

import java.util.Scanner;

public class Exercicio13salarioLiquido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o quanto você ganha por hora ");
        double salarioHora = entrada.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês ");
        double qthoras = entrada.nextDouble();

        double salarioBruto = salarioHora * qthoras;
        double inss = (salarioBruto / 100) * 8;
        double IR = (salarioBruto / 100) * 11;
        double sindicato = (salarioBruto / 100) * 5;
        double salarioLiquido = salarioBruto - inss - IR - sindicato;

        System.out.println("O seu salário bruto é "+salarioBruto+ "\n");
        System.out.println("O salário menos o imposto de renda é "+IR+"\n");
        System.out.println("O salário menos o inss é "+inss+"\n");
        System.out.println("O salário menos o sindicato é "+sindicato+"\n");
        System.out.println("O salário líquido referente ao mês trabalhado é " + salarioLiquido + "\n");
    }
}
