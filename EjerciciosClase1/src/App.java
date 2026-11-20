/*
 * Sesión: Clase 1 – Métodos con parámetros y retorno
 * Ejercicio 06: main con Scanner
 * Enunciado: main que lea datos con Scanner y use los cinco métodos.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        int a = teclado.nextInt();
        System.out.print("Ingrese el valor de b: ");
        int b = teclado.nextInt();

        if (b != 0) {
            System.out.println("a es multiplo de b: " + EsMultiplo.esMultiplo(a, b));
        } else {
            System.out.println("b no puede ser 0");
        }

        System.out.print("Ingrese un numero para su tabla de multiplicar: ");
        int n = teclado.nextInt();
        ImprimirTabla.imprimirTabla(n);

        System.out.print("Ingrese la nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        double nota2 = teclado.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        double nota3 = teclado.nextDouble();
        System.out.println("Promedio: " + Promedio.promedio(nota1, nota2, nota3));

        System.out.print("Ingrese un precio: ");
        double precio = teclado.nextDouble();
        System.out.println("Precio con IVA: " + IvaIncluido.ivaIncluido(precio));

        System.out.print("Ingrese un anio: ");
        int anio = teclado.nextInt();
        System.out.println("El anio es bisiesto: " + Bisiesto.esBisiesto(anio));

        teclado.close();
    }
}
