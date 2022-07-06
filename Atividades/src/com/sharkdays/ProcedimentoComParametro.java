package Atividades.src.com.sharkdays;

import javax.swing.*;

public class ProcedimentoComParametro {
    public static void fatorar(int numero){
        int fator = 1;
        for (int i = numero; i > 1; i--){
            fator = fator * i;
        }

        JOptionPane.showMessageDialog(null, "Fatorial de " + numero + " é " + fator);
    }

    public static void main(String[] args) {

        fatorar(10);

    }
}
