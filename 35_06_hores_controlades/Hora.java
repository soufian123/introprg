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
    public Hora(){
        setHores(hores);
        setMinuts(minuts);
        setSegons(segons);
    }
    public Hora(int hores, int minuts, int segons){
        if (hores==24 || hores<0 || minuts==60 || minuts<0 || segons==60 || segons<0){
            hores=0;
            minuts=0;
            segons=0;
        }else{
            setHores(hores);
            setMinuts(minuts);
            setSegons(segons);
        }
    }
    
    
    public boolean setHores(int hores) {
        if (hores >= 0 && hores < 24) {
            this.hores = hores;
            return true;
        } else {
            return false;
        }
    }

    public boolean setMinuts(int minuts) {
        if (minuts >= 0 && minuts < 60) {
            this.minuts = minuts;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSegons(int segons) {
        if (segons >= 0 && segons < 60) {
            this.segons = segons;
            return true;
        } else {
            return false;
        }
    }
    

    

    
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", getHores(), getMinuts(), getSegons());
    }
/*
    public static void main(String[] args) {
        Hora hora1 = new Hora();
        Hora hora2 = new Hora(0, 0, 2);
        System.out.printf("Inicialment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);
        System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
        hora1.incrementa();
        hora2.decrementa();
        System.out.printf("Finalment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);

    }
    */
}
