



//son utilitats de String




public class UtilString{
//retorna un valor boolean cuan comprova si es enter o no
    public static boolean esEnter(String text){


        boolean resultat=true;
        boolean texts=true;
        
        //comprova si tot es lletra o numero 
        for(int num=0; num<=(text.length()-1); num++){
            if(Character.isLetter(text.charAt(num))){
                return false;
            }
        }
        return true;
    }
}







