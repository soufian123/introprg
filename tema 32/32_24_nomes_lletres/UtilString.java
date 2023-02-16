
// utilitats de programes anteriors (en moduls)  UtilString



public class UtilString{
        //agafa totes les lletres
    public static String nomesLletres(String text){
        String lletres="";
        int fin=0;
        if(text.isEmpty()){
            return text;
        }
        if (lletres==","){
            lletres="";
            return lletres;
        }
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
    
    //separa les lletres en ", " y la ultima la deixa sense ", "
    public static String lletresSeparades(String nomesLletres){
        String separat="";
        if (nomesLletres==","){
            separat=" ";
            return separat;
        } 
        if (nomesLletres.isBlank()){
            separat="";
            return separat;
        }
        for(int num=0; num<nomesLletres.length()-1; num++){
            if (Character.isLetter(nomesLletres.charAt(num))){
                separat = (separat + nomesLletres.charAt(num)+", ");
            }
            
        }
        separat = separat + nomesLletres.charAt(nomesLletres.length()-1);
    return separat;
    
    }



}


