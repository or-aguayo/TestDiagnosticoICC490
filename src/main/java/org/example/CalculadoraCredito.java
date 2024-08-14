package org.example;

public class CalculadoraCredito {

    public static void main(String[] args) {
        ejecutarSimulacion(1000000, 10);  // Prueba 1: Crédito de 1.000.000 con 10 cuotas
        ejecutarSimulacion( 500000, 25);   // Prueba 2: Crédito de 500.000 con 25 cuotas
        ejecutarSimulacion(2500000, 20);  // Prueba 3: Crédito de 2.500.000 con 20 cuotas
    }
    public static double calcularMontoTotal(double capital, int cuotas) {
        double tasaInteres = determinarTasaInteres(capital, cuotas);
        return aplicarInteres(capital, tasaInteres);
    }

   public static double calcularCuotaMensual(double montoTotal, int cuotas) {
        return montoTotal / cuotas;
    }

   private static double determinarTasaInteres(double capital, int cuotas) {
        if (capital <= 1000000) {
            if (cuotas <= 12) {
                return 0.25;
            } else if (cuotas <= 23) {
                return 0.30;
            } else {
                return 0.35;
            }
        } else {
            if (cuotas <= 12) {
                return 0.15;
            } else if (cuotas <= 23) {
                return 0.20;
            } else {
                return 0.25;
            }
        }
    }

    private static double aplicarInteres(double capital, double tasaInteres) {
        return capital * (1 + tasaInteres);
    }

    private static void imprimirResultados(double montoTotal, double cuotaMensual) {
        System.out.println("Monto total a pagar: " + (int) montoTotal);
        System.out.println("Cuota mensual: " + (int) cuotaMensual);
        System.out.println();  // Línea en blanco para separar los resultados
    }
    private static void ejecutarSimulacion( double capital, int cuotas) {
        double montoTotal = calcularMontoTotal(capital, cuotas);
        double cuotaMensual = calcularCuotaMensual(montoTotal, cuotas);
        imprimirResultados(montoTotal, cuotaMensual);
    }
}

