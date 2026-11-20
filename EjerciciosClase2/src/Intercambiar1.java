/*
 * Sesión: S10 – Paso de parámetros, arreglos y sobrecarga
 * Ejercicio 01: intercambiar(int a, int b)
 * Enunciado: escribe intercambiar(int a, int b) e intenta intercambiar dos variables de main. ¿Funciona? Explica.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class Intercambiar1 {

    public static void main(String[] args) {
        int x = 555;
        int y = 333;
        System.out.println("Antes en main:   x = " + x + " y = " + y);
        intercambiar(x, y);
        System.out.println("Despues en main: x = " + x + " y = " + y);
    }

    static void intercambiar(int a, int b) {
        int temporal = a;
        a = b;
        b = temporal;
        System.out.println("Dentro del metodo: a = " + a + " b = " + b);
    }
}

/*
 * No funciona. Dentro del método a y b sí quedan intercambiadas (a = 333, b = 555),
 * pero en main, x y y siguen valiendo 555 y 333.
 * Esto pasa porque Java pasa los tipos primitivos por valor.
