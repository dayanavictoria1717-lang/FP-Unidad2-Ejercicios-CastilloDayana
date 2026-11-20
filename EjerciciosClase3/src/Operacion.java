/*
 * Sesión: S11 – Ámbito de variables y static
 * Ejercicio 04: reescribir sin static
 * Enunciado: la versión original (comentada) y la nueva, que use parámetros y return.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

//VERSION ORIGINAL:
//
// public class Operacion {
//
//     static double n1;
//     static double n2;
//     static double n3;
//
//     static double sumar() {
//         return n1 + n2 + n3;
//     }
//
//     static double promedio() {
//         return sumar() / 3;
//     }
//
//     public static void main(String[] args) {
//
//         n1 = 8;
//         n2 = 9;
//         n3 = 10;
//
//         double resultado = promedio();
//
//         System.out.println("Promedio: " + resultado);
//     }
// }
//
// VERSION NUEVA:

public class Operacion {

    static double sumar(double a, double b, double c) {
        return a + b + c;
    }

    static double promedio(double a, double b, double c) {
        return sumar(a, b, c) / 3;
    }

    public static void main(String[] args) {

        double resultado = promedio(8, 9, 10);

        System.out.println("Promedio: " + resultado);
    }
}
