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
        if (!esValida(hores, minuts, segons)){
            hores=0;
            minuts=0;
            segons=0;
        }else{
            setHores(hores);
            setMinuts(minuts);
            setSegons(segons);
        }
    }
    
    public void setHores(int novaHora) {
        hores=novaHora;
        while (hores>=24){
            hores=hores-24;
        }
        if (hores<0){
            hores=hores+24;
        }
    }
    public void setMinuts(int nouMinuts) {
        minuts=nouMinuts;
        while (minuts>=60){
            minuts=minuts-60;
            setHores(hores+1);
        }
        while (minuts<0){
            minuts=60+minuts;
            setHores(hores-1);
        }
    }
    
    public void setSegons(int nouSegons) {
        segons=nouSegons;
        while (segons>=60){
            segons=segons-60;
            setMinuts(minuts+1);
        }
        while (segons<0){
            segons=60+segons;
            setMinuts(minuts-1);
        }
    }
    
    public void incrementa(){
        setSegons(segons+1);
    }
    public void incrementa(int incrementa){
        setSegons(segons+incrementa);
    }
    public void decrementa(){
        setSegons(segons-1);
    }
    public void decrementa(int decrementa){
        setSegons(segons-decrementa);
    }
    
    
    public int compareTo(Hora hora) {
        if (getHores() > hora.hores) {
            return 1;
        }
        if (getHores() < hora.hores) {
            return 1;
        }
        if (getMinuts() > hora.minuts) {
            return 1;
        }
        if (getMinuts() < hora.minuts) {
            return -1;
        } 
        if (getSegons() > hora.segons) {
                return 1;
        }
        if (getSegons() < hora.segons) {
                return -1;
        }
        return 0;
    }
    public static int compareTo(Hora hora, Hora hora2) {
        if (hora2.getHores() > hora.hores) {
            return 1;
        }
        if (hora2.getHores() < hora.hores) {
            return -1;
        }
        if (hora2.getMinuts() > hora.minuts) {
            return 1;
        }
        if (hora2.getMinuts() < hora.minuts) {
            return -1;
        } 
        if (hora2.getSegons() > hora.segons) {
                return 1;
        }
        if (hora2.getSegons() < hora.segons) {
                return -1;
        }
        return 0;
    }
     public Hora duplica(){
        Hora nuevaHora= new Hora();
        nuevaHora.setHores(this.getHores());
        nuevaHora.setMinuts(this.getMinuts());
        nuevaHora.setSegons(this.getSegons());
        return nuevaHora;
    }
    public static Hora duplica(Hora hora1){
        Hora nuevaHora= new Hora();
        nuevaHora.setHores(hora1.getHores());
        nuevaHora.setMinuts(hora1.getMinuts());
        nuevaHora.setSegons(hora1.getSegons());
        return nuevaHora;
    }
    
    
    public static boolean esValida(int hores, int minuts, int segons){
        if (hores==24 || hores<0 || minuts==60 || minuts<0 || segons==60 || segons<0){
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", getHores(), getMinuts(), getSegons());
    }
    
    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {
        int comparacio = hora1.compareTo(hora2);
        if (comparacio < 0) {
            return "<";
        } else if (comparacio > 0) {
            return ">";
        } else {
            return "==";
        }
    }
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
}
