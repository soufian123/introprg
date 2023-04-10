/*
 * aquest programa o archiu es la botiga, la botiga gestiona v en te tot els seu inventari
 * on un dels seus inventaris es el vi, gestionarem la botiga v posare v eliminarem 
 * els productes que volguem, en aquest cas es el vi.
 *
 */



public class Botiga{
    private int DEFAULT_MAX_VINS=10;
    private Vi[] vins;
    private int contador = -1;
    
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
    
    public Vi elimina(String ref) {
        ref = Vi.normalitzaNom(ref);
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
                if (vins[v].getRef().equals(ref)) {
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
        ref = Vi.normalitzaNom(ref).toLowerCase();
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
      //      System.out.println("1");
            
      
            if(!(plantilla.getRef()==null) && !(plantilla.getRef().equalsIgnoreCase(vi.getRef()))) continue;
       //     System.out.println("2");
            if(!(plantilla.getNom()==null) && !(plantilla.getNom().equalsIgnoreCase(vi.getNom()))) continue;
            if (!(plantilla.getNom().isEmpty())){
                if (!(vi.getNom() == plantilla.getNom())) continue;
            }
         //   System.out.println("3");
            if((plantilla.getPreu()!=-1) && (plantilla.getPreu() < vi.getPreu())) continue;
            if (!(vi.getPreu() >= plantilla.getPreu())) continue;
           // System.out.println("4");
            if((plantilla.getEstoc()!=-1) && (plantilla.getEstoc() > vi.getEstoc())) continue;
            if (!(vi.getEstoc() <= plantilla.getEstoc())) continue;
           // System.out.println("5");
            if(!(plantilla.getLloc() ==null) && !(plantilla.getLloc().equalsIgnoreCase(vi.getLloc()))) continue;
            if (!(plantilla.getLloc().isEmpty())){
                if (!(vi.getLloc() == plantilla.getLloc())) continue;
            }
           // System.out.println("6");
            if(!(plantilla.getOrigen()==null) && !(plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen()))) continue;
            if (!(plantilla.getOrigen().isEmpty())){
                if (!(vi.getOrigen() == plantilla.getOrigen())) continue;
            }
           // System.out.println("7");
            if(!(plantilla.getTipus()==null) && !(plantilla.getTipus().equalsIgnoreCase(vi.getTipus()))) continue;
            if (!(plantilla.getTipus().isEmpty())){
                if (!(vi.getTipus() == plantilla.getTipus())) continue;
            }
           // System.out.println("9");
            if(!(plantilla.getCollita()==null) && !(plantilla.getCollita().equalsIgnoreCase(vi.getCollita()))) continue;
            if (!(plantilla.getCollita().isEmpty())){
                if (!(vi.getCollita() == plantilla.getCollita())) continue;
            }
            //System.out.println("10");
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
