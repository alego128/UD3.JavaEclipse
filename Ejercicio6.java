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

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[5];

        System.out.println("Por favor, ingrese 5 números decimales:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("\nLos números que ingresó son:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
    }
}
