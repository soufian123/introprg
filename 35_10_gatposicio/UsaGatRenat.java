
/*
 * programa del usaGatrenat on va probant per verificar que el gat renat y posicio estan ben fets
 *
 */


 public class UsaGatRenat {

      public static void main(String[] args){

          try {

              GatPosicio posicio = GatPosicio.fromString(args[0]);

              GatRenat renat = new GatRenat(posicio);

              System.out.println("El gat Renat està: " + renat.getPosicio());

         } catch (IllegalArgumentException e) {

             System.out.println(e);

         }

      }

 }
