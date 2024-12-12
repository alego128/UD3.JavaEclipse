package EjerciciosUD3;

import java.util.Scanner;

public class Ejercicio17_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugador 1, introduce la contrasenia:");
        String contraseña = scanner.nextLine();

        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Jugador 2, adivina la contrasenia:");
        String intento;
        char[] pista = new char[contraseña.length()];

        for (int i = 0; i < pista.length; i++) {
            pista[i] = '*';
        }

        do {
            System.out.print("Introduce tu palabra: ");
            intento = scanner.nextLine();

            if (intento.length() == contraseña.length()) {
 
                for (int i = 0; i < contraseña.length(); i++) {
                    if (intento.charAt(i) == contraseña.charAt(i)) {
                        pista[i] = contraseña.charAt(i);
                    }
                }
            } else {
                System.out.println("La longitud de tu palabra no coincide con la contrasenia.");
            }

            System.out.println("Pista: " + String.valueOf(pista));

        } while (!String.valueOf(pista).equals(contraseña));

        System.out.println("Has acertado la contraseia");
        scanner.close();
    }
}
