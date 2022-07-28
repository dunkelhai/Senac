package Atividades.src.com;

import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nota = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Insira a nota: ");
            nota[i] = input.nextInt();
        }

        System.out.println(nota[0]);

        int valorMaximo = nota[0];
        int index = 0;

        for(int i = 0; i < nota.length; i++){
            if (nota[i] > valorMaximo){
                valorMaximo = nota[i];
                index = i;
            }
        }

        System.out.println("Maior número é: " + valorMaximo);
        System.out.println("Posição dele: " + index);
    }
}
