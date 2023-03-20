
/*
 *
 * aquest archiu GatRenat es una herencia de la classe base anomenada Gat i te dos implements que son 
 * AnimalDeCompanyia , Ensinistrable .
 * Cada objecte de gat té un nom, vides i pot realitzar accions com ara mirar les seves vides, canviarles i defnir el nom.
 * pero en GatRenat es diu renat sempre i se li pot canviar les vides i la posicio
 *
 *
 *
 */

class GatRenat extends Gat implements AnimalDeCompanyia , Ensinistrable{
    private String posicio="estirat";
    public GatRenat() {
        super("Renat",7);
    }
    /*public void setPosicio(String posicio) {
        if (posicio.equals("dret") || posicio.equals("estirat") || posicio.equals("assegut")) {
            this.posicio = posicio;
        } else {
            this.posicio = "estirat";
        }
    }
    */
    public GatRenat(String posicio) {
        super("Renat", 7);
    }
    
    public String getPosicio() { return posicio; }
    public String aixecat(){
        if (estaDret()) {
            return "no faig res";
        }
        this.posicio=("dret");
        return "m\'aixeco";
    }
    public String estirat() {
        if (estaEstirat()) {
            return "no faig res";
        }
        this.posicio=("estirat");
        return "m\'estiro";
    }
    public String seu() {
        if (estaAssegut()) {
            return "no faig res";
        }
        this.posicio=("assegut");
        return "m\'assec";
    }
    public boolean estaDret() {
        if(getPosicio().equals("dret")) {
            return true;
        }
        return false;
    }
    public boolean estaAssegut() {
        if(getPosicio().equals("assegut")) {
            return true;
        }
        return false;
    }
    public boolean estaEstirat() {
        if(getPosicio().equals("estirat")) {
            return true;
        }
        return false;
    }
    @Override
    public String deixatEstimar(){
        return "em deixo estimar";
    }
}
