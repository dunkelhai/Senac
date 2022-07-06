package Atividades.src.com.sharkdays.atividadeVetorMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Adicione um número à Matriz:");
                int numero = entrada.nextInt();
                matriz[i][j] = numero;
            }

        }

        System.out.println(Arrays.deepToString(matriz));

    }
}


