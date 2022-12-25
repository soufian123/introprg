


//retorna un valor boolean cuan comprova si es enter o no





public class UtilString{

    public static boolean esEnter(String text, boolean estricte){


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
                texts=true;
            }else {
                texts=false;
            }
        }
        return texts;
        
    }


    public static int aEnter(String text, boolean texts){
        
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






