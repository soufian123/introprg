 /*programa que diu el pis inicial el moviment, el nou pis i dades del ascensor*/
 
 
 
 public class UsaAscensor {

     /* XXX */

     public static void main(String[] args) {

         Ascensor ascensor = new Ascensor();

         System.out.println("Pis inicial: " + ascensor.getPis());

         System.out.println("Moviment inicial: " + ascensor.getMoviment());

         System.out.println("Introdueix nou pis:");

         ascensor.setPis(Entrada.readLine());

         System.out.println("Introdueix nou moviment:");

         ascensor.setMoviment(Entrada.readLine());

         System.out.println("Pis final: " + ascensor.getPis());

         System.out.println("Moviment final: " + ascensor.getMoviment());

     }

 }
