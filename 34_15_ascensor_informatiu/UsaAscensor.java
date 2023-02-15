 /*programa que diu el pis inicial el moviment, introduir el nou pis i dades del ascensor*/


public class UsaAscensor {
    // XXX considera si et cal algun mòdul d'ajut
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getPosicio());
        System.out.println("Introdueix nou pis:");
        // XXX llegir el nou pis de stdin i assignar-lo a l'ascensor
        ascensor.setPisFin(Integer.parseInt(Entrada.readLine()));
        
        System.out.println("Introdueix nou moviment:");
        // XXX llegir el nou moviment de stdin i assignar-lo a l'ascensor
        ascensor.setPosicio(Entrada.readLine());
        System.out.println("Pis final: " + ascensor.getPisFin());
        System.out.println("Moviment final: " + ascensor.getPosicio());
        System.out.println("Estat de l'ascensor: " + ascensor.comEsta());
    }
}
