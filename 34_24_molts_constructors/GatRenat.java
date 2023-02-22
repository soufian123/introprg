/* 
 * 
 * Molts constructors, aquest programa es el gat renat, que ens dira la seva informacio
 * 
 * 
 */


public class GatRenat {
    private int vides = 7;
    private String posicio="assegut";
    public GatRenat() {
        setVides(vides);
        setPosicio(posicio);
    }
    public GatRenat(int vides) {
        setVides(vides);
        setPosicio(posicio);
    }
    public GatRenat(String posicio) {
        setPosicio(posicio);
        setVides(vides);
    }
    public GatRenat(int vides, String posicio) {
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
        if (posicio.equals("dret")){
            this.posicio=posicio;
        }else{
            this.posicio="assegut";
        }
    }
    @Override
    public String toString() { 
        return String.format("Vides: %d. Posició: %s", vides, posicio); 
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
