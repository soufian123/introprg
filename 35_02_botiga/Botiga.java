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
    
    public Vi afegeix(Vi vi){
        if (!esta(vi)) {
            for (int v = 0; v < vins.length; v++) {
                if (vins[v] == null) {
                    vins[v] = vi;
                    return vi;
                }
            }
        }
        return vi;
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
    
    
    public Vi elimina(String nom){
        nom= Vi.normalitzaNom(nom);
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
                if (vins[v].getNom().equals(nom)) {
                    if (vins[v].getEstoc() > 0) {
                        return null;
                    } else {
                        Vi vi = vins[v];
                        vins[v] = null;
                        return vi;
                    }
                }
            }
        }
        return null;
        
    }
    
    
    public Vi cerca(String nom){
        nom = Vi.normalitzaNom(nom);
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
                String vi = vins[v].getNom().toLowerCase();
                if (vi.equals(nom)) {
                    return vins[v];
                }
            }
        }
        return null;
    }

}
