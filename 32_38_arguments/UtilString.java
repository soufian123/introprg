


public class UtilString{

	    public static boolean esEnter(String text){

        for(int num=0; num<=(text.length()-1); num++){
            if (text.charAt(num) == ','){
                return false;
            }
            if (text.charAt(num) == ',' || text.charAt(num) == ' ') {
				return false;
			}
            if(Character.isLetter(text.charAt(num))){
                return false;
            }
        }
        return true;
        
    }


        
	
}




