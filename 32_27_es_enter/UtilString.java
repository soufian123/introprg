








public class UtilString{

    public static boolean esEnter(String text){


        boolean resultat=true;
    
        for(int num=0; num<=(text.length()-1); num++){
            if(!(Character.isDigit(text.charAt(num)) || Character.isWhitespace(text.charAt(num))|| text.charAt(num)=='+' || text.charAt(num)=='-')){
                resultat=false;
            }
            
            if((text.length()-2)<=num && text.charAt(num)=='+'){
                resultat=false;
            }
                    
            if((text.length()-2)<=num && text.charAt(num)=='-'){
                resultat=false;
            }
        }
        return resultat;
    }
}







