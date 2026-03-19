package org.example;


public class Calculator {
    // Metodo de Adição
    public double somar(double a, double b) {
        return a + b;
    }

    // Metodo de Subtração
    public double subtrair(double a, double b) {
        return a - b;
    }

    //Metodo de Multiplicação
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Metodo de Divisão com tratamento de erro
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        return a / b;
    }
}
