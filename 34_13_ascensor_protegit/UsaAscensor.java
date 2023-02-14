 /*programa que diu el pis inicial el moviment, el nou pis i dades del ascensor*/
 
 
 
 public class UsaAscensor {

     /* XXX */

     public static void main(String[] args) {
         int numero=11;
         Ascensor ascensor = new Ascensor();

         System.out.println("Pis inicial: " + ascensor.getPis());

         System.out.println("Moviment inicial: " + ascensor.getMoviment());

         System.out.println("Introdueix nou pis:");
         String text=Entrada.readLine();
         if(Character.isDigit(text.charAt(0))){
            numero= Integer.parseInt(text);
         }
         ascensor.setPis(numero);

         System.out.println("Introdueix nou moviment:");

         ascensor.setMoviment(Entrada.readLine());

         System.out.println("Pis final: " + ascensor.getPis());

         System.out.println("Moviment final: " + ascensor.getMoviment());

     }

 }
