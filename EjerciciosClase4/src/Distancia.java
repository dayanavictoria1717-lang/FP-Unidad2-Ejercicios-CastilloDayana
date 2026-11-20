/*
 * Sesión: S12 – Métodos de biblioteca
 * Ejercicio 01: distancia entre dos puntos
 * Enunciado: distancia entre dos puntos con Math.sqrt y Math.pow.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class Distancia {

    public static void main(String[] args) {

        double x1 = 2;
        double y1 = 3;

        double x2 = 5;
        double y2 = 7;

        double distancia = Math.sqrt(
            Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.println("Distancia: " + distancia);
    }
}
