package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void somar() {
        // Teste simples
        assertEquals(10.0, calc.somar(5.5, 4.5), "A soma de 5.5 + 4.5 deve ser 10");
        // Teste com números negativos
        assertEquals(-2.0, calc.somar(-5.0, 3.0), "A soma de -5 + 3 deve ser -2");
    }

    @Test
    void subtrair() {
        assertEquals(5.0, calc.subtrair(10.0, 5.0), "10 - 5 deve ser 5");
        assertEquals(0.0, calc.subtrair(2.5, 2.5), "Números iguais devem resultar em 0");
    }

    @Test
    void multiplicar() {
        assertEquals(20.0, calc.multiplicar(4.0, 5.0), "4 * 5 deve ser 20");
        assertEquals(0.0, calc.multiplicar(10.0, 0.0), "Qualquer número vezes 0 deve ser 0");
    }

    @Test
    void dividir() {
        // Cenário Feliz (Happy Path)
        assertEquals(2.0, calc.dividir(10.0, 5.0), "10 / 5 deve ser 2");

        // Cenário de Exceção (Onde o QA brilha)
        assertThrows(ArithmeticException.class, () -> calc.dividir(10.0, 0), "Deveria lançar ArithmeticException ao dividir por zero");
    }
}
