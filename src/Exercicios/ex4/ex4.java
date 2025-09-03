package Exercicios.ex4;

import java.util.Scanner;

public class ex4 {

    public static void calcularFatorial(){
        Scanner l = new Scanner(System.in);

        System.out.println("Digite o numero que deseja fatorar");

        int num = l.nextInt();

        int resultado=1;

        for (int i = 2; i<=num; i++){
            resultado=resultado*i;
        }

        System.out.println("O resultado de " + num + "! é : " + resultado);
    }

    public static void main(String[] args) {
        calcularFatorial();
    }
}
