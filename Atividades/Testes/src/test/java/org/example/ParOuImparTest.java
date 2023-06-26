package test.java.org.example;

import main.java.org.example.ParOuImpar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParOuImparTest {

    @Test
    public void testPar() {
        boolean resultado = ParOuImpar.verificarParOuImpar(4);
        Assertions.assertTrue(resultado);
    }

    @Test
    public void testImpar() {
        boolean resultado = ParOuImpar.verificarParOuImpar(7);
        Assertions.assertFalse(resultado);
    }
}

