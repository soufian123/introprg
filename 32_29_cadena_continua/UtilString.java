


//retorna un valor boolean cuan comprova si es enter o no





public class UtilString{

    public static boolean esEnter(String text /*, boolean estricte */){


        //comprova si tot es lletra o numero 
        for(int num=0; num<=(text.length()-1); num++){
            if(Character.isLetter(text.charAt(num))){
                return false;
            }else if (text.charAt(num) == ',' || text.charAt(num) == ' ') {
				return false;
			}
        }
        return true;
        
    }









    public static String cadenaContinua(String text, int cops){
        
        
        String sortida="";
        if (cops>=0){
            int numero=0;
            for(int num=0; num<cops; num++){
                
                if (numero<text.length()){
                }else{
                    numero=0;
                }
                
                sortida= sortida + text.charAt(numero);
                numero= numero+1;
            }
        }
        return sortida;

    }


}






