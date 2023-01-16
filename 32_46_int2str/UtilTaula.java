// utilitats de programes externs de taules



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
    
    
    
    
    public static void main inicialitzaTaula(int[][] taula, int valor){

        
        for(int l=0; l<taula.length; l++){
            for(int c=0; l<taula[0].length; l++){
                taula[l][c]= valor;
            }
        }
        
        
    }
    public static String [][] taulaToString(int[][] taula)
        String [][] resultat="";
        
        for(int i=0; i<taula.length; i++){
            for(int a=0; a<taula[0].length; a++){
                resultat[i][a]= taula[i][a];
            }
        }
    
}
