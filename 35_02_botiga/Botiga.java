/*
 * aquest programa o archiu es la botiga, la botiga gestiona i en te tot els seu inventari
 * on un dels seus inventaris es el vi, gestionarem la botiga i posare i eliminarem 
 * els productes que volguem, en aquest cas es el vi.
 *
 */



public class Botiga{
    private int DEFAULT_MAX_VINS=10;
    private Vi[] vins;
    
    public Botiga(){
    vins = new Vi[DEFAULT_MAX_VINS];
    }
    public Botiga(int maxVins){
    vins = new Vi[maxVins];
    }
    /*
    public Vi afegeix(Vi vi){
        if (!esta(vi)) {
            for (int v = 0; v < vins.length; v++) {
                if (vins[v] == null) {
                    vins[v] = vi;
                    return vi;
                }
            }
        }
        return null;
    }
    
    public boolean esta(Vi vi){
        if (vi.esValid()){
            for (Vi v: vins){
                if (v != null) {
                    if (!(v.getNom().equals(vi.getNom()))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    */
    public Vi afegeix(Vi vi) {
        boolean elegible = true;
        if (vi.esValid()) {
            for (int i = 0; i < vins.length; i++) {
                if (vins[i] != null) {
                    if (vins[i].getNom().equals(vi.getNom())) {
                        elegible = false;
                    }
                }
            }
            if (elegible) {
                for (int i = 0; i < vins.length; i++) {
                    if (vins[i] == null) {
                        vins[i] = vi;
                        return vi;
                    }
                }
            }
        }
        return null;
    }
    
    public Vi elimina(String nom){
        nom= Vi.normalitzaNom(nom);
        for (Vi v: vins) {
            if (v != null) {
                if (v.getNom().equals(nom) && v.getEstoc() > 0) {
                    return null;
                } else {
                    Vi vi = v;
                    v = null;
                    return vi;
                }
                
            }
        }
        return null;
        
    }
    
    
    public Vi cerca(String nom){
        nom = Vi.normalitzaNom(nom).toLowerCase();
        for (Vi v: vins) {
            if (v != null) {
                String vi = v.getNom().toLowerCase();
                if (vi.equals(nom)) {
                    return v;
                }
            }
        }
        return null;
    }

}
