//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.

//Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.


public class EsEnter{
    public static void main (String[] args){
    
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text= Entrada.readLine();
        boolean comprovar= false;
        int numero=0;
        String texto="";
        while (!(text.isBlank() || text.isEmpty())){
        
        
            if (!(text.isBlank() || text.isEmpty())){
                comprovar= false;
                //treu tots els espais en blanc, + i -
        for(int num=0; num<=(text.length()-1); num++){
            if( Character.isWhitespace(text.charAt(num))|| text.charAt(num)=='+' || text.charAt(num)=='-'){
            }else {
                texto= texto + text.charAt(num);
            }
        }
                comprovar = UtilString.esEnter(text, comprovar);
                numero= UtilString.aEnter(text, comprovar);
                
                if (numero==1){
                    System.out.println("És enter");
                
                }else{System.out.println("No és enter");}
            }    
                text= Entrada.readLine();
                comprovar= false;
            }
        System.out.println("Adéu");
        
    }
} 




