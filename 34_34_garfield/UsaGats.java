
/*
 *
 *
 *
 *
 *
 *
 *
 *
 */




class UsaGats{
    public static void main(String[] args) {
        Gat[] gats = new Gat[] {
            new Gat("Misifú"),
            new GatRenat(),
            new Garfield()
        };
        for (Gat gat: gats) {
            System.out.println("Entrenant el gat " + gat.getNom());
            System.out.println(gat.getNom() + " diu: "+ gat.seu());
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
            System.out.println(gat.getNom() + " diu: "+ gat.estirat());
            System.out.println();
        }
    }
}


class Gat{
    private String nom ="anònim";
    private int vides = 7;
    private String posicio="estirat";
    
    public Gat(String nom) {
        setNom(nom);
        setVides(vides);
        setPosicio(posicio);
    }
    public Gat(String nom, int vides) {
        setNom(nom);
        setVides(vides);
        setPosicio(posicio);
    }
    public Gat(String nom, String posicio) {
        setNom(nom);
        setPosicio(posicio);
        setVides(vides);
    }
    public Gat(String nom, int vides, String posicio) {
        setNom(nom);
        setVides(vides);
        setPosicio(posicio);
    }
    public String getNom(){
        return this.nom;
    }
    
    public void setNom(String nom){
        if (nom.isBlank() || nom==null || nom.isEmpty()){
            this.nom="anònim";
        }else {
            this.nom= nom;
        }
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

class GatRenat extends Gat{

    public GatRenat(int vides) {
        setNom("Renat");
        setVides(getVides());
        setPosicio(getPosicio());
    }
    public GatRenat(String posicio) {
        setNom("Renat");
        setPosicio(getPosicio());
        setVides(getVides());
    }
    public GatRenat(int vides, String posicio) {
        setNom("Renat");
        setVides(getVides());
        setPosicio(getPosicio());
    }
}

class Garfield extends Gat{
    public void main(String[] args) {
        setNom("Garfield");
        setVides(9);
        setPosicio("estirat");
    }
    
    public String aixecat(){
        if (estaDret()) {
            return "no faig res";
        }
        if (estaAssegut()) {
            setPosicio("dret");
            return "m\'aixeco";
        }else{
            return "Bai Maitea, bai";
        }
    }
    public String estirat() {
        if (estaEstirat()) {
            return "no faig res";
        }
        if (estaAssegut()) {
            setPosicio("estirat");
            return "m\'estiro";
        }else{
            return "Bai Maitea, bai";
        }
    }
    public String seu() {
        if (estaAssegut()) {
            return "no faig res";
        }
        setPosicio("assegut");
        return "m\'assec";
    }
    
}





