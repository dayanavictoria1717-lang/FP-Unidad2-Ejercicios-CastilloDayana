/*
 * Sesión: S12 – Métodos de biblioteca
 * Ejercicio 04: contar vocales
 * Enunciado: contar las vocales de una frase, mayúsculas y minúsculas (String + Character).
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class Vocales {

    public static void main(String[] args) {

        String frase = "Hola mundo";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            char letra = Character.toLowerCase(frase.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u') {

                contador++;
            }
        }

        System.out.println("Cantidad de vocales: " + contador);
    }
}
