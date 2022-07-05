package com.sharkdays;
import java.util.Scanner;


public class Tabuada {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Entre com o valor para a TABUADA:  ");

        int valor = SC.nextInt();

        System.out.println("\n:: TABUADA :: ");

        for (int i = 1; i <= 10; i++){

            System.out.println("\n" + valor + " * " + i + " = " + valor * i);
        }
    }
}
