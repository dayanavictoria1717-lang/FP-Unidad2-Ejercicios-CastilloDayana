/*
 * Sesión: S10 – Paso de parámetros, arreglos y sobrecarga
 * Ejercicio 02: intercambiar(int[] v, int i, int j)
 * Enunciado: escribe intercambiar(int[] v, int i, int j) que intercambie dos posiciones del arreglo. ¿Ahora sí?
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

import java.util.Arrays;
public class Intercambio2 {
    public static void intercambiar(int [] v, int i, int j) {
        int temporal = v[i];
        v[i] = v[j];
        v[j] = temporal;
    }
    public static void main(String[] args) {
        int[] v = {5, 10, 15};
        intercambiar(v, 0, 2);
        System.out.println("En main: " + Arrays.toString(v));

    }
}

/*
 * Por qué ahora sí funciona el codigo?
 * Porque un arreglo es un objeto: la variable v no guarda los valores, guarda la
 * referencia (la dirección) del arreglo. Al llamar intercambiar(v, 0, 2), el método
 * recibe una copia de esa referencia, pero apunta al MISMO arreglo que el de main.
 * Entonces, cuando el método hace v[i] = v[j], está modificando el arreglo real y
 * el cambio se ve en main: {5, 10, 15} pasa a {15, 10, 5}.
 */
