/*
 * Sesión: S11 – Ámbito de variables y static
 * Ejercicio 02: líneas que no compilan
 * Enunciado: las líneas con error comentadas (//), con el mensaje del compilador y la causa.
 * Autor: Dayana Castillo
 * Fecha: 19/11/2026
 */

public class Errores {

    public static void main(String[] args) {

        int numero = 10;

        for (int i = 0; i < 3; i++) {
            int resultado = i + numero;
            System.out.println(resultado);
        }

        // System.out.println(i);
        // Mensaje del compilador: error: cannot find symbol (symbol: variable i)
        // Causa: i es una variable de bloque, se declaro en el for y deja de existir
        //        cuando el for termina; fuera del for ya no se puede usar.

        // System.out.println(resultado);
        // Mensaje del compilador: error: cannot find symbol (symbol: variable resultado)
        // Causa: resultado se declaro dentro del cuerpo del for (variable de bloque),
        //        por lo tanto solo existe dentro de las llaves del for.

        // int numero = 20;
        // Mensaje del compilador: error: variable numero is already defined in method main(String[])
        // Causa: numero ya se declaro arriba en el mismo metodo; en Java no se puede
        //        declarar dos veces una variable con el mismo nombre en el mismo ambito.

    }
}
