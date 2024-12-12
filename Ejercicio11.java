package EjerciciosUD3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1; 
        }

        System.out.println("Array generado con numeros aleatorios:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce un numero para buscar: ");
        int numeroBuscar = scanner.nextInt();

        int posicionLinea = buscarNumero(numeros, numeroBuscar);

        int[] numerosOrdenados = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(numerosOrdenados);

        int posicionBinaria = Arrays.binarySearch(numerosOrdenados, numeroBuscar);

        System.out.println("Metodo de busqueda lineal:");
        if (posicionLinea != -1) {
            System.out.println("El numero " + numeroBuscar + " se encuentra en la posicion " + posicionLinea);
        } else {
            System.out.println("El numero " + numeroBuscar + " no se encuentra en el array.");
        }

        System.out.println("Metodo binarySearch:");
        if (posicionBinaria >= 0) {
            System.out.println("El numero " + numeroBuscar + " se encuentra en la posicion " + posicionBinaria);
        } else {
            System.out.println("El numero " + numeroBuscar + " no se encuentra en el array.");
        }
    }

    public static int buscarNumero(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i; 
            }
        }
        return -1; 
    }
}
