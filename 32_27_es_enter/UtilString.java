








public class UtilString{

    public static boolean esEnter(String text){


        boolean resultat=true;
    
        for(int num=0; num<=(text.length()-1); num++){
            if (text=="-1" || text=="+1"){
            return true;
            }
            
            
            if(!(Character.isDigit(text.charAt(num)) || Character.isWhitespace(text.charAt(num))|| text.charAt(num)=='+' || text.charAt(num)=='-' || text=="," || text=="  ," || text=="1" || text=="1")){
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







