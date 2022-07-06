package Atividades.src.com.sharkdays.atividadeVetorMatriz;

import java.util.Scanner;

public class Vetor2 {

    public static void main(String[] args) {
// TODO Auto-generated method stub

        String[] nomes = new String[5];

        double[] notas = new double[5];
        
        Scanner entrada = new Scanner(System.in);

        for (int cont = 0; cont <= 4; cont++) {
            System.out.println("Entre com o nome do Aluno nº " + (cont + 1));
            nomes[cont] = entrada.nextLine();
            System.out.println("Entre com o nota do Aluno nº " + (cont + 1));
            notas[cont] = Double.parseDouble(entrada.nextLine());
        }
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
        double media = (soma/5);
        System.out.println("Média da Turma = " + media);

        for (int i = 0; i < 5; i++) {
            if (notas[i]>=media) {
                System.out.println("Aluno n°" + i + " : "+nomes[i] + " Passou com nota: " + notas[i]);
            }
        }
    }
}