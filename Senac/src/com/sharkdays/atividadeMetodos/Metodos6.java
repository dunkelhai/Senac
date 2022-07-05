package com.sharkdays.atividadeMetodos;

import java.util.Scanner;

public class Metodos6 {
    public static boolean senhaDesliga(int senha){

        if (senha == 1234){
            System.out.println("Computador será desligado!");
            return true;
        }else {
            System.out.println("Computador não será desligado!");
            return false;
        }

    }

    public static void main(String[] args) {
        int senhaDigitada;

        Metodos6 metodos6 = new Metodos6();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a senha: ");

        senhaDigitada = entrada.nextInt();

        senhaDesliga(senhaDigitada);


//        System.out.println(metodos6.senhaDesliga(senhaDigitada));

    }
}
