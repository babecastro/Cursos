package aula24;

public class Exer06 {
    public static void main(String[] args){
        Contato contato1 = new Contato();
        contato1.nome = "João";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@email.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "9999-9999";
        contato1.telefones[1] = "9582-8965";
        contato1.telefones[2] = "9856-9658";

        System.out.println("O contato do "+contato1.nome+" é: "+contato1.telefones[1]);

    }
}
