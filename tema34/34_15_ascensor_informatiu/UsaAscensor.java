 /*programa que diu el pis inicial el moviment, introduir el nou pis i dades del ascensor*/


public class UsaAscensor {
    // XXX considera si et cal algun mòdul d'ajut
    public static void main(String[] args) {
        int num=-1;
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        System.out.println("Introdueix nou pis:");
        // XXX llegir el nou pis de stdin i assignar-lo a l'ascensor
        String text=Entrada.readLine();
         if(Character.isDigit(text.charAt(0))){
            num= Integer.parseInt(text);
         }
        ascensor.setPis(num);
        
        System.out.println("Introdueix nou moviment:");
        // XXX llegir el nou moviment de stdin i assignar-lo a l'ascensor
        ascensor.setMoviment(Entrada.readLine());
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
        System.out.println("Estat de l'ascensor: " + ascensor.comEsta());
    }
}
