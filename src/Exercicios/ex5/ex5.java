package Exercicios.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        List<Integer> listaPar = new ArrayList<>();
        List<Integer> listaImpar = new ArrayList<>();

        for (int i = 1; i<=10; i++){
            System.out.println("Digite o numero " + (i) + ": ");

            int num =l.nextInt();

            if(num%2==0){
                listaPar.add(num);
            } else {
                listaImpar.add(num);
            }
        }

        System.out.println(listaPar);
        System.out.println(listaImpar);
    }
}
