package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.metodos.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro da CalculadoraTest04");
        System.out.println("a " + a);
        System.out.println("b " + b);
    }
}
