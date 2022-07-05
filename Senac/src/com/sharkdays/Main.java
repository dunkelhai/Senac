package com.sharkdays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade em dias: ");
        double idadeDias = entrada.nextDouble();

        double idadeAnos = idadeDias / 365;
        BigDecimal bd = new BigDecimal(idadeAnos).setScale(2, RoundingMode.HALF_UP);

        double idadeMeses = idadeDias / 30;
        BigDecimal bd2 = new BigDecimal(idadeMeses).setScale(2, RoundingMode.HALF_UP);

        idadeAnos = bd.doubleValue();
        System.out.println("A idade em anos é: "+ idadeAnos);

        idadeMeses = bd2.doubleValue();
        System.out.println("A idade em meses é: "+ idadeMeses);




    }
}
