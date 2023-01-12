



//son utilitats de String




public class UtilString{
//retorna un boolean cuan comprova si es enter o no
        //comprova si tot es lletra o numero 
    public static boolean esEnter(String text) {
        if (text.isBlank()) {
            return false;
        }
        
        for (int i=0; i<text.length();i++) {
            if (Character.isLetter(text.charAt(i))) {
                return false;
                
            } else if (text.charAt(i) == ',' ) {
                return false;
            }
            
        }
        return true;
    }
}






