package Exercicios.ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner l = new Scanner(System.in);
        for (int i=0; i<3; i++){
            System.out.println("Digite o numero " + (i+1) + ": ");
            int num = l.nextInt();
            lista.add(num);
        }

        int soma = 0;

        for (int n : lista){
            soma+=n;
        }

        System.out.println("A media aritmética dos numerto é : " + (soma/lista.size()));

    }
}
