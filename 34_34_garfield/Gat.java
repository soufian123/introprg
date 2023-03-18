
class Gat{
    private String nom ="anònim";
    private int vides = 7;
    private String posicio="estirat";
    
    public Gat(String nom) {
        if (nom==null || nom.trim().isEmpty()){
    this.nom="anònim";
}else {
    this.nom= nom;
}

        setVides(vides);
        setPosicio(posicio);
    }
    public Gat(String nom, int vides) {
        if (nom==null || nom.isEmpty()){
            this.nom="anònim";
        }else {
            this.nom= nom;
        }
        setVides(vides);
        setPosicio(posicio);
    }
    public Gat(String nom, String posicio) {

        if (nom==null || nom.isEmpty()){
            this.nom="anònim";
        }else {
            this.nom= nom;
        }
        setPosicio(posicio);
        setVides(vides);
    }
    public Gat(String nom, int vides, String posicio) {
        if (nom==null || nom.isEmpty()){
            this.nom="anònim";
        }else {
            this.nom= nom;
        }
        setVides(vides);
        setPosicio(posicio);
    }
    public String getNom(){
        return this.nom;
    }
    


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
    public String aixecat(){
        if (estaDret()) {
            return "no faig res";
        }
        setPosicio("dret");
        return "m\'aixeco";
    }
    public String estirat() {
        if (estaEstirat()) {
            return "no faig res";
        }
        setPosicio("estirat");
        return "m\'estiro";
    }
    public String seu() {
        if (estaAssegut()) {
            return "no faig res";
        }
        setPosicio("assegut");
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
    public boolean estaViu() {
        if(getVides()>0) {
            return true;
        }
        return false;
    }
}
