/*
*
*un programa que vagi demanant enters positius i que, en el moment que 
*rebi un de negatiu, mostri el nombre de valors parells introduïts i finalitzi l'execució.
*
*
*/ 

public class QuantsParells {
    public static void main(String[] args) {

        int suma = 0;

        int valor = 0;

        while (valor >= 0) {

            System.out.println("Introdueix un valor");

            valor = Integer.parseInt(Entrada.readLine());

            if (valor % 2 == 0) {

                suma = suma + valor;

            }

        }

        System.out.println("Nombre de parells introduïts: " + suma);

    }

}
         


