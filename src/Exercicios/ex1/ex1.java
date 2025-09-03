package Exercicios.ex1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex1 {
    public static void main(String[] args) {

        //1)

        Scanner l = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");

        double metro = l.nextDouble();

        System.out.println("""
                
                Deseja converter para
                
                1- Centrimetro
                
                2- Milímetro
                
                --------------------------------
                """);

        int escolha = l.nextInt();

        if (escolha==1){
            System.out.println("O valor de " + metro + "m em centimetro é " + (metro*100) + "cm");
        } else if (escolha==2) {
            System.out.println("O valor de " + metro + "m em milímetro é " + (metro*1000) + "mm");
        } else {
            System.out.println("Opção invaida");
        }

        //2)



    }
}