//aquest es un programa que et diu en quin pis esta i el seu moviment desde un ascensor que esta creat desde fora




public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.pis);
        
        System.out.println("Moviment inicial: " + ascensor.moviment);
        ascensor.moviment="pujant";
        System.out.println("Moviment final: " + ascensor.moviment);
        
        }
}



