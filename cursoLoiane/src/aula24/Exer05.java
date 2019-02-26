package aula24;

public class Exer05 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numeroDaConta = "123456";
        conta.numeroDaAgencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 1000;
        conta.saldo = 10;

        System.out.println("O saldo da conta é "+conta.numeroDaConta+ " = " +conta.saldo);
    }
}
