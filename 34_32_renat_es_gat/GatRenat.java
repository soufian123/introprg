
/*
 * en aquest programa te totes les crides necesaires perque poguem saber el estat de Gat, es a dir, 
 * aixecat, asegut, estirat, etc... tambe podrem saber si esta viu o si esta o canviar les altres 
 * posicions mencionats
 * GatRenat es per utilitzar els accessors heredats de Gat.
 * es el gat renat que es el fill de gat, es a dir, anira extends a Gat
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
