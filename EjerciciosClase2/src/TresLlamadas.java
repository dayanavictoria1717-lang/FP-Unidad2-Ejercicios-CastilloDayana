/*
 * Sesión: S10 – Paso de parámetros, arreglos y sobrecarga
 * Ejercicio 05: predicción de salida
 * Enunciado: predice en papel la salida de un programa con 3 llamadas antes de ejecutarlo.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class TresLlamadas {

    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sumar(4, 6));

        System.out.println(sumar(3, 4));

        System.out.println(sumar(25, 7));
    }
}

/*
 * Salida predicha:
 *   sumar(4, 6)  -> 10
 *   sumar(3, 4)  -> 7
 *   sumar(25, 7) -> 32
 *   se imprimen tres líneas: 10, 7 y 32.
 *
 * Salida al ejecutar el programa:
 *   10
 *   7
 *   32
 *
 * La salida al ejecutar e programa si coincide con la predicha anteriormentee
 */
