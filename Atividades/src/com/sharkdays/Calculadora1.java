package Atividades.src.com.sharkdays;
import java.util.Scanner;

public class Calculadora1 {

    public static void main(String[] args) {

        int n1;
        int n2;

        String  operacao = "";
        int control = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        operacao = entrada.nextLine();

        System.out.println("Digite um valor: ");
        n1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite um valor: ");
        n2 = Integer.parseInt(entrada.next());

        if(operacao.equals("+")) {
            System.out.println("O resultado da subtração é: " + (n1 + n2));
            control++;
        }

        if(operacao.equals("-")) {
            System.out.println("O resultado da subtração é: " + (n1 - n2));
            control++;
        }

        if(operacao.equals("*")) {
            System.out.println("O resultado da multiplicação é: " + (n1 * n2));
            control++;
        }

        if(operacao.equals("/")) {
            System.out.println("O resultado da divisão é: " + (n1 / n2));
            control++;
        }

        if(control == 0) {
            System.out.println("Operação inválida!");

        }

    }
}
