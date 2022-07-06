package Atividades.src.com.sharkdays;

import java.util.Scanner;

public class EstruturasDeControle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número entre 1 e 4:");
        int num = entrada.nextInt();
        switch (num) {
            case 1:
                System.out.println("Você escolheu 1");
                break;
            case 2:
                System.out.println("Você escolheu 2");
                break;
            case 3:
                System.out.println("Você escolheu 3");
                break;
            case 4:
                System.out.println("Você escolheu 4");
                break;
            default:
                System.out.println("Número inválido");
        }


//      Scanner entrada = new Scanner(System.in);
//      System.out.println("Digite uma letra entre a e d:");
//        String letra = entrada.nextLine();
//      switch (letra) {
//            case "a":
//                System.out.println("Abacate");
//                break;
//            case "b":
//                System.out.println("Buriti");
//                break;
//            case "c":
//                System.out.println("Caju");
//                break;
//            case "d":
//                System.out.println("Damasco");
//                break;
//            default:
//                System.out.println("Letra inválida");
//        }
    }}



