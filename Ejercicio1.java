package Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] enteros = {1, 2, 3, 4, 5};         
        double[] dobles = {1.1, 2.2, 3.3, 4.4, 5.5}; 
        boolean[] booleanos = {true, false, true, false, true}; 
        

        System.out.println("Referencia de la tabla de enteros: " + enteros);
        System.out.println("Referencia de la tabla de dobles: " + dobles);
        System.out.println("Referencia de la tabla de booleanos: " + booleanos);


        System.out.println("Valores en la tabla de enteros: ");
        for (int i : enteros) {
            System.out.print(i + " ");
        }
        System.out.println("\nValores en la tabla de dobles: ");
        for (double d : dobles) {
            System.out.print(d + " ");
        }
        System.out.println("\nValores en la tabla de booleanos: ");
        for (boolean b : booleanos) {
            System.out.print(b + " ");
        }
    }
}
