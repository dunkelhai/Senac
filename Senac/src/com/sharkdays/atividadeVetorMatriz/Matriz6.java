package com.sharkdays.atividadeVetorMatriz;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Arrays;


public class Matriz6 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int matriz[][][] = new int[2][2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    int numero = aleatorio.nextInt(20);
                    matriz[i][j][k] = numero;
                }

            }
        }
        System.out.println(Arrays.deepToString(matriz));

    }
}

