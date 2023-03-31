
/*
 * programa o archiu que el que fa es que gestionar el nom, el preu i el estoc
 * estiguin ven escrits, per exemple que el nom no tingui espais o altres coses
 * li posem nom als vins, estoc i preu
 *
 */






public class Vi{
    private String nom="Roura blanc";
    private int preu=-1;
    private int estoc=-1;
    
    public Vi(String nom, int preu){
        setNom(nom);
        setPreu(preu);
        setEstoc(0);
    }
    public Vi(String nom, int preu, int estoc){
        setNom(nom);
        setPreu(preu);
        setEstoc(estoc);
    }
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=normalitzaNom(nom);
    }
    
    
    public int getPreu(){
        return preu;
    }
    public void setPreu(int preu){
        if (preu>=0){
            this.preu=preu;
        }
    }
    
    public int getEstoc(){
        return estoc;
    }
    public void setEstoc(int estoc){
        if (estoc<0){
            //this.estoc=-1;
            return;
        }
        this.estoc=estoc;
    }
    
    
    
    public static String normalitzaNom(String nom){
        nom=nom.trim();
        if (!nom.isEmpty() || nom==null){
            
            nom= nom.replaceAll(" +"," ");
            return nom;
        }
        return "NOM NO VÀLID!";
    }
    
    public boolean esValid(){
        if(normalitzaNom(getNom()).equals("NOM NO VÀLID!")){ return false;}
        if(getPreu()<0){return false;}
        if(getEstoc()<0){return false;}
        return true;
    }
    @Override
    public String toString() {
        String text = String.format("\n    Vi: %s\n    Preu: %s\n    Estoc: %s\n", getNom(),getPreu(),getEstoc());
        return text;
    }


}
