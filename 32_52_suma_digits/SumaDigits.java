/* 
 * Desenvolupa un programa que demani un text i mostri la suma dels dígits que conté.
 */

public class SumaDigits {

    public static void main(String[] args){

        System.out.println("Text?");

        String text = Entrada.readLine();

        int nombres = sumaDigits(text);

        System.out.println(nombres);

    }


    // Suma numes els digits

    public static int sumaDigits(String text) {

        // cas base

        if ( text.isEmpty()) {      // cas base
            return 0;
        }


        // tracta pas actual

        char primer = text.charAt(0);
        
        int numeroPrimerCaracter=0;
        String lletra="";
        if (Character.isDigit(primer)) {
            lletra = lletra+primer;
            numeroPrimerCaracter=Integer.parseInt(lletra);
        }
        // tracta pas recursiu

        String restaText =text.substring(1);  // resta del text


        // composa resultat

        int numerosRestaText = sumaDigits(restaText);
        //int num= Integer.parseInt(numerosRestaText);
        int total = numeroPrimerCaracter + numerosRestaText;
        return total;

    }

}
