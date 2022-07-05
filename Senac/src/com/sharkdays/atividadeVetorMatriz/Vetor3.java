package com.sharkdays.atividadeVetorMatriz;

import java.util.Arrays;
import java.util.Random;

public class Vetor3 {
    public static void main(String[] args) {

        int t = 100;

        int vetor[] = new int[t];
        Random aleatorio = new Random();

        int resultado = 0;

        for (int i = 0; i < 100; i++){

            int conteudo = aleatorio.nextInt(100);
            vetor[i] = conteudo;
            resultado += vetor[i];

        }

        System.out.println(Arrays.toString(vetor));
        System.out.println(resultado);
    }
}
