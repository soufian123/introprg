/*
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class ParellSenar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);

        String resultat;
        
        if (numero % 2 == 0){
            resultat = "parell";

        } else{
            resultat = "senar";

        } 
            System.out.println("El número "+ numero +" és "+ resultat);
        
    }
}
