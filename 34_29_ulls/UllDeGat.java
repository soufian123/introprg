
/*
 * Utilitats de GatRenat per saber si el ull esta obert o tancat
 *
 *
 */


public class UllDeGat {
    private boolean ull = false;
    public void setUll(boolean nouUll) {
        ull = nouUll;
    }
    public boolean getUll() {return ull;}
    public void obret() {
        setUll(true);
    }
    public void tancat() {
        setUll(false);
    }
    public boolean estaObert() {
        if(getUll() == true) {
            return true;
        }
        return false;
    }
}
