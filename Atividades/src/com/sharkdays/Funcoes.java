package Atividades.src.com.sharkdays;

import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {

        int opcao;

        do {
            opcao = mostrarMenu();
        } while(opcao != 2);
    }


    public static int mostrarMenu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("--MENU--");
        System.out.println("1- Mostrar de novo");
        System.out.println("2- Sair");
        return Integer.parseInt(entrada.nextLine());
    }

}
