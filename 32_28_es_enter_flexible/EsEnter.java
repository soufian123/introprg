//Desenvolupa un programa que vagi demanant texts fins rebre la cadena buida.

//Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.


public class EsEnter{
    public static void main (String[] args){
    
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text= Entrada.readLine();
        boolean obtingut= false;
        int numero=0;
        String texto="";
        while (!(text.isBlank() || text.isEmpty())){
        
        
            if (!(text.isBlank() || text.isEmpty())){
                obtingut= false;
                //treu tots els espais en blanc, + i -
        for(int num=0; num<=(text.length()-1); num++){
            if( Character.isWhitespace(text.charAt(num))|| text.charAt(num)=='+' || text.charAt(num)=='-'){
            }else {
                texto= texto + text.charAt(num);
            }
        }
                obtingut = esEnter(text /*, obtingut */);
                numero= aEnter(text , obtingut );
                
                if (numero==1){
                    System.out.println("És enter");
                
                }else{System.out.println("No és enter");}
            }    
                text= Entrada.readLine();
                obtingut= false;
            }
        System.out.println("Adéu");
        
    }
        public static boolean esEnter(String text /*, boolean estricte */){


        boolean resultat=true;
        boolean texts=true;
        String texto="";
        //treu tots els espais en blanc, + i -
        for(int num=0; num<=(text.length()-1); num++){
            if( Character.isWhitespace(text.charAt(num))|| text.charAt(num)=='+' || text.charAt(num)=='-'){
            }else {
                texto= texto + text.charAt(num);
            }
        }
        //comprova si tot es lletra o numero 
        for(int num=0; num<=(texto.length()-1); num++){
            if(Character.isLetter(texto.charAt(num))){

            }else {
                return false;
            }
        }
        return true;
        
    }


    public static int aEnter(String text , boolean texts ){

        boolean resultat=true;
        String texto="";
        //treu tots els espais en blanc, + i -
        for(int num=0; num<=(text.length()-1); num++){
            if( Character.isWhitespace(text.charAt(num))|| text.charAt(num)=='+' || text.charAt(num)=='-'){
            }else {
                texto= texto + text.charAt(num);
            }
        }
        //comprovacio si es enter o no en el cas de lletra
        if (texts){
            int numeroLletra=(text.length()-1);
            if (numeroLletra % 2 == 0){
                resultat= true;
            }else{
                resultat=false;
            }

        }

        //comprovacio si es enter o no en el cas de numero
        if(texts==false){

            int numero= Integer.parseInt((texto));
            if (numero % 2 == 0){
                resultat= false;
            }else{
                resultat=true;
            }

        }
        if (resultat){
            return 1;
        }else{
            return 2;
        }

    
    
    }
    
} 




