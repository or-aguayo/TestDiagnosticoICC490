package org.example;

import java.util.Scanner;

public class InvertirString {

    public static void main(String[] args) {
        System.out.println("El texto invertido es: "+invertir(leerDato()));
    }
    public static String leerDato() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public static String invertir(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
