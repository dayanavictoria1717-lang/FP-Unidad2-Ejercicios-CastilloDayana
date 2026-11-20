/*
 * Sesión: Clase 1 – Métodos con parámetros y retorno
 * Ejercicio 05: esBisiesto(int anio)
 * Enunciado: devuelve true si el año es divisible para 4 y no para 100, o divisible para 400.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class Bisiesto{

    static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0)
                || (anio % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(esBisiesto(2028));
    }
}
