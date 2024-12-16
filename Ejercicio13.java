
package ejerciciosud3;

public class Ejercicio13 {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {3, 2, 1};

        System.out.println("Comparando array1 y array2: " + compararArrays(array1, array2)); 
        System.out.println("Comparando array1 y array3: " + compararArrays(array1, array3)); 
        System.out.println("Comparando array2 y array3: " + compararArrays(array2, array3));
    }

    public static boolean compararArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
