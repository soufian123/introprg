  public class GatRenat {
        public int vides ;         // vides disponibles del gat Renat
       public static void main(String[] args) {
         GatRenat renat;           // declarem la referència al gat
        renat = new GatRenat();   // creem la instància del gat Renat.
       System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    }
}





 01   public class GatRenat {
02       public int vides = 7;         // vides disponibles del gat Renat
03       public static void main(String[] args) {
04           GatRenat renat;           // declarem la referència al gat
05           renat = new GatRenat();   // creem la instància del gat Renat.
06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
07       }
08   }
