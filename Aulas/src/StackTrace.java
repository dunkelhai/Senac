package Aulas.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {
    public static void main(String[] args) {
        metodo1();
        System.out.println("Fim do programa");
    }

    public static void metodo1() {
        System.out.println("***METODO 1 COMECA");
        metodo2();
        System.out.println("***METODO 1 TERMINA");
    }

    public static void metodo2() {
        System.out.println("***METODO 2 COMECA");
        Scanner entrada = new Scanner(System.in);

        try {
            String[] vetor = entrada.nextLine().split(" ");
            int posicao = entrada.nextInt();
            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
            e.printStackTrace();
            entrada.next();
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada!");
        }

        entrada.close();
        System.out.println("***METODO 2 TERMINA");

    }
}
