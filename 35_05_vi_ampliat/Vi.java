
/*
 * programa o archiu que el que fa es que gestionar el nom, el preu i el estoc
 * estiguin ven escrits, per exemple que el nom no tingui espais o altres coses
 * li posem nom als vins, estoc i preu
 *
 */






public class Vi{
    private String nom;
    private int preu;
    private int estoc;
    private String ref;
    private String lloc;
    private String origen;
    private String tipus;
    private String collita;
    
    public String getRef(){return ref;}
    public void setRef(String ref){
        if(ref != null){
            ref = normalitzaString(ref);
            if (!ref.isEmpty()){
                this.ref = ref;
            }
        }
    }
    
    
    public String getLloc(){return lloc;}
    public void setLloc(String lloc){
        lloc = normalitzaString(lloc);
        if(lloc!=null){
            this.lloc = lloc;
        }
    }
    
    public String getOrigen(){return origen;}
    public void setOrigen(String origen){
        if (origen != null){
            origen = normalitzaString(origen);
            if (!origen.isEmpty()) {
                this.origen = origen;
            }
        }
    }
    
    public String getTipus(){return tipus;}
    public void setTipus(String tipus){
        if (tipus != null){
            tipus = normalitzaString(tipus);
            if (!tipus.isEmpty()) {
                this.tipus = tipus;
            }
        }
    }
    
    public String getCollita(){return collita;}
    public void setCollita(String collita){
        if (collita != null){
            collita = normalitzaString(collita);
            if (!collita.isEmpty()) {
                this.collita = collita;
            }
        }
    }
        

    public Vi( String ref,String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita){
        setNom(nom);
        setPreu(preu);
        setEstoc(estoc);
        setRef(ref);
        setLloc(lloc);
        setOrigen(origen);
        setTipus(tipus);
        setCollita(collita);
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
    
    
    
    public static String normalitzaString(String nom){
        nom=nom.trim();
        if (!nom.isEmpty() || nom==null){
            
            nom= nom.replaceAll(" +"," ");
            return nom;
        }
        return "NOM NO VÀLID!";
    }
/*
    public static String normalitzaString(String text){
        if (nom == null) {return null;}
        if (nom.isBlank()) {
            return null;
        }
        text= text.replaceAll(" +"," ");
        return text;
    }
*/
    public boolean esValid() {
        return (nom != null && nom.length() > 0 && ref != null && ref.length() > 0 && preu >= 0 && estoc >= 0 && lloc != null && lloc.length() > 0 && origen != null && origen.length() > 0 && tipus != null && tipus.length() > 0 && collita != null && collita.length() > 0);
    }
    

    @Override
    public String toString() {
        String text = String.format("\n    Ref: %s\n    Nom: %s\n    Preu: %s\n    Estoc: %s\n    Lloc: %s\n    D.O.: %s\n    Tipus: %s\n    Collita: %s\n",getRef(), getNom(),getPreu(),getEstoc(),getLloc(),getOrigen(),getTipus(),getCollita());
        return text;
    }
    
    public static Vi deArrayString(String[] vins) {
        if(vins.length != 8){return null;}
        if (vins[0].isBlank()|| vins[0]==null ||
            vins[1].isBlank()|| vins[1]==null ||
            vins[4].isBlank()|| vins[4]==null ||
            vins[5].isBlank()|| vins[5]==null ||
            vins[6].isBlank()|| vins[6]==null ||
            vins[7].isBlank()|| vins[7]==null ){return null;}
        if(!UtilString.esEnter(vins[3])|| vins[3]==null){return null;}
        if(!UtilString.esEnter(vins[2])||vins[2]==null){return null;}
        Vi nouVi = new Vi(normalitzaString(vins[0]),normalitzaString(vins[1]),Integer.parseInt(vins[2]),Integer.parseInt(vins[3]),normalitzaString(vins[4]),normalitzaString(vins[5]),normalitzaString(vins[6]),normalitzaString(vins[7]));
        if (nouVi.esValid()) {return nouVi;}
        else {return null;}
    }
    // Convierte las instancias de un vino en un array de Strings 
    public String[] aArrayString() {
        String[] viString ={getRef(),getNom(),Integer.toString(getPreu()),Integer.toString(getEstoc()),getLloc(),getOrigen(),getTipus(),getCollita()};
        return viString;
        
    }


}
