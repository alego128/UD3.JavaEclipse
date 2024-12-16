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

public class Ejercicio19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime una frase:");
        String frase = sc.nextLine();
        
        System.out.println(delReves(frase));
        
    }
    public static String delReves(String frase){
        String resultado = "";
        for (int i = frase.length() -1; i >= 0; i--) {
            resultado += frase.charAt(i);
        }
        return resultado;
    }
}