

// Clase Felí, que hereda de Carnívor
public class Felí extends Carnívor {
    private UrpaRetractil[] urpes;
    public void caça(Animal presa) { /* … */ }
    
}
// Clase Animal, clase pare de Felí
public class Animal {
    private String nom = "Animal";
    
    protected void main(String[] args) {
        System.out.println("Hola, soc l\' " + nom);
    }
}

// Clase Carnívor, que es la clase pare de Felí
class Carnívor {
    
    private String nom = "Carnívor";
    
    protected void main(String[] args) {
        System.out.println("Hola, soc en " + nom);
    }
    
}

// Clase Gat, que hereda de Felí
class Gat extends Felí {
    
    private String nom = "Gat";
    
    public void main(String[] args) {
        System.out.println("Hola, soc en " + nom);
    }
    
}

// Clase Pantera, que hereda de Felí
class Pantera extends Felí {
    
    private String nom = "Pantera";
    
    public void main(String[] args) {
        System.out.println("Hola, soc en " + nom);
    }
    
}

