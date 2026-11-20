/*
 * Sesión: Clase 1 – Métodos con parámetros y retorno
 * Ejercicio 01: esMultiplo(int a, int b)
 * Enunciado: devuelve true si a es múltiplo de b.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class EsMultiplo{
    static boolean esMultiplo (int a, int b) {
        return a % b == 0;
        
    }
    public static void main(String[] args) {
        int valor1 = 444;
        int valor2 = 222;
        System.out.println(esMultiplo(valor1,valor2));
    }
}
