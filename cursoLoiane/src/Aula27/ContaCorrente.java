package Aula27;

public class ContaCorrente {
    String numeroDaConta;
    String numeroDaAgencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaSaque) {
        // tem saldo na conta
        if (saldo >= quantiaSaque) {
            saldo -= quantiaSaque;
            return true;
        } else { // não tem saldo na conta
            if (especial) {
                // verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;

                if (limite >= quantiaSaque) {
                    saldo -= quantiaSaque;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; // não é especial e não tem saldo
            }
        }
    }
}
