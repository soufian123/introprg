/* 
 * 
 * Posicio parametritzada, aquest programa es el gat renat, que en dira la seba informacio
 * 
 * 
 */



public class GatRenat {
    private int vides;
    private String posicio;
    public GatRenat(int novesVides, String novaPosicio) {
        vides = novesVides;
        posicio=novaPosicio;
    }
    public String getPosicio() {return posicio;}
    public int getVides() { return vides; }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "estirat"));
    }
}
