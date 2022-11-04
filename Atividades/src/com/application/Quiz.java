package Atividades.src.com.application;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;
        System.out.println("Qual a capital de SC?" +
                "\n1- Floripa" +
                "\n2- Chapecó" +
                "\n3- Xanxerê");
        int escolha = entrada.nextInt();
        if (escolha == 3){
            System.out.println("ACertou");
            pontos++;
        } else {
            System.out.println("errou");
        }
        System.out.println("Total de pontos " + pontos);

    }
}
