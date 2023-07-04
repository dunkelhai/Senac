import javax.swing.*;
import java.util.Scanner;

public class DesafiosSenacJP2023 {
    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);

//        Double valor1, valor2, valor3;
//        String produto1, produto2, produto3;
//
//        System.out.println("Digite o nome do produto 1:");
//        produto1 = entrada.next();
//        System.out.println("Digite o nome do produto 2:");
//        produto2 = entrada.next();
//        System.out.println("Digite o nome do produto 3:");
//        produto3 = entrada.next();
//
//        System.out.println("Digite o valor do produto 1:");
//        valor1 = entrada.nextDouble();
//        System.out.println("Digite o valor do produto 2:");
//        valor2 = entrada.nextDouble();
//        System.out.println("Digite o valor do produto 3:");
//        valor3 = entrada.nextDouble();
//
//        if (valor1 < valor2 && valor1 < valor3){
//            System.out.println("Produto mais barato é o 1 " + produto1);
//        } else if (valor2 < valor1 && valor2 < valor3){
//            System.out.println("Produto mais barato é o 2" + produto2);
//        } else if (valor3 < valor1 && valor3 < valor2){
//            System.out.println("Produto mais barato é o 3" + produto3);
//        } else {
//            System.out.println("Inválido");
//        }

//        String nome = JOptionPane.showInputDialog(
//                "Escreva seu nome:");
//        JOptionPane.showMessageDialog(null,
//                "Olá " + nome);
//        int fome, dinheiro;
//        System.out.println("Está com fome?" +
//                "\n1- Sim" +
//                "\n2- Não");
//        fome = entrada.nextInt();
//        System.out.println("Tem dinheiro?" +
//                "\n1- Sim" +
//                "\n2- Não");
//        dinheiro = entrada.nextInt();
//        if (fome == 1 && dinheiro == 1){
//            System.out.println("Vá para a cantina!");
//        } else if (fome == 1 && dinheiro == 2){
//            System.out.println("Trabalhar que é bom nada.");
//        } else if (fome == 2 && dinheiro == 1){
//            System.out.println("Guarde o dinheiro.");
//        } else if (fome == 2 && dinheiro == 2){
//            System.out.println("Vá caçar o que fazer!");
//        } else {
//            System.out.println("Inválido!");
//        }
        try {
            Integer pontos = 0;
            JOptionPane.showMessageDialog(null,
                    "Seja bem-vindo ao quiz do Senac!");
            String nomeJogador = JOptionPane.showInputDialog(
                    "Digite seu nome:");
            String quiz1 = JOptionPane.showInputDialog(
                    "1- O que significa SENAC?" +
                            "\nA- CENTRO PARA LOUCOS" +
                            "\nB- SERVIÇO AO CONSUMIDOR" +
                            "\nC- SENTRO DEDETIZADOR DE PRAGAS" +
                            "\nD- DIA DA PIZZA" +
                            "\nE- SERVIÇO NACIONAL DE APRENDIZAGEM COMERCIAL");
            if (quiz1.equals("E") || quiz1.equals("e")) {
                JOptionPane.showMessageDialog(null,
                        "ACERTOU MISERAVI! BOM DIMAIZI! " + nomeJogador);
                pontos = 1;
            } else if (quiz1 != null) {
                JOptionPane.showMessageDialog(null,
                        "ERROU PANGARÉ! " + nomeJogador);
            } else {
                JOptionPane.showMessageDialog(null,
                        "OPÇÃO INVÁLIDA! " + nomeJogador);
            }
            JOptionPane.showMessageDialog(null,
                    "Você acertou " + pontos + " perguntas!");
        } catch (NullPointerException e){
            System.out.println("DEU ERRO DE NPE");
        }
    }
}
