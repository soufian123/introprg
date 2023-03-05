

public class Felí extends Carnívor {
    
    private UrpaRetractil[] urpes;
    public void caça(Animal presa) { /* … */ }
    
}

class Carnívor{
    private String nom="Carnívor";
    public void main(String[] args) {
        System.out.println("Hola, soc en "+nom);
    }
}

class Gat extends Felí{
    private String nom="Gat";
    public void main(String[] args) {
        System.out.println("Hola, soc en "+nom);
    }
}
class Pantera extends Felí{
    private String nom="Pantera";
    public void main(String[] args) {
        System.out.println("Hola, soc en "+nom);
    }
}
