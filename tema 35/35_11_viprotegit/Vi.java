
/*
 * programa o archiu que el que fa es que gestionar el nom, el preu i el estoc
 * estiguin ven escrits, per exemple que el nom no tingui espais o altres coses
 * li posem nom als vins, estoc i preu
 *
 */






public class Vi{
    private String nom;
    private int preu=-1;
    private int estoc=-1;
    private String ref;
    private String lloc;
    private String origen;
    private String tipus;
    private String collita;
    
    public String getRef(){return ref;}
    
    public String getLloc(){return lloc;}
    public void setLloc(String lloc){
        lloc = normalitzaString(lloc);
        if(lloc!=null){
            this.lloc = lloc;
        }
    }
    
    public String getOrigen(){return origen;}
    
    
    public String getTipus(){return tipus;}
    
    
    public String getCollita(){return collita;}
    public Vi(String nom, int preu, int estoc){
        this.nom = normalitzaString(nom);
        setPreu(preu);
        setEstoc(estoc);
    }

    public Vi( String ref,String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita){
        this.ref = normalitzaString(ref); 
        this.nom = normalitzaString(nom);
        setPreu(preu);
        setEstoc(estoc);
        this.lloc = normalitzaString(lloc);
        this.origen = normalitzaString(origen);
        this.tipus = normalitzaString(tipus);
        this.collita = normalitzaString(collita);
    }
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=normalitzaString(nom);
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
    
    public static String normalitzaString(String nom) {
        if (nom == null) return null;
        if (nom.isBlank()) {
            return null;
        }
        
        nom = nom.trim();
        nom = String.format(nom.replaceAll(" +"," "));
        return nom;
    }
    
    public boolean esValid() {
        return (nom != null && nom.length() > 0 && ref != null && ref.length() > 0 && preu >= 0 && estoc >= 0 && lloc != null && lloc.length() > 0 && origen != null && origen.length() > 0 && tipus != null && tipus.length() > 0 && collita != null && collita.length() > 0);
    }
    

    @Override
    public String toString() {
        String text = String.format("\n    Ref: %s\n    Nom: %s\n    Preu: %s\n    Estoc: %s\n    Lloc: %s\n    D.O.: %s\n    Tipus: %s\n    Collita: %s\n",getRef(), getNom(),getPreu(),getEstoc(),getLloc(),getOrigen(),getTipus(),getCollita());
        return text;
    }
    
    
    public static Vi deArrayString(String[] vins) {
        if(vins.length != 8) return null;
        for(int a=0; a<8; a++){
            if(a!=2 && a!=3){
                if(vins[a].isBlank()|| vins[a]==null) return null;
            }else{
                if(!UtilString.esEnter(vins[a])|| vins[a]==null) return null;
            }
        }

        Vi nou = new Vi(normalitzaString(vins[0]),normalitzaString(vins[1]),Integer.parseInt(vins[2]),Integer.parseInt(vins[3]),normalitzaString(vins[4]),normalitzaString(vins[5]),normalitzaString(vins[6]),normalitzaString(vins[7]));
        if (nou.esValid()) {
            return nou;
        } else {
            return null;
        }
    }



    public String[] aArrayString() {
        String[] viString ={ getRef(), getNom(),Integer.toString(getPreu()),Integer.toString(getEstoc()), getLloc(), getOrigen(), getTipus(), getCollita()};
        return viString;
        
    }


}
