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
        String nombres="";
        boolean ns=true;
        // cas base
        if ( text.isEmpty()) {      // cas base
            return nombres;
        }

        // tracta pas actual
        char primer = text.charAt(0);
        
        if (Character.isDigit(primer)) {
            ns=true;
        }else{
            ns=false;
        }

        // tracta pas recursiu
         String restaText =text.substring(1);  // resta del text
        
        // composa resultat
        extreuNombres(nombres); 
        if(ns){
            return text.charAt(0)+restaText;
        }else{
            return restaText;
        }
    }

}
