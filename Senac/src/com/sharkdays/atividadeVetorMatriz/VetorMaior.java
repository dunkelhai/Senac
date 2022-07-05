package com.sharkdays.atividadeVetorMatriz;

public class VetorMaior {
    public static void main(String[] args) {
        int[] vetor = {1,4,5,7,3,4,8,3,5,56,3,99,3,455,7,0,42,34,11,23,88};
        int indice_maior = buscarMaiorIndice(vetor);
        int valor_maior = buscarMaior(vetor);
        int elementos = bucarTotal(vetor);

        System.out.println("A posição do maior elemento é: " + indice_maior);
        System.out.println("O maior elemento é: " + valor_maior);
        System.out.println("Seu vetor tem " + elementos + " elementos!");


    }

    public static int buscarMaiorIndice(int[] vetor){
        int maior = 0;

        for (int i = 1; i < vetor.length; i++){
            if (vetor[i] >vetor[maior]){
                maior = i;
            }
        }

        return maior;
    }

    public static int buscarMaior(int[] vetor){
        int maior = 0;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int bucarTotal(int[] vetor){
        int total = 0;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > total){
                total = i;
            }
        }

        return total;
    }
}
