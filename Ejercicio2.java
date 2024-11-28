package Ejercicios;

import java.util.Arrays; 

public class Ejercicio2 {
    public static void main(String[] args) {
 
        int[] tablaOriginal = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        int[] referencia1 = tablaOriginal;
        int[] referencia2 = tablaOriginal;
        int[] referencia3 = tablaOriginal;


        System.out.println("Referencia de tablaOriginal: " + tablaOriginal);
        System.out.println("Referencia de referencia1: " + referencia1);
        System.out.println("Referencia de referencia2: " + referencia2);
        System.out.println("Referencia de referencia3: " + referencia3);

        System.out.println("\nValores accedidos desde referencia1: " + Arrays.toString(referencia1));
        System.out.println("Valores accedidos desde referencia2: " + Arrays.toString(referencia2));
        System.out.println("Valores accedidos desde referencia3: " + Arrays.toString(referencia3));
    }
}
