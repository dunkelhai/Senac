package com.sharkdays.atividadeVetorMatriz;

public class VetorMaior2 {
    public static void main(String[] args) {
        double[] lista = {1.9, 2.9, 10.0, 3.4, 3.5};

        double max = 0.0;//aqui a variável max recebe o valor do primeiro item do array
        for (int i = 1; i < lista.length; i++) {//aqui a iteração irá ocorrer
            if (lista[i] > max){ //caso o valor da posição i seja maior que o valor de max, max será substituído pelo valor da i-ésima posição.
                max = lista[i];
            }
        }

        System.out.println("O maior valor é " + max);
    }
}

