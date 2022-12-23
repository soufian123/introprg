//et diu si es true o fals les vocals

public class UtilString{
    public static boolean esVocal(char inicial){
        

        String vocal= "aeiouàèéíïòóúü";
            


            for(int num=0; num<vocal.length(); num++){
                
                    if( inicial==vocal.charAt(num)){
                        return true;
                    }

            }
            return false;


    }
}
