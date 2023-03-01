
/*
 *
 *
 * Els ulls del gat Renat
 *aquest es el programa del gat renat on tenim tota la seva informacio guardada
 * podem saber si els ulls estan oberts o tancats gracies a la seva posicio.
 */



public class GatRenat {
    private static GatRenat instancia= new GatRenat();
    private int vides = 7;
    private String posicio="estirat";
    private UllDeGat[] ull;
    
    private GatRenat() {
        setVides(vides);
        setPosicio(posicio);
        ull = new UllDeGat[2];
        ull[0] = new UllDeGat(false);
        ull[1] = new UllDeGat(false);
    }
    private GatRenat(int vides) {
        setVides(vides);
        setPosicio(posicio);
        ull = new UllDeGat[2];
        ull[0] = new UllDeGat(false);
        ull[1] = new UllDeGat(false);
    }
    private GatRenat(String posicio) {
        setPosicio(posicio);
        setVides(vides);
        ull = new UllDeGat[2];
        ull[0] = new UllDeGat(false);
        ull[1] = new UllDeGat(false);
    }
    private GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
        ull = new UllDeGat[2];
        ull[0] = new UllDeGat(false);
        ull[1] = new UllDeGat(false);
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

    public UllDeGat getUllDret() { return ull[1]; }
    public UllDeGat getUllEsquerre() { return ull[0]; }
    public void aixecat(){
        setPosicio("dret");
        ull[0].obret();
        ull[1].obret();
    }
    public void estirat() {
        setPosicio("estirat");
        ull[0].tancat();
        ull[1].tancat();
    }
    public void seu() {
        setPosicio("assegut");
        ull[0].tancat();
        ull[1].obret();
    }
    
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        UllDeGat ullDret = renat.getUllDret();
        UllDeGat ullEsquerre = renat.getUllEsquerre();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().estaObert(),
                renat.getUllEsquerre().estaObert());
        renat.seu();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().estaObert(),
                renat.getUllEsquerre().estaObert());
        renat.aixecat();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().estaObert(),
                renat.getUllEsquerre().estaObert());
    }
}
