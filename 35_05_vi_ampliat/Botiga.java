/*
 * aquest programa o archiu es la botiga, la botiga gestiona v en te tot els seu inventari
 * on un dels seus inventaris es el vi, gestionarem la botiga v posare v eliminarem 
 * els productes que volguem, en aquest cas es el vi.
 *
 */
/*
public class Botiga{
    private int DEFAULT_MAX_VINS=10;
    private Vi[] vins;
    private int contador = -1;
    
    public Botiga(){
        vins = new Vi[DEFAULT_MAX_VINS];
        this.contador = -1;
    }
    public Botiga(int maxVins){
        vins = new Vi[maxVins];
        this.contador = -1;
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


    
    public Vi elimina(String ref) {
        ref = Vi.normalitzaString(ref);
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
                if (vins[v].getRef().equalsIgnoreCase(ref)) {
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
    
    public Vi cerca(String ref){
        ref = Vi.normalitzaString(ref).toLowerCase();
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
                String vi = vins[v].getRef().toLowerCase();
                if (vi.equals(ref)) {
                    return vins[v];
                }
            }
        }
        return null;
    }

    public Vi cerca(Vi plantilla) {
        for(Vi vi: vins) {
            if(vi == null) continue; 
            if(!(plantilla.getRef()==null) && !(plantilla.getRef().equalsIgnoreCase(vi.getRef()))) continue;
            if(!(plantilla.getNom()==null) && !(plantilla.getNom().equalsIgnoreCase(vi.getNom()))) continue;
            if((plantilla.getPreu()!=-1) && (plantilla.getPreu() < vi.getPreu())) continue;
            if((plantilla.getEstoc()!=-1) && (plantilla.getEstoc() > vi.getEstoc())) continue;
            if(!(plantilla.getLloc() ==null) && !(plantilla.getLloc().equalsIgnoreCase(vi.getLloc()))) continue;
            if(!(plantilla.getOrigen()==null) && !(plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen()))) continue;
            if(!(plantilla.getTipus()==null) && !(plantilla.getTipus().equalsIgnoreCase(vi.getTipus()))) continue;
            if(!(plantilla.getCollita()==null) && !(plantilla.getCollita().equalsIgnoreCase(vi.getCollita()))) continue;
            return vi;
        }
        
        return null;
    }

    public Vi cerca() {
        if(vins[0]!=null) return vins[0];
        return null;
    }

    


    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
     public void iniciaRecorregut() {
        setContador(-1);
    }

    public Vi getSeguent() {

        while (true) {
            setContador(getContador()+1);
            if (getContador() >= vins.length) return null;
            
            if (vins[getContador()] == null) continue;
            return vins[getContador()];
        }
    }

}*/
/*
private static final int DEFAULT_MAX_VINS = 10;

private Vino[] vinos;

public Botiga() {
    vinos = new Vino[DEFAULT_MAX_VINS];
}

public Botiga(int maxVinos) {
    vinos = new Vino[maxVinos];
}

public Vino afegeix(Vino vino) {
    if (vino.esValid()) {
        for (int i = 0; i < vinos.length; i++) {
            if (vinos[i] != null && vinos[i].getNom().equals(vino.getNom())) {
                return null;
            }
        }
        for (int i = 0; i < vinos.length; i++) {
            if (vinos[i] == null) {
                vinos[i] = vino;
                return vino;
            }
        }
    }
    return null;
}

public Vino elimina(String ref) {
    ref = Vino.normalitzaString(ref);
    for (int i = 0; i < vinos.length; i++) {
        if (vinos[i] != null && vinos[i].getRef().equalsIgnoreCase(ref)) {
            if (vinos[i].getEstoc() > 0) {
                return null;
            } else {
                Vino vino = vinos[i];
                vinos[i] = null;
                return vino;
            }
        }
    }
    return null;
}

public Vino cerca(String ref) {
    ref = Vino.normalitzaString(ref).toLowerCase();
    for (int i = 0; i < vinos.length; i++) {
        if (vinos[i] != null && vinos[i].getRef().toLowerCase().equals(ref)) {
            return vinos[i];
        }
    }
    return null;
}

public Vino cerca(Vino plantilla) {
    for (Vino vino : vinos) {
        if (vino == null) {
            continue;
        }
        if (!(plantilla.getRef() == null) && !(plantilla.getRef().equalsIgnoreCase(vino.getRef()))) {
            continue;
        }
        if (!(plantilla.getNom() == null) && !(plantilla.getNom().equalsIgnoreCase(vino.getNom()))) {
            continue;
        }
        if ((plantilla.getPreu() != -1) && (plantilla.getPreu() < vino.getPreu())) {
            continue;
        }
        if ((plantilla.getEstoc() != -1) && (plantilla.getEstoc() > vino.getEstoc())) {
            continue;
        }
        if (!(plantilla.getLloc() == null) && !(plantilla.getLloc().equalsIgnoreCase(vino.getLloc()))) {
            continue;
        }
        if (!(plantilla.getOrigen() == null) && !(plantilla.getOrigen().equalsIgnoreCase(vino.getOrigen()))) {
            continue;
        }
        if (!(plantilla.getTipus() == null) && !(plantilla.getTipus().equalsIgnoreCase(vino.getTipus()))) {
            continue;
        }
        if (!(plantilla
*/

