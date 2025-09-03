package Exercicios.ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Digite um numero inicial: ");

        int numInicial = l.nextInt();

        System.out.println("Digite um numero final: ");

        int numFinal = l.nextInt();

        for (int i=numInicial; i<numFinal; i++){
            System.out.println(i);
        }
    }
}
