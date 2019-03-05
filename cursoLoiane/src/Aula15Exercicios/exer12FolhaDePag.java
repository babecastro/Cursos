package Aula15Exercicios;

import java.util.Scanner;

public class exer12FolhaDePag {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor/hora ");
        double valorHora = entrada.nextDouble();

        System.out.println("Digite as horas trabalhadas no mês ");
        double horasMes = entrada.nextDouble();

        double salarioBruto = valorHora * horasMes;

        int percentualIR = 0;

        if (salarioBruto <= 900){
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
            percentualIR = 10;
        } else if (salarioBruto > 2500){
            percentualIR = 20;
        }

        double descontoIR = (salarioBruto / 100) * percentualIR;
        double descontoINSS = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double descontos = descontoINSS + descontoIR;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário Bruto: R$ "+salarioBruto+"\n");
        System.out.println("(-) IR: R$ "+(salarioBruto*(percentualIR/100))+"\n");
        System.out.println("(-) INSS: R$ "+descontoINSS+"\n");
        System.out.println("FGTS: R$ "+fgts+"\n");
        System.out.println("Total de descontos: R$"+descontos+"\n");
        System.out.println("Salario liquido "+salarioLiquido+"\n");

    }
}
