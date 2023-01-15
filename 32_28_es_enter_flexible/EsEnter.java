//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.

//Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.


public class EsEnter{
    public static void main (String[] args){
    
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text= Entrada.readLine();
        boolean obtingut= false;
        boolean tr=true;
        int numero=0;
        String texto="";
        while (!(text.isBlank() || text.isEmpty())){
        
        
            if (!(text.isBlank() || text.isEmpty())){
                obtingut= false;

                text= text.trim();
                obtingut = UtilString.esEnter(text, tr );
                numero= UtilString.aEnter(text , obtingut );
                
                if (numero % 2 == 0){
                    System.out.println("No és enter");

                }else{System.out.println("És enter");}
            }    
                text= Entrada.readLine();
                obtingut= false;
                texto="";
            }
        System.out.println("Adéu");
        
    }
} 




