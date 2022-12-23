
//utilitats del String      UtilString








public class UtilString{

    public static String nomesLletres(String text){
    
        String lletres="";
        int fin=0;
        for(int num=text.length()-1; num>=0; num--){
            if (Character.isLetter(text.charAt(num))){
                fin=num;
                num=0;
            }
        }
        for(int num=0; num<=fin; num++){
            if (Character.isLetter(text.charAt(num))){
                lletres = lletres + text.charAt(num);
            }
        }
        return lletres;
    
    }
    
    
    
    
    
    
    
    
    
    
    public static String lletresSeparades(String nomesLletres){
        String separat=""; 
        for(int num=0; num<nomesLletres.length()-1; num++){
            if (Character.isLetter(nomesLletres.charAt(num))){
                separat = (separat + nomesLletres.charAt(num)+", ");
            }
            
        }
        separat = separat + nomesLletres.charAt(nomesLletres.length()-1);
    return separat;
    
    }



}


