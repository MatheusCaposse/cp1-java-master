package Exercicios.ex14;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double Fahrenheit = l.nextDouble();

        System.out.println("O valor de " + (int) Fahrenheit + "°F em Celsius é " + (int) (((Fahrenheit-32)*5)/9) + "°C");
    }
}
