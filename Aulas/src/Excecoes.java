package Aulas.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            String[] vetor = entrada.nextLine().split(" ");
            int posicao = entrada.nextInt();
            System.out.println(vetor[posicao]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida!");
        }
        catch (InputMismatchException e){
            System.out.println("Erro de entrada!");
        }

        System.out.println("Fim do programa");
        entrada.close();
    }
}
