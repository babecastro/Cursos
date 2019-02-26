package Aula27;

public class Exer02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numeroDaConta = "123.456-1";
        conta.numeroDaAgencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;


        System.out.println("O saldo da conta " + conta.numeroDaConta + " é = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso ");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente. \n");
        }

        boolean saqueEfetuado2 = conta.realizarSaque(500);

        if (saqueEfetuado2) {
            System.out.println("Saque efetuado com sucesso ");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente. \n");
        }

        System.out.println("Depósito de 500 reais ");
        conta.depositar(500);
        conta.consultarSaldo();

        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial ]\n");
        } else {
            System.out.println("Não está usando cheque especial \n");
        }

        conta.realizarSaque(600);
        conta.consultarSaldo();
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial \n");
        } else {
            System.out.println("Não está usando cheque especial \n");
        }
    }
}
