/*
Desenvolupa un programa que mostri tres enters separats per comes tenint en comptes que els tres valors es troben emmagatzemats en un array d'enters.
*/

public class EntersEntreComes {

    public static void main(String[] args) {

        int[] numeros;

        numeros = new int[3];

        numeros[0] = 1;

        numeros[1] = 2;

        numeros[2] = 3;

        System.out.print(numeros[numeros[0]]);

        for (int i = 1; i < numeros[3]; i++) {

            System.out.print(", " + numeros[i]);

        }

        System.out.println();

    }

}
