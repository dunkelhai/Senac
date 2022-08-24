package application;

import services.PrintService;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.println("Quantos valores? ");
        int escolha = entrada.nextInt();

        for (int i = 0; i < escolha; i++){
            System.out.println("Adicione o " + i + " valor: ");
            int valor = entrada.nextInt();
            ps.addValue(valor);
        }

        ps.print();
        System.out.println("Primeiro item: " + ps.first());

        entrada.close();
    }
}
