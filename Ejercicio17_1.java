package ejerciciosud3;

import java.util.Scanner;
/**
 *
 * @author Alego
 */
public class Ejercicio17_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugador 1, introduce la contrasenia:");
        String contrasenia = scanner.nextLine();

        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Jugador 2, adivina la contrasenia:");
        String intento;

        do {
            System.out.print("Introduce la contrasenia: ");
            intento = scanner.nextLine();

            if (intento.compareTo(contrasenia) < 0) {
                System.out.println("La palabra es menor alfabeticamente");
            } else if (intento.compareTo(contrasenia) > 0) {
                System.out.println("La palabra es mayor alfabeticamente");
            } else {
                System.out.println("Correcto , has acertado la contrasenia");
            }
        } while (!intento.equals(contrasenia));

    }
}
