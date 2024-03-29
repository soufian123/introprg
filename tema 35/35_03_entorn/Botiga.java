/*
 * aquest programa o archiu es la botiga, la botiga gestiona v en te tot els seu inventari
 * on un dels seus inventaris es el vi, gestionarem la botiga v posare v eliminarem 
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
    
    
    public Vi afegeix(Vi vi) {
        boolean esta = true;
        if (vi.esValid()) {
            for (int v = 0; v < vins.length; v++) {
                if (vins[v] != null) {
                    if (vins[v].getNom().equals(vi.getNom())) {
                        esta = false;
                    }
                }
            }
            if (esta) {
                for (int v = 0; v < vins.length; v++) {
                    if (vins[v] == null) {
                        vins[v] = vi;
                        return vi;
                    }
                }
            }
        }
        return null;
    }
    
    public Vi elimina(String nom) {
        nom = Vi.normalitzaNom(nom);
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
        nom = Vi.normalitzaNom(nom).toLowerCase();
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
