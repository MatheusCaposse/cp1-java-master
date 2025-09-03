package Exercicios.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        int idade =  l.nextInt();

        if (idade>=16){
            System.out.println("Você pode votar");
        } else {
            System.out.println("Você não pode votar");
        }
    }
}
