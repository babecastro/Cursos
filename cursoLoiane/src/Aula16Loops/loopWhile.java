package Aula16Loops;

public class loopWhile {
    public static void main(String[] args) {

        int i = 0;
        int max = 10;

        System.out.println("Contando até " + max);

//        while (i < max){
//            System.out.println("Valor de i: "+i);
//            i++; // i = i + 1; ou i += 1;
//        }
//
//        System.out.println(i);

        do {
            i++;
            System.out.println(i);
        } while (i < 15);
    }
}
