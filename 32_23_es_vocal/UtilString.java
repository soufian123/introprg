//et diu si es true o fals les vocals

public class UtilString{
    public static boolean esVocal(String paraula){
        

        String vocal= "aeiouàèéíïòóú";
            


            for(int num=0; num<vocal.length(); num++){
                char inicial=Character.toUpperCase(paraula.charAt(0));
                char fin=Character.toUpperCase(paraula.charAt(paraula.length()-1));
                
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
