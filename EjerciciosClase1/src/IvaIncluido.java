/*
 * Sesión: Clase 1 – Métodos con parámetros y retorno
 * Ejercicio 04: ivaIncluido(double precio)
 * Enunciado: devuelve el precio con IVA del 15 %.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class IvaIncluido {
    static double ivaIncluido(double precio) {
        return precio + (precio * 0.15);
    }
    public static void main(String[] args) {
        System.out.println(ivaIncluido(100));
    }
}
