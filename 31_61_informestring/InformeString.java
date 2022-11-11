//Desenvolupa un programa que demani dos texts i un enter positiu i composi un petit informe amb el resultat de les funcions anteriors.


public class InformeString{
    public static void main (String[] args){
    
        
        System.out.println("Text principal?");
        String principal=Entrada.readLine();
        System.out.println("Text secundari?");
        String secundari=Entrada.readLine();
        System.out.println("Número positiu?");

        int numero= Integer.parseInt(Entrada.readLine());
       
        //Longitud de la cadena
        int length= principal.length();
        System.out.println("\""+principal+"\""+".length(): "+ length);
        
        //Boolean que indica si la cadena comença per l'altre
        boolean startsWith= principal.startsWith(secundari);
        System.out.println("\""+principal+"\""+".startsWith("+"\""+secundari+"\""+"): "+startsWith);
        
        //Boolean que indica si la cadena comença per l'altre
        boolean endsWith= principal.endsWith(secundari);
        System.out.println("\""+principal+"\""+".endsWith("+"\""+secundari+"\""+"): " +endsWith);
        
        //Boolean que indica si la cadena és igual a l'altre
        boolean equals= principal.equals(secundari);
        System.out.println("\""+principal+"\".equals("+"\""+secundari+"\"): "+"): " +equals);
        
        //Boolean que indica si la cadena és igual a l'altre
        boolean equalsIgnoreCase= principal.equalsIgnoreCase(secundari);
        System.out.println("\""+principal+"\""+".equalsIgnoreCase("+secundari+"): " +equalsIgnoreCase);
        
        //Boolean que indica si la cadena només conté caràcters blancs o bé està buida
        boolean isBlank= principal.isBlank();
        System.out.println("\""+principal+"\""+".isBlank(): " +isBlank);
        
        //Boolean que indica si la cadena està buida
        boolean isEmpty=principal.isEmpty();
        System.out.println("\""+principal+"\""+".isEmpty(): " +isEmpty);
        
        //Boolean que indica si la cadena està buida
        char charAt= principal.charAt(numero);
        System.out.println("\""+principal+"\""+".charAt("+numero+"): "+charAt);
        
        //Cadena resultant de concatenar la cadena amb l'altre
        String concat= principal.concat(secundari);
        System.out.println("\""+principal+"\""+".concat("+"\""+secundari+"\""+"): "+concat);
        
        //Cadena repetida el nombre de cops indicat
        String repeat= principal.repeat(numero);
        System.out.println("\""+principal+"\""+".repeat("+numero+"): "+repeat);
        
        //Cadena amb tot en majúscules
        String toUpperCase=principal.toUpperCase();
        System.out.println("\""+principal+"\""+".toUpperCase(): " +toUpperCase);
        
        //Cadena amb tot en minúscules
        String toLowerCase=principal.toLowerCase();
        System.out.println("\""+principal+"\""+".toLowerCase(): "+toLowerCase);
        
        
        
    }
}
