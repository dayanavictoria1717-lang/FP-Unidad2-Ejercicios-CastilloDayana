/*
 * Sesión: Clase 1 – Métodos con parámetros y retorno
 * Ejercicio 02: imprimirTabla(int n)
 * Enunciado: imprime la tabla de multiplicar de n (void).
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class ImprimirTabla {
    static void imprimirTabla (int n) {
        for (int i= 1; i<=10; i++){
            System.out.println(n * i);
        }
    }
    public static void main(String[] args) {
        imprimirTabla(2);
    }
}
