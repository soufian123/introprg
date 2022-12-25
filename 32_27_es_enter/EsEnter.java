//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.

//Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.


public class EsEnter{
    public static void main (String[] args){
    
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text= Entrada.readLine();


        while (!(text.isBlank() || text.isEmpty())){
        
        
            if (!(text.isBlank() || text.isEmpty())){
                boolean comprovar = UtilString.esEnter(text);
                
                
                if (comprovar==true){
                    System.out.println("No és enter");
                
                }else{System.out.println("És enter");}
            }    
                text= Entrada.readLine();

            }
        System.out.println("Adéu");
        
    }
} 




