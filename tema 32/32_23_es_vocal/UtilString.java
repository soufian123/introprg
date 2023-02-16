//et diu si es true o fals les vocals, es a dir, revisa el char(la lletra) que li entra si coincideix en la lletra en una de les vocals que hi ha asignat en el String vocal, retorna un true, en el cas de que no ho sigui retorna un false

public class UtilString{
    public static boolean esVocal(char inicial){
        

        String vocal= "aeiouàèéíïòóúüAÀEÈÉIÍÏOÒÓUÚÙÜ";
            


            for(int num=0; num<vocal.length(); num++){
                
                    if( inicial==vocal.charAt(num)){
                        return true;
                    }

            }
            return false;


    }
}
