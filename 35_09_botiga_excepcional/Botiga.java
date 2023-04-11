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
    public Botiga(int maxVins) throws Exception{
        if (maxVins <= 1) {
            throw new IllegalArgumentException("No es pot crear una botiga amb menys d'un vi");
        }
        vins = new Vi[maxVins];
    }
    
    
    public Vi afegeix(Vi vi) throws Exception{
        try{
            boolean esta = false;
            if (vi.esValid()) {
                for (int v = 0; v < vins.length; v++) {
                    if (vins[v] == null) {
                    throw new IllegalArgumentException("El vi no pot ser null");
                }
                        if (vins[v].getNom().equals(vi.getNom())) {
                            esta = true;
                            throw new IllegalArgumentException("Referència de vi repetida");
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
            return null;
        } catch (BotigaException e) {
            throw new BotigaException("Botiga plena");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    
    
    
    
    
    
    public Vi elimina(String ref) throws Exception {
        if (ref==null) throw new IllegalArgumentException("La referència no pot ser null");
        ref = Vi.normalitzaString(ref);
        
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
            
            
                if (vins[v].getRef().equalsIgnoreCase(ref)) {
                    if (vins[v].getEstoc() > 0) {
                        throw new IllegalArgumentException("El vi a eliminar no pot tenir estoc");
                        return null;
                    } else {
                        Vi vi = vins[v];
                        vins[v] = null;
                        return vi;
                    }
                }
            }
        }
        throw new IllegalArgumentException("La instància a eliminar ha d'estar present");
        return null;
    }
    
    
    public Vi cerca(String ref)throws Exception{
        ref = Vi.normalitzaString(ref).toLowerCase();
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] == null) {
                throw new IllegalArgumentException("La referència no pot ser null");
            }
                String vi = vins[v].getRef().toLowerCase();
                if (vi.equals(ref)) {
                    return vins[v];
                }
            
        }
        return null;
    }

    
    
    
    public Vi cerca(Vi plantilla) throws Exception{
        
        try{
            for(Vi vi: vins) {
                if(vi == null) continue; 
          //      System.out.println("1");
                
          
                if(!(plantilla.getRef()==null) && !(plantilla.getRef().equalsIgnoreCase(vi.getRef()))) continue;
           //     System.out.println("2");
                if(!(plantilla.getNom()==null) && !(plantilla.getNom().equalsIgnoreCase(vi.getNom()))) continue;
                
             //   System.out.println("3");
                if((plantilla.getPreu()!=-1) && (plantilla.getPreu() < vi.getPreu())) continue;
                
               // System.out.println("4");
                if((plantilla.getEstoc()!=-1) && (plantilla.getEstoc() > vi.getEstoc())) continue;
                
               // System.out.println("5");
                if(!(plantilla.getLloc() ==null) && !(plantilla.getLloc().equalsIgnoreCase(vi.getLloc()))) continue;
                
               // System.out.println("6");
                if(!(plantilla.getOrigen()==null) && !(plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen()))) continue;
                
               // System.out.println("7");
                if(!(plantilla.getTipus()==null) && !(plantilla.getTipus().equalsIgnoreCase(vi.getTipus()))) continue;
                
               // System.out.println("9");
                if(!(plantilla.getCollita()==null) && !(plantilla.getCollita().equalsIgnoreCase(vi.getCollita()))) continue;
                
                //System.out.println("10");
                return vi;
            }
            
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println("La plantilla no pot ser null");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
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


