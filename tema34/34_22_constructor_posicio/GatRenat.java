/* 
 * 
 * Posició protegida en néixer, aquest programa es el gat renat, que en dira la seva informacio
 * 
 * 
 */





public class GatRenat {
    private int vides = 7;
    private String posicio="estirat";
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
    public void setPosicio(String novaPosicio) {
        if (!novaPosicio.equals("dret") && !novaPosicio.equals("estirat") && !novaPosicio.equals("assegut")){
            posicio="estirat";
        }else{
            posicio=novaPosicio;
        }
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "dret"));
    }
}
