package Exercicios.ex11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        String nome = "";
        int idade = 0;

        for (int i = 0; i<3; i++){
            System.out.println("Digite o nome da pessoa " + (i+1) + ": ");
            String nomeNovo = l.next();

            System.out.println("Digite a idade da pessoa " + (i+1) + ": ");
            int idadeNova = l.nextInt();
            if (idadeNova>idade){
                idade = idadeNova;
                nome = nomeNovo;
            }
        }

        System.out.println("A pessoa mais velha é o/a " + nome + " e possui " + idade + " anos");
    }
}
