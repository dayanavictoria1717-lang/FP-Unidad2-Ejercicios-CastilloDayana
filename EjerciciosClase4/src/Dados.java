/*
 * Sesión: S12 – Métodos de biblioteca
 * Ejercicio 02: dados que suman 7
 * Enunciado: lanzar dos dados 1000 veces y contar cuántas veces suman 7 (Random), mostrando el conteo y el porcentaje.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

import java.util.Random;

public class Dados {

    public static void main(String[] args) {

        Random azar = new Random();

        int contador = 0;

        for (int i = 1; i <= 1000; i++) {

            int dado1 = azar.nextInt(6) + 1;
            int dado2 = azar.nextInt(6) + 1;

            if (dado1 + dado2 == 7) {
                contador++;
            }
        }

        double porcentaje = contador * 100.0 / 1000;

        System.out.println("Veces que sumaron 7: " + contador);
        System.out.printf("Porcentaje: %.2f %%%n", porcentaje);
    }
}
