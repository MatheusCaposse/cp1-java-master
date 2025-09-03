package Exercicios.ex6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Digite o numero que deseja ver a tabuada: ");

        int num = l.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}
