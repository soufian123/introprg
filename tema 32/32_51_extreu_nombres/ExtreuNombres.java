/* 
 * Desenvolupa un programa que demani un text i mostri només els valors numèrics que conté.
 */

public class ExtreuNombres {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nombres = extreuNombres(text);
        System.out.println(nombres);
    }

    // extreu els nombres i els retorna concatenats
    public static String extreuNombres(String text) {

        // cas base
        if ( text.isEmpty()) {      // cas base
            return "";
        }

        // tracta pas actual
        char primer = text.charAt(0);
        
        String lletresPrimerCaracter = "";
        if (Character.isDigit(primer)) {
            lletresPrimerCaracter = lletresPrimerCaracter+primer;
        }
        
        // tracta pas recursiu
         String restaText =text.substring(1);  // resta del text
         
        // composa resultat
        
        String lletresRestaText = extreuNombres(restaText);
         String total = lletresPrimerCaracter + lletresRestaText;
            return total;
    }
    

}
