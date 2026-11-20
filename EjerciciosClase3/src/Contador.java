/*
 * Sesión: S11 – Ámbito de variables y static
 * Ejercicio 03: traza del contador static
 * Enunciado: programa y, en un comentario, la tabla línea | variables vivas | valor.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class Contador {

    static int llamadas = 0;

    static void contar() {
        llamadas++;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            contar();
        }

        System.out.println("Llamadas: " + llamadas);
    }
}