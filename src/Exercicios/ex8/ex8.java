package Exercicios.ex8;

import java.util.Scanner;

public class ex8 {

    public static void calcularIMC(){
        Scanner l = new Scanner(System.in);

        System.out.println("Digite o seu peso em KG: ");
        double kg = l.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = l.nextDouble();

        double imc = (kg/(altura*altura));

        if(imc<=18.5){
            System.out.println("Abaixo do peso.");
        } else if (imc<=24.9){
            System.out.println("Peso normal.");
        } else if (imc<=29.9){
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade");
        }

    }

    public static void main(String[] args) {
        calcularIMC();
    }
}
