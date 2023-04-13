/*
 * es un enum del programa gar renat o te les posicions i per saber en quina posicio esta en cada monemt 
*/



public enum GatPosicio{
    ESTIRAT,
    DRET ,
    ASSEGUT;
    
    
    public static GatPosicio fromString(String posicio){
        
        for (GatPosicio pos: GatPosicio.values()) {
             if (pos.name().equalsIgnoreCase(posicio)) return pos;
         }
         throw new IllegalArgumentException(String.format("valor \"%s\" no soporat per GatPosicio", posicio));
    }
}

