package com.sharkdays.atividadeMetodos;

import java.util.Scanner;

public class Metodos7 {
    public static void consumoGasosa(double d1, double d2){

        System.out.println("O consumo médio de gasolina foi: " + d1 / d2 );

    }

    public static void main(String[] args) {

        double gasolina, distancia;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade em Litros de gasolina gasta: ");
        gasolina = entrada.nextDouble();

        System.out.println("Digite a distância percorrida em Km: ");
        distancia = entrada.nextDouble();

        consumoGasosa(gasolina, distancia);

    }
}
