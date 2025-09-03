package Exercicios.ex7;

import java.util.Scanner;

public class ex7 {

    public static void maiorNumero(){
        Scanner l = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int num1 = l.nextInt();

        System.out.println("Digite outro numero: ");

        int num2 = l.nextInt();

        if(num1>num2){
            System.out.println("O " + num1 + " é maior que o " + num2);
        } else if (num1==num2){
            System.out.println("Os numeros são iguais");
        } else {
            System.out.println("O " + num2 + " é maior que o " + num1);
        }
    }

    public static void main(String[] args) {
        maiorNumero();
    }
}
