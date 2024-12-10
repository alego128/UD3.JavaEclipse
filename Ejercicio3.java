
package ejerciciosud3;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {

        double [] sueldos = {1800, 1200, 2000, 1200, 900};

        for (int i = 0; i < sueldos.length; i++) {
            sueldos[i] = sueldos[i] * 1.10;
        }
        System.out.println("Sueldos después del aumento: " + Arrays.toString(sueldos));
    }
}
