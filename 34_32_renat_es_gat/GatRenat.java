
/*
 * GatRenat es per utilitzar els accessors heredats de Gat.
 *
 *
 */





public class GatRenat extends Gat{

    public String aixecat(){
        if (estaDret()) {
            return "no faig res";
        }
        setPosicio("dret");
        return "m\'aixeco";
    }
    public String estirat() {
        if (estaEstirat()) {
            return "no faig res";
        }
        setPosicio("estirat");
        return "m\'estiro";
    }
    public String seu() {
        if (estaAssegut()) {
            return "no faig res";
        }
        setPosicio("assegut");
        return "m\'assec";
    }
    public boolean estaDret() {
        if(getPosicio().equals("dret")) {
            return true;
        }
        return false;
    }
    public boolean estaAssegut() {
        if(getPosicio().equals("assegut")) {
            return true;
        }
        return false;
    }
    public boolean estaEstirat() {
        if(getPosicio().equals("estirat")) {
            return true;
        }
        return false;
    }
    public boolean estaViu() {
        if(getVides()>0) {
            return true;
        }
        return false;
    }
} 
