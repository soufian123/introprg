
/*
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class ParellSenar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        int resultat;
        
        if (numero % 2 == 0){
          resultat = 1;
        } else{
           resultat = 2;
        }
        System.out.println("El número "+ numero +" és "+ resultat);
    }
}
