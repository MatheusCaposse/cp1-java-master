package Exercicios.ex10;

import java.util.Scanner;

public class ex10 {

    public static void limparTela(){
        for (int i = 0; i<50; i++){
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Digite o valor que vai ser pago");

        double valor = l.nextDouble();

        limparTela();

        System.out.printf("""
                ---------------------------------
                
                Voce pode pagar o valor de R$%.2f em:
                
                1- Á vista (10%% off)
                
                2 - 2x (sem juros)
                
                3- 4x (juros de 8%%)
                
                -----------------------------------
                
                %n""", valor);

        String escolha = l.next();

        limparTela();

        if (escolha.equalsIgnoreCase("1")){
            System.out.println("O valor total a ser pago sera R$" + (valor-(valor*0.10)));
        } else if (escolha.equalsIgnoreCase("2")) {
            System.out.println("O valor das parcelas sera 2x de R$" + (valor/2) + " e o valor final a ser pago sera R$" + valor);
        } else if(escolha.equalsIgnoreCase("3")){
            System.out.println("O valor das parcelas sera 4x de R$" + ((valor+(valor*0.08))/4) + " e o valor final a ser pago sera R$" + (valor+(valor*0.08)));
        }
    }
}
