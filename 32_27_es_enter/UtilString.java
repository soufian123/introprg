



//son utilitats de String




public class UtilString{
//retorna un valor boolean cuan comprova si es enter o no
    public static boolean esEnter(String text){


        boolean resultat=true;
        String texto="";
        boolean texts=true;
        
        //comprova si tot es lletra o numero 
        for(int num=0; num<=(texto.length()-1); num++){
            if(Character.isLetter(text.charAt(num))){
                return false;
            }
        }
        return true;
    }
}
        //treu tots els espais en blanc, + i -
        /*for(int num=0; num<=(text.length()-1); num++){
            if( Character.isWhitespace(text.charAt(num))|| text.charAt(num)=='+' || text.charAt(num)=='-'){
            }else {
                texto= texto + text.charAt(num);
            }
        }

        

        //comprovacio si es enter o no en el cas de lletra
        if (texts){
            int numeroLletra=(texto.length()-1);
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
        
        return resultat;
    */





