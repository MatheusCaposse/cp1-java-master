package Exercicios.ex15;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("digite um numero para ver a contagem regressiva: ");
        int numero = l.nextInt();

        for (int i = numero; i!=0; i--){
            System.out.println(i);
        }
    }
}
