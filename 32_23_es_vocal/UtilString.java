//et diu si es true o fals les vocals

public class UtilString{
    public static boolean esVocal(String paraula){
        

        String vocal= "aeiouàèéíïòóúü";
            


            for(int num=0; num<vocal.length(); num++){
                char inicial=Character.toLowerCase(paraula.charAt(0));
                char fin=Character.toLowerCase(paraula.charAt(paraula.length()-1));
                
                    if( inicial==vocal.charAt(num)){
                        return true;
                    }
                    if( fin==vocal.charAt(num)){
                        return true;
                    }
            }
            return false;


    }
}
