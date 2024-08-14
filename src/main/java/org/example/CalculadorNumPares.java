package org.example;

public class CalculadorNumPares {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumarPar(numeros);
        System.out.println("Suma de números pares: " + sum);
    }

    public static int sumarPar(int[] numeros) {
        int sum = 0;
        for (int number : numeros) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}

