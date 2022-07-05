package com.sharkdays.atividadeVetorMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class VetorAula2 {
    public static void main(String[] args) {

        int t = 5;

        int vetor[] = new int[t];

        for (int i=0; i < 5; i++) {

            vetor[i] = i;

        }

        System.out.println(Arrays.toString(vetor));
        System.out.println(vetor[3] + " " + vetor[1]);

    }
}
