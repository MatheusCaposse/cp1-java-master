package Exercicios.ex12;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Altura da caixa :");
        double altura = l.nextDouble();

        System.out.println("Largura da caixa: ");
        double largura = l.nextDouble();

        System.out.println("Comprimento da caixa: ");
        double comprimento = l.nextDouble();

        System.out.println("Volume da caixa: " + (comprimento*largura*altura) + "cm");
    }
}
