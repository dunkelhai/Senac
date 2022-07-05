package com.sharkdays.atividadeVetorMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int t = 5;

        String vetor[] = new String[t];

        for (int i=0; i < 5; i++) {

            System.out.println("Digite o nome do aluno:");
            vetor[i] = entrada.nextLine();

        }

        System.out.println(Arrays.toString(vetor));

    }
}
