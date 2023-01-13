// utilitats de programes externs de taules



public class UtilTaula{
    
/* 
el programa substitueix() espera una taula de N x M caràcters, i dos caràcters inici i fi, i retorna una altra taula, de les mateixes dimensions, en la que totes les ocurrències del caracter inici apareixeran reemplaçades per fi i la resta de caràcters romandrà igual.
*/
    
    public static char [][] substitueix(char[][] taula, char inici, char fi){
        
        for(int i=0; i<7; i++){
            for(int a=0; a<6; a++){
                if (taula[i][a]==inici){
                    taula[i][a]= fi;
                }
            }
        }
        return taula;
    }
}
