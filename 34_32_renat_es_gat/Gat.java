
/*
 *
 * Gat només definirà els accessors de vides i posició.
 * es el general, es a dir, el GatRenat anira extends a Gat
 */



public class Gat {
    private static GatRenat instancia= new GatRenat();
    private int vides = 7;
    private String posicio="estirat";

    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }

    public void setPosicio(String posicio) {
        if (posicio.equals("dret") || posicio.equals("estirat") || posicio.equals("assegut")) {
            this.posicio = posicio;
        } else {
            this.posicio = "estirat";
        }
    }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
}
