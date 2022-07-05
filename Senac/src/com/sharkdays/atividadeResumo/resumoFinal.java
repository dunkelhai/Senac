package com.sharkdays.atividadeResumo;

import java.util.Scanner;

public class resumoFinal {
    public static void main(String[] args) {
        //Número 1:

        int x = 1;
        int y = 2;


        if (x != y){
            System.out.println("Diferentes");
        }else{
            System.out.println("Iguais");
        }


        // Número 2:

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade em dias: ");
        int idadeDias = entrada.nextInt();
        System.out.println("Você tem " + (idadeDias / 365) + " anos de vida!");
        System.out.println("Você tem " + (idadeDias / 30) + " meses de vida!");


        // Número 3:

        System.out.println("Digite o tempo da fábrica em segundos: ");
        int acontecimentoFabrica = entrada.nextInt();
        System.out.println("O acontecimento leva " + (acontecimentoFabrica / 60) + " minutos!");
        System.out.println("O acontecimento leva " + ((acontecimentoFabrica / 60)/60) + " horas!");


        // Número 4:

        System.out.println("Digite um número: ");
        int numeroSucessor = entrada.nextInt();
        System.out.println("O sucessor é " + (numeroSucessor + 1));

        // Número 5:

        String meuNome = "Alysson";
        System.out.println("Digite um nome: ");
        String nomeDigitado = entrada.nextLine();

        if (nomeDigitado != meuNome){
            System.out.println("Nomes diferentes!");
        }else{
            System.out.println("Nomes iguais!");
        }

        // Número 6:


        // Número 7:

        int numeroDigitado;
        int contador1 = 0;
        for (int i = 0; i < 20; i++){
            System.out.println("Digite um número: ");
            numeroDigitado = entrada.nextInt();

            if (numeroDigitado == 10){

                contador1 ++;

            }
        }

        System.out.println("Foram digitados: " + contador1 + " números iguais a 10!");

        // Número 8:

        int numeroDigitado2;
        int contador2 = 0;
        for (int i = 0; i < 15; i++){
            System.out.println("Digite um número: ");
            numeroDigitado2 = entrada.nextInt();

            if (numeroDigitado2 != 10){

                contador2 ++;

            }
        }

        System.out.println("Foram digitados: " + contador2 + " números diferentes de 10!");


        // Número 9:

        int numeroDigitado3;
        int contador3 = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            numeroDigitado3 = entrada.nextInt();

            if (numeroDigitado3 < 9 && numeroDigitado3 > 1 && numeroDigitado3 % 2 == 0){

                contador3 ++;

            }
        }

        System.out.println("Foram digitados: " + contador3 + " números que estão entre 1 e 9 e que são múltiplos de 2!");

        // Número 10:

        String nomeDigitado2;
        int contador4 = 0;
        int contador5 = 0;

        for (int i = 0; i < 20; i++){
            System.out.println("Digite um número: ");
            nomeDigitado2 = entrada.nextLine();

            if (nomeDigitado2 == "Eustáquio" ){

                contador4 ++;

            }else if (nomeDigitado2 == "Dercides"){

                contador5++;
            }
        }

        System.out.println("Foram digitados: " + contador4 + " nomes iguais à Eustáquio e "+ contador5 + " nomes iguais à Dercides!");


    }
}
