package Atividades.src.com.sharkdays;

import java.util.Scanner;

public class AtividadeProcedimentos3 {
    public static void main(String[] args) {
        int vetor1[] = new int[10];
        int soma;
        float media;

        lerVetor(vetor1);

        soma = somarNumeros(vetor1);

        System.out.println("A soma é: " + soma);

        media = calcularMedia(vetor1);

        System.out.println("A média é: " + calcularMedia(vetor1));

        }

    static void lerVetor(int[] vetor1){

        Scanner entrada = new Scanner(System.in);

        int i;

        for (i = 0; i < vetor1.length; i++){
            System.out.println("Digite o " + (i + 1) + " número: ");
            vetor1[i] = entrada.nextInt();

        }
    }

    private static int somarNumeros(int[] vetor1) {
        int acmSoma = 0, i;

        for (i = 0; i < vetor1.length; i++){
            acmSoma += vetor1[i];
        }
        return acmSoma;
    }

    private static float calcularMedia(int[] vetor1) {

        float media;
        media = somarNumeros(vetor1) / vetor1.length;
        return media;

    }
}
