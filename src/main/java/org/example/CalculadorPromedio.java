package org.example;

import java.util.Random;

public class CalculadorPromedio {
    public static void main(String[] args) {
      mostrarEstado(calcularPromedio(generarNotasAleatorias(5)));
    }
    public static double calcularPromedio(double[] notas) {
        imprimirNotas(notas);
        //System.out.println(notas);
        int cantidadNotas = notas.length;
        double sumNotas = 0;

        for (double nota : notas) {
            sumNotas += nota;
        }

        return sumNotas / cantidadNotas;
    }
    public static void imprimirNotas(double[] notas) {
         for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + i + ": " +notas[i]);
        }
    }
    public static void imprimirNotas2(double[] notas) {
         for (double num : notas) {
            System.out.println(num);
        }
    }
    public static void mostrarEstado(double promedio) {
        if (promedio >= 4.0) {
            System.out.println("¡Felicitaciones, aprobaste!");
        } else if (promedio < 3.6) {
            System.out.println("Lo siento, reprobaste.");
        } else {
            System.out.println("Vas a examen.");
        }
    }
        public static double[] generarNotasAleatorias(int size) {
        double[] notasRandom = new double[size];
        for (int i = 0; i < size; i++) {
            notasRandom[i] = 1.0 + (6.0) * Math.random();
        }

        return notasRandom;
    }
}
