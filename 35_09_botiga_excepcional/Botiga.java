/*
 * aquest programa o archiu es la botiga, la botiga gestiona v en te tot els seu inventari
 * on un dels seus inventaris es el vi, gestionarem la botiga v posare v eliminarem 
 * els productes que volguem, en aquest cas es el vi.
 *
 */
 import java.io.IOException;

 
public class Botiga{
    private int DEFAULT_MAX_VINS=10;
    private Vi[] vins;
    private int contador = -1;
    
    public Botiga(){
    vins = new Vi[DEFAULT_MAX_VINS];
    }
    public Botiga(int maxVins){
        if (maxVins < 1) {
            throw new IllegalArgumentException("No es pot crear una botiga amb menys d'un vi");
        }
        vins = new Vi[maxVins];
    }
    public int getMax(){
        return DEFAULT_MAX_VINS;
    }
    
    public Vi afegeix(Vi vi) throws IllegalArgumentException, BotigaException, IOException{

        boolean esta = false;
        
        if (vi==null) throw new IllegalArgumentException("El vi no pot ser null");
        if (vi.esValid()) {
            for (int v = 0; v < vins.length; v++) {
                if (vins[v] != null) {
                    if (vins[v].getRef().equals(vi.getRef())) {
                        esta = true;
                        throw new IllegalArgumentException("Referència de vi repetida");
                    }
                    
                }
            }
            if (!esta) {
            
                for (int v = 0; v < vins.length; v++) {
                    if (vins[v] == null) {
                        vins[v] = vi;
                        return vi;
                    }

                }
            }
        }else{
            throw new IllegalArgumentException("El vi ha de ser vàlid");
        }
       //if (Entorn.comptaReferenciesTotal() >= DEFAULT_MAX_VINS+1) throw new BotigaException();
        return null;
        
        
    }
    
    
    public Vi elimina(String ref) throws IllegalArgumentException {
        if (ref == null) throw new IllegalArgumentException("La referència no pot ser null");
        ref = Vi.normalitzaString(ref);
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
                if (vins[v].getRef().equalsIgnoreCase(ref)) {
                    if (vins[v].getEstoc() > 0) {
                        throw new IllegalArgumentException("El vi a eliminar no pot tenir estoc");
                    } else {
                        Vi vi = vins[v];
                        vins[v] = null;
                        return vi;
                    }
                }
            }
        }
        throw new IllegalArgumentException("La instància a eliminar ha d'estar present");
    }
    
    
    public Vi cerca(String ref) throws IllegalArgumentException {
		if (ref == null) throw new IllegalArgumentException("La referència no pot ser null");
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
        if (plantilla==null){
            throw new IllegalArgumentException("La plantilla no pot ser null");
        }
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
        if (getContador() < vins.length) {
            setContador(getContador() + 1);
        }
        if (getContador() == vins.length) {
            return null;
        }

        while (vins[getContador()] == null && getContador() < vins.length - 1) {
            setContador(getContador() + 1);
        }

        return vins[getContador()];
    }

}

