/*
 *  programa que et diu la vida i la posicionament del gat, no 
 *  es poden modificar la seva vida ni la seva posicio
 *  
 */


public class GatRenat {
    private String posicio;
    private int vides;
    public GatRenat() {
        vides=7;
        posicio = "estirat";
    }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posicio: %s", vides, posicio);
    }
    public int getVides() { return vides; }
    public String getPosicio() {return posicio;}
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println(renat);
    }

}



