
/*
 *
 *
 *
 *aquest es el programa del gat renat on tenim tota la seva informacio guardada
 *
 */



public class GatRenat {
    private static GatRenat instancia= new GatRenat();
    private int vides = 7;
    private String posicio="estirat";
    public GatRenat() {
        setVides(vides);
        setPosicio(posicio);
    }
    private GatRenat(int vides) {
        setVides(vides);
        setPosicio(posicio);
    }
    private GatRenat(String posicio) {
        setPosicio(posicio);
        setVides(vides);
    }
    private GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    public void setPosicio(String posicio) {
        if (posicio.equals("dret") || posicio.equals("estirat") || posicio.equals("assegut")) {
            this.posicio = posicio;
        } else {
            this.posicio = "estirat";
        }
    }
    @Override
    public String toString() { 
        return String.format("Vides: %d. Posició: %s", vides, posicio); 
    }
    
    
    

    public static GatRenat getInstancia() {
        if (instancia==null){
            GatRenat instancia= new GatRenat();
        }
        return instancia;
    }
    public static GatRenat getInstancia(int vides) {
        if (instancia==null){
            GatRenat instancia= new GatRenat(vides);
        }
        instancia.setVides(vides);
        return instancia;
    }
    public static GatRenat getInstancia(String posicio) {
        if (instancia==null){
            GatRenat instancia= new GatRenat(posicio);
        }
        instancia.setPosicio(posicio);
        return instancia;
    }
    public static GatRenat getInstancia(int vides, String posicio) {
        if (instancia==null){
            GatRenat instancia= new GatRenat(vides,posicio);
        }
        instancia.setVides(vides);
        instancia.setPosicio(posicio);
        return instancia;
    }

    
    public static void main(String[] args) {
        GatRenat[] renats = {
            new GatRenat(),         // tot per defecte
            new GatRenat(8),        // 8 vides i posició per defecte
            new GatRenat("dret"),   // posició dret i vides per defecte
            new GatRenat(8, "dret") // 8 vides i posició dret

        };
        for (GatRenat renat: renats) {
            System.out.println(renat);
        }
    }
}
