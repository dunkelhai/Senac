package Atividades.src.com.sharkdays;

import javax.swing.*;

public class ProcedimentoParametroRetorno {

    public static boolean ePrimo(long numero){
        if (numero < 2){
            return false;
        }
        for (long i = 2; i <= (numero /2); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        long x = 6;

        if (ePrimo(x)){
            JOptionPane.showMessageDialog(null, x + " é primo!");
        }else{
            JOptionPane.showMessageDialog(null, x + " Não é primo!");
        }

    }
}
