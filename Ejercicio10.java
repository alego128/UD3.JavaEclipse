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


public class Ejercicio10 {
    public static void main(String[] args) {
        
        int [] n = new int [10];
        
        Arrays.fill(n, 3);
        System.out.println(Arrays.toString(n));
        
        Arrays.fill(n, 5, 8, 7);
        System.out.println(Arrays.toString(n));
    }
    
}
