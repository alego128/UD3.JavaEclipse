/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud3;

/**
 *
 * @author Alego
 */
public class Ejercicio8 {
    
    public static int maximo(int[] t) {
        int max = t[0];
        
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {

        int[] numeros = {5, 3, 9, 1, 7, 6};
        int maxValor = maximo(numeros);
        System.out.println("El valor maximo en el array es: " + maxValor);
    }
}
