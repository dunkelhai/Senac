package Atividades.src.com.application;

import Atividades.src.com.entities.ContaBancaria;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1, "Jonas", 20000);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá " + conta1.getTitular() + " ! \nO que deseja fazer?\n" +
                "1- Sacar\n2-Depositar");
        int escolha = entrada.nextInt();
        if (escolha == 1){
            System.out.println("Seu saldo atual é: " + conta1.getSaldo());
            System.out.println("Ainda deseja sacar?\n1- Continuar\n2- Cancelar");
            escolha = entrada.nextInt();
            if (escolha == 1){
                System.out.println("Quanto você deseja sacar?");
                escolha = entrada.nextInt();
                System.out.println("Saque efetuado no valor de " + escolha);
                conta1.setSaldo(conta1.getSaldo() - escolha);
            }
        }
        System.out.println(conta1);
    }
}
