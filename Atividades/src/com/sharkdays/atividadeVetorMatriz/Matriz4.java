package Atividades.src.com.sharkdays.atividadeVetorMatriz;

import java.util.Arrays;

public class Matriz4 {
    public static void main(String[] args) {
        String nome = "SENAC TESTE";
        String matriz[][] = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = nome;
                if (j == 2){
                    matriz[i][j] += "\n";
                }
            }

        }

        System.out.println(Arrays.deepToString(matriz));

    }
}

