package main.java.org.example;

public class PositivoNegativoZero {
    public static String verificarPositivoNegativoZero(double numero) {
        if (numero > 0) {
            return "Positivo";
        } else if (numero < 0) {
            return "Negativo";
        } else {
            return "Zero";
        }
    }
}
