//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.

//Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.


public class EsEnter{
    public static void main (String[] args){
    
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text= Entrada.readLine();
        boolean comprovar= false;

        while (!(text.isBlank() || text.isEmpty())){
        
        
            if (!(text.isBlank() || text.isEmpty())){
                comprovar= false;
            
                comprovar = UtilString.esEnter(text);
                
                
                if (comprovar){
                    System.out.println("És enter");
                
                }else{System.out.println("No és enter");}
            }    
                text= Entrada.readLine();
                comprovar= false;
            }
        System.out.println("Adéu");
        
    }
} 




