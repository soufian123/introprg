/* 
 * 
 * utilitzacio del GatRenat on ens dira algunes de les utilitats que li diem que ens digui.
 * 
 */



 public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat = GatRenat.getInstancia();
         System.out.println("Inicialment Renat està " + renat.getPosicio());
         for (String posicio: args) {
             canviaPosicio(posicio);
             System.out.println("Ara està " + renat.getPosicio());
         }
     }
     private static void canviaPosicio(String novaPosicio) {
         // Tradueix novaPosicio: 1 -> estirat, 2 -> assegut, 3 -> dret,
         // altrament es queda com estava
         // XXX
         if(novaPosicio.equals("1")){
            novaPosicio="estirat";
        }
        if(novaPosicio.equals("2")){
            novaPosicio="assegut";
        }
        if(novaPosicio.equals("3")){
            novaPosicio="dret";
        }
         GatRenat.getInstancia(novaPosicio);
     }
 }

