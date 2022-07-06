package Atividades.src;

import java.util.Scanner;

public class AtividadeProcedimentos2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean resultado;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        resultado = ePar(numero);

        if (resultado){
            System.out.println("O número é Par!");
        }else{
            System.out.println("O número é Ímpar!");
        }
    }

    static boolean ePar(int numero){
        if (numero % 2 == 0){
            return true;
        }

        return false;
    }
}
