/*
 *
 *
 * El Picarol
 *aquest es el programa del gat renat on tenim tota la seva informacio guardada
 * es una nova versió del nostre estimat Gat Renat. En aquesta ocasió, en Renat acceptarà que li pengem un picarol.
 */



public class GatRenat {
    private static GatRenat instancia= new GatRenat();
    private int vides = 7;
    private String posicio="estirat";
    private Picarol picarol;
    
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

    
    public void aixecat(){
        if (posicio.equals("dret")) {return;}
        setPosicio("dret");
        if (tePicarol()) {
            picarol.sona();
        }
    }
    public void estirat() {
        if (posicio.equals("estirat")) {return;}
        setPosicio("estirat");
        if (tePicarol()) {
            picarol.sona();
        }
    }
    public void seu() {
        if (posicio.equals("assegut")) {return;}
        setPosicio("assegut");
        if (tePicarol()) {
            picarol.sona();
        }
    }
    public void setPicarol(Picarol nouPicarol) {
        picarol = nouPicarol;
    }

    public Picarol getPicarol() {
        return picarol;
    }
    
    public boolean tePicarol(){
        if (picarol == null){
            return false;
        }
        return true;
    }
    
    public Picarol posaPicarol(Picarol nouPicarol){
        if (!tePicarol()){
            setPicarol(nouPicarol);
            return null;
        }
        Picarol segonPicarol = new Picarol();
        segonPicarol= getPicarol();
        setPicarol(nouPicarol);
        return segonPicarol;
        
    }
    
    public Picarol treuPicarol(){
        if (!tePicarol()){
            return null;
        }
        Picarol segonPicarol = getPicarol();
        setPicarol(null);
        return segonPicarol;

        
    }
    
    

    public static void main(String[] args) {
        Picarol picarol = new Picarol();
        picarol.sona();   // el picarol funciona fins i tot sense gat!
        GatRenat renat = new GatRenat();
        renat.aixecat();
        renat.posaPicarol(picarol);
        renat.seu();      // ha de sonar el picarol
        renat.seu();      // no sona el picarol doncs no es mou!
        renat.treuPicarol();
        renat.estirat();  // no sona el picarol doncs ja no el té
        System.out.println("Nombre de cops que sona el picarol: " + picarol.quantsCops());
    }
}
