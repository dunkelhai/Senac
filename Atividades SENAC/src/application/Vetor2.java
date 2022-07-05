package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Vetor2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        Product[] vetor = new Product[numero];

        for (int i = 0; i < vetor.length; i++) {
            entrada.nextLine();
            String nome = entrada.nextLine();
            double preco = entrada.nextDouble();
            vetor[i] = new Product(nome, preco);

        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i].getPrice();
        }

        double media = soma/ vetor.length;

        System.out.printf("Preço médio é: %.2f%n" , media);

        entrada.close();

    }
}
