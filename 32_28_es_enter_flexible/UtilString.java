


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
            int numeroLletra=(text.length()-1);
            if (numeroLletra % 2 == 0){
                estricte= true;
            }else{
                estricte=false;
            }

        }
        //comprova si es numero y si ho es retorna el numero
        boolean si=true;
        int pasar=0;
        for(int num=0; num<=(text.length()-1); num++){
            if(Character.isDigit(texto.charAt(num))){
                si=true;
            }else {
            si=false;
                break;
            }
        }
        if (si){
            String textoo="";
            //treu tots els espais en blanc, + i -
            for(int num=0; num<=(text.length()-1); num++){
                if( Character.isWhitespace(texto.charAt(num))|| texto.charAt(num)=='+' || texto.charAt(num)=='-'){
                }else {
                    textoo= textoo + texto.charAt(num);
                }
            }
            pasar= Integer.parseInt(textoo);
            return pasar;
        }
        

        //comprovacio si es enter o no en el cas de numero
        if(texts==false){

            int numero= Integer.parseInt((texto));
            if (numero % 2 == 0){
                estricte= false;
            }else{
                estricte=true;
            }

        }
        if (estricte){
            return 1;
        }else{
            return 2;
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






