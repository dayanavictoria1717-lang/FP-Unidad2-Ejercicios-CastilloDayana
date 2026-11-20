/*
 * Sesión: Clase 1 – Métodos con parámetros y retorno
 * Ejercicio 03: promedio3(double a, double b, double c)
 * Enunciado: devuelve el promedio de tres números.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class Promedio{
    static double promedio(double a, double b, double c){
        return (a + b + c)/3;
    }
    public static void main (String[]args){
        double num1 = 10;
        double num2 = 9;
        double num3 = 8;
        System.out.println(promedio(num1, num2, num3));
    }

}
