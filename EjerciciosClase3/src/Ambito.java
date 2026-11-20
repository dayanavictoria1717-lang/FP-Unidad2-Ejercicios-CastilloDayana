/*
 * Sesión: S11 – Ámbito de variables y static
 * Ejercicio 01: marcar ámbitos
 * Enunciado: programa con un comentario en cada variable que diga si es local, de bloque o static.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class Ambito {

    static int contador = 0; // static: pertenece a la clase, vive todo el programa y la ven todos los metodos

    public static void main(String[] args) { // args: parametro, es local de main

        int suma = 0; // local: vive en main, desde que se declara hasta que termina main

        for (int i = 1; i <= 3; i++) { // i: de bloque, solo existe dentro del for

            int numero = i * 2; // de bloque: se crea y se destruye en cada vuelta del for

            suma = suma + numero; // suma (local) se puede usar aqui porque el for esta dentro de main

            contador++; // contador (static) se puede usar en cualquier parte de la clase
        }

        System.out.println("Suma: " + suma);
        System.out.println("Contador: " + contador);
    }
}
