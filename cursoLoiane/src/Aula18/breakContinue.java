package Aula18;

import java.util.Scanner;

public class breakContinue {
    public static void main(String[] args) {
        /* Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = entrada.nextInt();

        System.out.println("Digite um limite");
        int max = entrada.nextInt();

        for(int i=num; i<=max; i++){
            System.out.println(i);
            if(i % 7 == 0){
                System.out.println("O valor de i é: "+i);
                break;
            }
        }

       // ZONA -> não é boa prática hoje em dia. GOTO. (linguagem de baixo nível)
        /* for (int i = 0; i <= 4; i++) {
            rotulo1:
            {
                rotulo2:
                {
                    rotulo3:
                    {
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("rotulo 3");
                    }
                    System.out.println("rotulo 2");
                }
                System.out.println("rotulo 1");
            }
            System.out.println(i);
        }*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = entrada.nextInt();

        System.out.println("Digite um limite");
        int max = entrada.nextInt();

        // continue é mais utilizado com for dentro de for
        for(int i=num; i<=max; i++){
            if(i % 7 == 0){
                continue;
            }
            System.out.println("O valor de i é: "+i);
        }
    }
}
