package Aula27;

public class Exer02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numeroDaConta = "123456";
        conta.numeroDaAgencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;


        System.out.println("O saldo da conta é "+conta.numeroDaConta+ " = " +conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso ");
            System.out.println("O saldo atual é de: "+conta.saldo);
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente. \n");
        }

        boolean saqueEfetuado2 = conta.realizarSaque(500);

        if (saqueEfetuado2) {
            System.out.println("Saque efetuado com sucesso ");
            System.out.println("O saldo atual é de: "+conta.saldo);
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente. \n");
        }
    }
}
