package test.java.org.example;

import main.java.org.example.CalculadoraSimples;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraSimplesTest {

    @Test
    public void testSoma() {
        double resultado = CalculadoraSimples.somar(5.0, 3.0);
        Assertions.assertEquals(8.0, resultado);
    }

    @Test
    public void testSubtracao() {
        double resultado = CalculadoraSimples.subtrair(5.0, 3.0);
        Assertions.assertEquals(2.0, resultado);
    }

    @Test
    public void testMultiplicacao() {
        double resultado = CalculadoraSimples.multiplicar(5.0, 3.0);
        Assertions.assertEquals(15.0, resultado);
    }

    @Test
    public void testDivisao() {
        double resultado = CalculadoraSimples.dividir(5.0, 3.0);
        Assertions.assertEquals(1.6666666666666667, resultado);
    }
}

