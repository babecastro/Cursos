package Aula13;

public class OperadoresLogicos {
    public static void main(String[] args){
        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso); // só dá verdadeiro se os dois forem verdadeiros
        System.out.println(verdadeiro || falso); // só dá falso se os dois forem falsos
        System.out.println(verdadeiro ^ falso); // só dá falso se as duas opções forem falsas ou verdadeiras
        System.out.println(!verdadeiro && falso); //
    }
}
