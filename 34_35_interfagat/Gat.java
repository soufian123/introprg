

/*
 * aquest archiu Gat es la classe pare on despres en te dues subclasses anomenades GatRenat i Garfield.
 * Cada objecte de gat té un nom, vides i una posició, i pot realitzar accions com ara seure, estar dret i estirat.
 *
 *
 *
 *
 */


class Gat interface EsserViu{
    private String nom ="anònim";
    private int vides = 7;

    
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
        if (nom==null || nom.trim().isEmpty()){
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
