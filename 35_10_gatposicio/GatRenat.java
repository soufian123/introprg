
/*aquest es el programa del gat renat on tenim tota la seva informacio guardada*/

public class GatRenat{
    
    private GatPosicio posicio= GatPosicio.ESTIRAT;

    public GatRenat(GatPosicio text){
        setPosicio(text);
    }
    public GatRenat(String text){
        setPosicio(text);
    }
    
    public GatPosicio getPosicio(){
        return posicio;
    }
    
    public void setPosicio(GatPosicio posicio){
        this.posicio=posicio;
    }
    
    
    public void setPosicio(String posicio){
        this.posicio=GatPosicio.fromString(posicio);
    }
}

