/* 
 * Desenvolupa un programa que demani un text i mostri la suma dels dígits que conté.
 */
/*
FALLIDA
public class Subcadenes {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        if(text.isEmpty()){
            return;
        }
        if(text.length()<=1){
        System.out.printf("%4d: %s%n", text.length() , text);
            return;
        }
        
        String texto=text.replace(" ", "");
        int num=0;
        int espacios = text.length() - texto.length();
        System.out.printf("%4d: %s%n", texto.length() , texto);
        
        imprimir(text, num, espacios);
        
    }

    public static void imprimir(String text, int num, int espacios){



        String[] part = new String[espacios];

        part= text.split(" ");
        String texto= part[num];
        
        String resultat = extreuLletres(texto, num);
        if(num!=espacios){
            num++;
        }
        System.out.printf("%4d: %s%n", text.length() , resultat);
        imprimir(text, num, espacios);
    }
    
    
    public static String extreuLletres(String text, int num) {
    

        char primer = text.charAt(0);
        
        String lletresPrimerCaracter = "";
        if (Character.isLetter(primer)) {
            lletresPrimerCaracter = lletresPrimerCaracter+primer;
        }
        
        // tracta pas recursiu
         String restaText =text.substring(1);  // resta del text
         
        // composa resultat
        
        String lletresRestaText = extreuLletres(restaText, num);
         String total = lletresPrimerCaracter + lletresRestaText;
            return total;
    }
    

}
*/



public class Subcadenes {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        text = borrar(text); 
        imprimir(text, text.length());
    }
// borra els caràcters que no siguin lletres
    public static String borrar(String text) {
        if (text.length() <= 1) {
            return text.replaceAll("[^a-zA-Z]", "");
        }
        String primer = text.substring(0, 1);
        if (!Character.isLetter(primer.charAt(0))) {
            primer = "";
        }
        return primer + borrar(text.substring(1));
    }

    public static void imprimir(String text, int length) {
        if (length <= 1) {
            System.out.printf("%4d: %s%n", length, text);
            return;
        }
        System.out.printf("%4d: %s%n", length, text);
        int mid = text.length() / 2;
        imprimir(text.substring(0, mid), mid);
        imprimir(text.substring(mid), text.length() - mid);
    }
}



