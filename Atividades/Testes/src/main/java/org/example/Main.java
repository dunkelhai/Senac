package main.java.org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       PositivoNegativoZero.verificarPositivoNegativoZero(2);

       Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o programa:" +
                "\n1-Calc" +
                "\n2-ParOuImpar" +
                "\n3-PositivoNegativo");
        int escolha = entrada.nextInt();

        if (escolha == 1){
            calcula();
        }
        if (escolha == 2){
            parOuImpar();
        }
        if (escolha == 3){
            positivoOuNegativo();
        }
        System.out.println();
    }
    public static void calcula(){
        int n1;
        int n2;
        int escolha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero:");
        n2 = entrada.nextInt();
        System.out.println("Escolha a operação:" +
                "\n1- Adição" +
                "\n2- Subtração" +
                "\n3- Multiplicação" +
                "\n4- Divisão");
        escolha = entrada.nextInt();
        if (escolha == 1) {
            System.out.println(n1 + n2);
        } else if (escolha == 2) {
            System.out.println(n1 - n2);
        } else if (escolha == 3) {
            System.out.println(n1 * n2);
        } else {
            System.out.println(n1 / n2);
        }
    }
    public static void parOuImpar(){
        Scanner entrada = new Scanner(System.in);
        int numero1;
        numero1 = entrada.nextInt();
        if (numero1 % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
    }
    public static void positivoOuNegativo(){
        Scanner entrada = new Scanner(System.in);
        int numero1;
        numero1 = entrada.nextInt();
        if (numero1 > 0){
            System.out.println("positivo");
        } else if (numero1 == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("negativo");
        }
    }
}