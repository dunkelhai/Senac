package test.java.org.example;

import main.java.org.example.PositivoNegativoZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositivoNegativoZeroTest {

    @Test
    public void testPositivo() {
        String resultado = PositivoNegativoZero.verificarPositivoNegativoZero(5.6);
        Assertions.assertEquals("Positivo", resultado);
    }

    @Test
    public void testNegativo() {
        String resultado = PositivoNegativoZero.verificarPositivoNegativoZero(-3.2);
        Assertions.assertEquals("Negativo", resultado);
    }

    @Test
    public void testZero() {
        String resultado = PositivoNegativoZero.verificarPositivoNegativoZero(0);
        Assertions.assertEquals("Zero", resultado);
    }
}
