package com.sharkdays;


import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        int fat = 1;

        System.out.println("Entre com o valor para obter o FATORIAL: ");

        int valor = SC.nextInt();

        for (int i = 1; i <= valor; i++){

            fat = fat * i;

        }

        System.out.println("\n VALOR: " + valor + " = FATORIAL => " + fat);
    }
}
