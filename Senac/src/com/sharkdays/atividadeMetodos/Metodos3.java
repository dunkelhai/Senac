package com.sharkdays.atividadeMetodos;

import java.util.Scanner;

public class Metodos3 {

    public static double divisao(double numero1, double numero2){

        return numero1 / numero2;

    }

    public static void main(String[] args) {

        double a,b;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha o primeiro número: ");
        a = entrada.nextDouble();
        System.out.println("Escolha o segundo número: ");
        b = entrada.nextDouble();


        System.out.println(divisao(a,b));

    }
}
