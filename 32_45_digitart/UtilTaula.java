// utilitats de programes externs de taules



public class UtilTaula{
    
/* 
el programa substitueix() espera una taula de N x M caràcters, i dos caràcters inici i fi, i retorna una altra taula, de les mateixes dimensions, en la que totes les ocurrències del caracter inici apareixeran reemplaçades per fi i la resta de caràcters romandrà igual.
*/
    
    public static char [][] substitueix(char[][] taula, char inici, char fi){
       // int [][] numero= taula.length;
        char[][] resultat = new char[7][6];
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
}
