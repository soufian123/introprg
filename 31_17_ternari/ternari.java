
/*
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class ternari {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        int un = "parell";
        int dos = "senar";
        int resultat = (numero % 2 == 0);
        
        if (resultat){
            System.out.println("El número "+ numero +" és "+ un);
        } else{
            System.out.println("El número "+ numero +" és "+ dos);
        }
    }
}
