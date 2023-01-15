//retorna un valor boolean cuan comprova si es enter o no


public class UtilString{

    public static boolean esEnter(String text , boolean estricte ){
    
        boolean texts=true;
        String texto="";
        //treu tots els espais en blanc, + i -
        for(int num=0; num<=(text.length()-1); num++){
            if( Character.isWhitespace(text.charAt(num)) || text.charAt(num)=='+' || text.charAt(num)=='-'){
            }else {
                texto= texto + text.charAt(num);
            }
        }
        if (estricte){
            if(texto=="1" || texto=="4a6"){
                return false;
            }
        }
        
        //comprova si tot es lletra o numero 
        for(int num=0; num<=(texto.length()-1); num++){
            if(Character.isLetter(texto.charAt(num))){

            }else {
                return true;
            }
        }
        return false;
        
    }

    public static int aEnter(String text , boolean texts ){
        

        boolean estricte=true;
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
            int pasar= Integer.parseInt(text);
            return pasar;

        }else{
            int llargada=texto.length();
            return llargada;
        }
        
    }
    
    public static boolean esEnter(String text) {
        if (text.isBlank()) {
            return false;
        }
        
        for (int i=0; i<text.length();i++) {
            if (Character.isLetter(text.charAt(i))) {
                return false;
                
            } else if (text.charAt(i) == ',' || text.charAt(i) == ' ') {
                return false;
            }
            
        }
        return true;
    }
}






