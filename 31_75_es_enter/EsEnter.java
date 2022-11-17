//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.

//Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.


public class EsEnter{
    public static void main (String[] args){
    
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text= Entrada.readLine();
        String numeros= ("0123456789+-");
        String comprovar="false";
        while (!(text.isBlank() || text.isEmpty())){
        
            if (!(text.isBlank() || text.isEmpty())){
                for(int num=0; num<=(text.length()-1); num++){
                    if(!(Character.isDigit(text.charAt(num)) || Character.isWhitespace(text.charAt(num))|| text.charAt(num)=='+' || text.charAt(num)=='-')){
                        comprovar="true";
                    

                    }
                }
                if (comprovar=="true"){
                    System.out.println("No és enter");
                
                }else{System.out.println("És enter");}
            }    
                text= Entrada.readLine();
                comprovar="false";
            }
        System.out.println("Adéu");
        
    }
}                




