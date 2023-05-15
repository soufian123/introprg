/**
 * Compara dues hores i retorna l'operador corresponent
 * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els
 * altres dos valors possibles són ">" i "=="
 * @param hora1: primera hora a comparar
 * @param hora2: segona hora a comparar
 * @return operador resultant
 */






public class Hora{
    private int hores=0;
    private int minuts=00;
    private int segons=00;
    public int getHores() { return hores; }
    public int getMinuts() { return minuts; }
    public int getSegons() { return segons; }
    public Hora() {
        
    }
    public Hora(int hores, int minuts, int segons) throws Exception{
            try {
            setHores(hores);
            setMinuts(minuts);
            setSegons(segons);
            } catch (IllegalArgumentException  e) {
                throw e;
            }

    }
    
    
    public void setHores(int hores) throws Exception {
        if (hores >= 0 && hores < 24) {
            this.hores = hores;

        } else {
            throw new IllegalArgumentException("hores fora de rang: " + hores);
        }
    }

    public void setMinuts(int minuts) throws Exception {
        if (minuts >= 0 && minuts < 60) {
            this.minuts = minuts;

        } else {
            throw new IllegalArgumentException("minuts fora de rang: " + minuts);
        }
    }

    public void setSegons(int segons) throws Exception {
        if (segons >= 0 && segons < 60) {
            this.segons = segons;

        } else {
            throw new IllegalArgumentException("segons fora de rang: " + segons);
        }
    }
    

    

    
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", getHores(), getMinuts(), getSegons());
    }
}
