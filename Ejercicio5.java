
package ejerciciosud3;

/**
 *
 * @author Alego
 */
public class Ejercicio5 {

    public static int sumarEnteros(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma; 
    }

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5}; 

        int resultado = sumarEnteros(numeros);

        System.out.println("La suma de los elementos del array es: " + resultado);
    }
}
