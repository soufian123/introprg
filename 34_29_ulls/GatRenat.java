
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
    private UllDeGat ullDret;
    private UllDeGat ullEsq;
    
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

    public UllDeGat getUllDret() {
        ullDret = new UllDeGat();
        if (posicio.equals("assegut")) {
             ullDret.obret();
        } 
        
        if (posicio.equals("estirat")) {
             ullDret.tancat();
        }
        if (posicio.equals("dret")) {
             ullDret.obret();
        }
        
        return ullDret;
    }

    public UllDeGat getUllEsquerre() {
        ullEsq = new UllDeGat();
        
        if (posicio.equals("assegut")) {
             ullEsq.tancat();
        }
        
        if (posicio.equals("estirat")) {
             ullEsq.tancat();
        }
        if (posicio.equals("dret")) {
             ullDret.obret();
        }
        
        return ullEsq;
    }
    
    public void aixecat(){
        setPosicio("dret");
    }
    public void estirat() {
        setPosicio("estirat");
    }
    public void seu() {
        setPosicio("assegut");
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
