
package ejerciciosud3;

import java.util.Scanner;

/**
 *
 * @author Alego
 */

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera frase:");
        String frase1 = scanner.nextLine();

        System.out.println("Introduce la segunda frase:");
        String frase2 = scanner.nextLine();

        if (frase1.length() < frase2.length()) {
            System.out.println("La frase mas corta es: " + frase1 + " con " + frase1.length() + " caracteres");
        } else if (frase1.length() > frase2.length()) {
            System.out.println("La frase mas corta es: " + frase2 +  " con " + frase2.length() + " caracteres");
        } else {
            System.out.println("Las frases tienen la misma longitud con " + frase1.length() + " caracteres");
        }
    }
}
