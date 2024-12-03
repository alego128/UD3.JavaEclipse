/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud3;

/**
 *
 * @author Alego
 */

import java.util.Scanner; 

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros desea introducir?");
        int cantidad = sc.nextInt();

        int[] numeros = new int[cantidad];

        System.out.println("Por favor, ingrese " + cantidad + " números enteros:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();  
        }

        System.out.println("Los números en orden inverso son:");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.println(numeros[i]);  
        }

        sc.close();
    }
}
