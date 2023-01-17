/* 
* utilitats de programes anteriors (en moduls)  UtilString
*/


public class UtilTaula{
    
/* 
el programa substitueix() espera una taula de N x M caràcters, i dos caràcters inici i fi, i retorna una altra taula, de les mateixes dimensions, en la que totes les ocurrències del caracter inici apareixeran reemplaçades per fi i la resta de caràcters romandrà igual.
*/
    
    public static char [][] substitueix(char[][] taula, char inici, char fi){
       // int [][] numero= taula.length;
        char[][] resultat = new char[taula.length][taula[0].length];
        //resultat  = taula;

        
        for(int i=0; i<taula.length; i++){
            for(int a=0; a<taula[0].length; a++){
                if (taula[i][a]==inici){
                    resultat[i][a]= fi;
                }else{
                    resultat[i][a] =taula[i][a];
                }
            }
           
        }
        return resultat;
    }
    
    
    
    //inicialitza la taula amb el valor que ens donen
    public static void inicialitzaTaula(int[][] taula, int valor){

        
        for(int l=0; l<taula.length; l++){
            for(int c=0; c<taula[0].length; c++){
                taula[l][c]= valor;
            }
        }
        
        
    }
    
    //pasa una taula a string
    public static String taulaToString(int[][] taula){
        
        String resultat="";
        String text="";
        for(int i=0; i<taula.length; i++){
            for(int a=0; a<taula[0].length; a++){
                resultat += String.format("%8d",taula[i][a]);

            }
            resultat += "\n";
        }
        return resultat;
    }
    
}

