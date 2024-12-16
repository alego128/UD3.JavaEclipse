/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud3;

/**
 *
 * @author Alego
 */

import java.util.Arrays;

public class Ejercicio14 {
    public static void main(String[] args) {
        //Copiar el array original al destino
        
        //Array original
        int [] original = {1,2,3,4,5};
        
        //Array destino
        int [] copia = new int [original.length];
        
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
        System.out.println(Arrays.toString(copia));
        
        System.out.println(Ejercicio13.compararArrays(original, copia));
        
    }
}