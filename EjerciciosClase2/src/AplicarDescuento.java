/*
 * Sesión: S10 – Paso de parámetros, arreglos y sobrecarga
 * Ejercicio 03: aplicarDescuento(double[] precios, double pct)
 * Enunciado: aplicarDescuento(double[] precios, double pct) que modifique todo el arreglo. Se imprime el arreglo antes y después.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

import java.util.Arrays;

public class AplicarDescuento {

    public static void main(String[] args) {

        double[] precios = {156, 5, 75};

        System.out.println("Precio Inicial:");
        System.out.println(Arrays.toString(precios));

        aplicarDescuento(precios, 10);

        System.out.println("Precios final con descuento:");
        System.out.println(Arrays.toString(precios));

    }

    static void aplicarDescuento(double[] precios, double pct) {

        for (int i = 0; i < precios.length; i++) {

            precios[i] = precios[i] - (precios[i] * pct / 100);

        }

    }
}
