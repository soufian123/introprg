/*
 * desenvoluparàs un programa que obtindrà un text per entrada estàndard i mostrarà per sortida
 * estàndard totes les subcadenes possibles, tenint en comptes només les lletres.
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
        
        int mid = text.length() / 2;
        imprimir(text.substring(0, mid), mid);
        imprimir(text.substring(mid), text.length() - mid);
        System.out.printf("%4d: %s%n", length, text);
    }
}


