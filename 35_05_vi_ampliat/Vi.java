
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
        
        
        
        
        
    public Vi(String nom, int preu){
        setNom(nom);
        setPreu(preu);
        setEstoc(0);
        this.ref = null;
        this.lloc = null;
        this.origen = null;
        this.tipus = null;
        this.collita = null;
    }
    public Vi(String nom, int preu, int estoc){
        setNom(nom);
        setPreu(preu);
        setEstoc(estoc);
        this.ref = null;
        this.lloc = null;
        this.origen = null;
        this.tipus = null;
        this.collita = null;
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
    public static String normalitzaString(String text){
        text=text.trim();
        if (!text.isEmpty() || text==null){
            
            text= text.replaceAll(" +"," ");
            return text;
        }
        return "NOM NO VÀLID!";
    }
     public boolean esValid() {
        return (nom != null && nom.length() > 0 && ref != null && ref.length() > 0 && preu >= 0 && estoc >= 0 && lloc != null && lloc.length() > 0 && origen != null && origen.length() > 0 && tipus != null && tipus.length() > 0 && collita != null && collita.length() > 0);
    }

        //format del vi per ser mostrat com String
    @Override
    public String toString() {
        return "\n    Ref: " + getRef() + "\n    Nom: " + getNom() + "\n    Preu: " + getPreu() + "\n    Estoc: " + getEstoc() + "\n    Lloc: " + getLloc() + "\n    D.O.: " + getOrigen() + "\n    Tipus: " + getTipus() + "\n    Collita: " + getCollita()  +"\n";
    }
    
    //rep un array de Strings amb els atributs del vi i retorna un vi amb aquests atributs
    public static Vi deArrayString(String[] vi){
        if (vi.length != 8) {
            return null;
        }
        try {
            vi[0] = normalitzaString(vi[0]);
            vi[1] = normalitzaString(vi[1]);
            int preu = Integer.parseInt(vi[2]);
            int estoc = Integer.parseInt(vi[3]);
            vi[4] = normalitzaString(vi[4]);
            vi[5] = normalitzaString(vi[5]);
            vi[6] = normalitzaString(vi[6]);
            vi[7] = normalitzaString(vi[7]);
            if (preu < 0 || estoc < 0 || vi[0] == null || vi[1] == null || vi[4] == null || vi[5] == null || vi[6] == null || vi[7] == null) {
                return null;
            }
            return new Vi(vi[0], vi[1],preu, estoc, vi[4], vi[5], vi[6], vi[7]);
        } catch (Exception e) {
            return null;
        }
    }
    
    //rep una instància de vi i retorna un array de strings amb els atributs del vi
    
    public String[] aArrayString(){
        String[] vi = new String[8];
        vi[0] = getRef();
        vi[1] = getNom();
        vi[2] = Integer.toString(getPreu());
        vi[3] = Integer.toString(getEstoc());
        vi[4] = getLloc(); 
        vi[5] = getOrigen();
        vi[6] = getTipus();
        vi[7] = getCollita();
        return vi;
    }


}
