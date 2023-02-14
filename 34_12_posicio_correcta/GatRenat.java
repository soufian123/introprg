/*aquest es el programa del gat renat on tenim tota la seva informacio guardada*/



   public class GatRenat {
       private int vides = 7;
       private String posicio = "estirat";

       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public void setPosicio(String novaPosicio) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novaPosicio.equals("dret") || novaPosicio.equals("assegut") || novaPosicio.equals("estirat")) {
               posicio = novaPosicio;
           }
       }
       
       public String getPosicio() {  //  retorna el nombre de vides
           return posicio;
       }
       
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();


       }
   }
