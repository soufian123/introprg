

/*
 * aquest archiu Gat es la classe pare on despres en te dues subclasses anomenades GatRenat i Garfield.
 * Cada objecte de gat té un nom, vides i una posició, i pot realitzar accions com ara seure, estar dret i estirat.
 *
 *
 *
 *
 */


class Gat implements EsserViu{
    private String nom ="anònim";
    private int vides = 7;

    
    public Gat(String nom) {
        
        if (nom==null || nom.trim().isEmpty()){
            this.nom="anònim";
        }else {
            this.nom= nom;
        }
        setVides(vides);
        //setPosicio(posicio());
    }
    public Gat(String nom, int vides) {
        if (nom==null || nom.trim().isEmpty()){
            this.nom="anònim";
        }else {
            this.nom= nom;
        }
        setVides(vides);
        //setPosicio(posicio);
    }
    public String getNom(){
        return this.nom;
    }
    


    public int getVides() { return vides; }


    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    @Override
    public boolean estaViu(){
        if(getVides()<1){
            return false;
        }
        return true;
    }
    @Override
    public String mor(){
        String text;
        if (estaViu()) {
            text= "adéu món cruel";
        }else{
            text="ja l'he espifiada";
        }
        setVides(0);
        return text;
    }
    @Override
    public String ressulcita(){
        String text;
        if (estaViu()) {
            text= "encara miolo";
        }else{
            text="guai!";
            setVides(1);
        }
        
        return text;
    }

}
