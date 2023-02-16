//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.

//Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.


public class EsEnter{
    public static void main (String[] args){
    
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text= Entrada.readLine();
        text = text.strip();
        while (!(text.isBlank())){

            if (!(text.isBlank() || text.isEmpty())){

                if (UtilString.esEnter(text)){
                    System.out.println("És enter");
                
                }else{System.out.println("No és enter");}
            }    
                text= Entrada.readLine();
                text = text.strip();

            }
        System.out.println("Adéu");
        
    }
} 




