// fa L'operació de trobar els caràcters dins l'interval la realitzarà una funció anomenada intervalString() amb els paràmetres: la cadena de text corresponent, el valor inicial i el valor final. La funció retornarà la secció corresponent del text.








public class UtilString{
    public static String intervalString(String text, int inici, int fin){
        String resultat="";
        if (fin<0 && inici<0 && fin<inici){
            fin=-fin+inici-1;
            inici=0;
        }
        if (fin<0 && inici<0 && fin>inici){
            fin=-inici+fin-1;
            inici=0;
        }
        if (inici<0){
            inici=0;
        }
        if (fin<0){
            fin=-fin-2;
        }
        if ((text.length()-1)<inici){
            inici=text.length()-1;
        }
        
        if (fin>text.length()-1){
            fin= text.length()-1;
        }
        
        if(inici<=fin){
        
            for(int num=inici; num<=fin; num++){

                resultat= resultat + text.charAt(num);

            }
        
        }else if (fin<inici){
            for(int num=inici; num>=fin; num--){
                    
                resultat= resultat + text.charAt(num);
                    
            }
        }
        return resultat;
    }
}
