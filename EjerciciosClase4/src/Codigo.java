/*
 * Sesión: S12 – Métodos de biblioteca
 * Ejercicio 05: código de 6 caracteres
 * Enunciado: generar un código de 6 caracteres: 3 letras aleatorias + 3 dígitos aleatorios.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

import java.util.Random;

public class Codigo {

    public static void main(String[] args) {

        Random azar = new Random();

        String codigo = "";

        for (int i = 1; i <= 3; i++) {

            char letra = (char) ('A' + azar.nextInt(26));

            codigo = codigo + letra;
        }

        for (int i = 1; i <= 3; i++) {

            int numero = azar.nextInt(10);

            codigo = codigo + numero;
        }

        System.out.println("Codigo: " + codigo);
    }
}
