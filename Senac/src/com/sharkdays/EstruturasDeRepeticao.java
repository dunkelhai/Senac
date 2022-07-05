package com.sharkdays;

import java.util.Random;
import java.util.Scanner;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {

        //Numero 1

//        int numero = 1000;
//
//        for (int i = 1; i < 1000; i++){
//
//            if (numero % 11 == 5){
//                System.out.println(numero);
//                numero++;
//            }else{
//                numero++;
//            }
//
//
//        }

        //Numero 2

//        int numero = 1;
//
//        for (int i = 1; i < 101; i++){
//            System.out.println(numero);
//            numero++;
//        }

        //Numero 3

//        int numero = 1;
//
//        for (int i = 1; i < 101; i++){
//
//            if (numero % 2 != 0){
//
//                System.out.println(numero);
//            }
//
//            numero++;
//
//        }


        //Numero 5
//
//        int numero = 1;
//
//        for (int i = 1; i < 101; i++){
//
//            if (numero % 10 == 0){
//
//                System.out.println("Múltiplo de 10: " + numero);
//                numero++;
//            }else{
//                System.out.println(numero);
//                numero++;
//            }
//        }

        //Numero 6

//        int numero = 1;
//
//        for (int i = 1; i < 1001; i++){
//
//            if (numero == 3){
//                System.out.println(numero + " Iniciando!");
//                numero++;
//            }
//            else if (numero == 500){
//                System.out.println(numero + " Metade!");
//                numero++;
//            }
//            else if (numero == 1000){
//                System.out.println(numero + " Terminei!");
//                numero++;
//            }else{
//                System.out.println(numero);
//                numero++;
//            }
//
//        }

        //Numero 7

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random(); //Inicia Aleatório
        int numero = aleatorio.nextInt(10); //Gera um número aleatório (0 – 99)
        int acertou = 0;

        while(acertou == 0){

            System.out.println("Digite um número para tentar acertar:\n");
            int tentativa = entrada.nextInt();

            if (tentativa > numero){
                System.out.println("MENOR!");
            }else if (tentativa < numero){
                System.out.println("MAIOR");
            }else{
                System.out.println("Acertou! O número era: " + numero);
                acertou = 1;
            }
        }


    }
}
