/*
Desenvolupa un programa que mostri tres enters separats per comes tenint en comptes que els tres valors es troben emmagatzemats en un array d'enters.
*/

public class EntersEntreComes {

    public static void main(String[] args) {

        int[] numeros;

        numeros = new int[5];
        System.out.println("Valor 1?");
        numeros[0] = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor 2?");
        numeros[1] = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor 3?");
        numeros[2] = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor 4?");
        numeros[3] = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor 5?");
        numeros[4] = Integer.parseInt(Entrada.readLine());
        

        System.out.print(numeros[0]);

        for (int i = 1; i < numeros.length; i++) {

            System.out.print(", " + numeros[i]);

        }

        System.out.println();

    }

}
