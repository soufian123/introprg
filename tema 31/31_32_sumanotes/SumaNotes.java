/*
 *
 *aquest programa Suma notes positius
 *
 */


public class SumaNotes {
    public static void main(String[] args) {

        // creem la variable on guardarem el resultat de sumar
        int suma = 0;   // inicialment no hem sumat res i per tant és 0

        // demanem valors

        // declarem la variable que contindrà els valors llegits
        int valor;
        // processem el primer valor
        System.out.println("Introdueix una nota");
        valor = Integer.parseInt(Entrada.readLine());
        
        while (valor >=0 && valor<=100) {
            suma = suma + valor;
            System.out.println("Introdueix una nota");
            valor = Integer.parseInt(Entrada.readLine());
        }


        System.out.println("La suma de les notes vàlides és "+ suma);

    }
}
