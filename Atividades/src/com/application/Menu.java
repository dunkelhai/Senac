package Atividades.src.com.application;

import Atividades.src.com.entities.ContaBancaria;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        System.out.println("BEM-VINDO!");
        boolean continuar = true;
        try {
            do {
                int escolha = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n1-Continuar\n2- Sair"));
                if (escolha == 1) {
                    continuar = true;
                    int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado1"));
                    int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado2"));
                    int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado3"));
                    if (lado1 == lado2 && lado2 == lado3) {
                        JOptionPane.showMessageDialog(null, "Equilátero");
                    } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
                        JOptionPane.showMessageDialog(null, "Escaleno");
                    } else {
                        JOptionPane.showMessageDialog(null, "Isóceles");
                    }
                } else {
                    continuar = false;
                }
            } while (continuar);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Não há como converter letras em números!");
        }
    }
}
