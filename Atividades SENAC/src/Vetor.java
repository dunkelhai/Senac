import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha o tamanho do vetor: ");
        int numero = entrada.nextInt();
        double[] vetor = new double[numero];

        for (int i = 0; i < numero; i++){
            System.out.println("Digite o primeiro item do vetor: ");
            vetor[i] = entrada.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < numero; i++){
            soma += vetor[i];
        }

        double media = soma / numero;

        System.out.printf("A média é: %.2f%n" , media);

        entrada.close();

    }
}
