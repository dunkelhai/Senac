package Aulas.src;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int[][] matriz = new int[numero][numero];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");

        for (int i = 0; i< matriz.length;i++){
            System.out.print(matriz[i][i]);
        }

        System.out.println();

        int contador = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < 0){
                    contador++;
                }
            }
        }

        System.out.println("Negativos: " + contador);

        entrada.close();

    }
}