public class Botiga {
    private int DEFAULT_MAX_VINS=10;
    private Vi[] vins;
    private int contador = -1;
    
    public Botiga(){
        vins = new Vi[DEFAULT_MAX_VINS];
        this.contador = -1;
    }
    public Botiga(int maxVins){
        vins = new Vi[maxVins];
        this.contador = -1;
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
    public Vi elimina(String ref) {
        ref = Vi.normalitzaString(ref);
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
                if (vins[v].getRef().equalsIgnoreCase(ref)) {
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
    public Vi cerca(String ref){
        ref = Vi.normalitzaString(ref).toLowerCase();
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
                String vi = vins[v].getRef().toLowerCase();
                if (vi.equals(ref)) {
                    return vins[v];
                }
            }
        }
        return null;
    }
    public Vi cerca(Vi plantilla) {
        for(Vi vi: vins) {
            if(vi == null) continue; 
            if(!(plantilla.getRef()==null) && !(plantilla.getRef().equalsIgnoreCase(vi.getRef()))) continue;
            if(!(plantilla.getNom()==null) && !(plantilla.getNom().equalsIgnoreCase(vi.getNom()))) continue;
            if((plantilla.getPreu()!=-1) && (plantilla.getPreu() < vi.getPreu())) continue;
            if((plantilla.getEstoc()!=-1) && (plantilla.getEstoc() > vi.getEstoc())) continue;
            if(!(plantilla.getLloc() ==null) && !(plantilla.getLloc().equalsIgnoreCase(vi.getLloc()))) continue;
            if(!(plantilla.getOrigen()==null) && !(plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen()))) continue;
            if(!(plantilla.getTipus()==null) && !(plantilla.getTipus().equalsIgnoreCase(vi.getTipus()))) continue;
            if(!(plantilla.getCollita()==null) && !(plantilla.getCollita().equalsIgnoreCase(vi.getCollita()))) continue;
            return vi;
        }
        return null;
    }
    public Vi cerca() {
        for (Vi vi : vins) {
            if (vi != null) {
                return vi;
            }
        }
        return null;
    }
    public int getContador() {
        return this.contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }
     public void iniciaRecorregut() {
        setContador(-1);
    }

    public Vi getSeguent() {

        while (true) {
            setContador(getContador()+1);
            if (getContador() >= vins.length) return null;
            
            if (vins[getContador()] == null) continue;
            return vins[getContador()];
        }
    }
}

