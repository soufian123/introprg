/*aquest es el programa del gat renat on tenim tota la seva informacio guardada*/





   public class GatRenat {
        public int vides = 0;
       private boolean estaViu = true;
       private boolean estaDret = false;
       private boolean estaAssegut = false;
       private boolean estaEstirat = true;
       private String posicio = "estirat";

       public boolean getEstaViu() {
           return estaViu;
       }
       public boolean getEstaDret() {
           return estaDret;
       }
       public boolean getEstaAssegut() {
           return estaAssegut;
       }
       public boolean getEstaEstirat() {
           return estaEstirat;
       }
       public void setVides(int num) {
            if(num<=0){
            estaViu=false;
            }else{
                estaViu=true;
            }
       }
       public String getPosicio() {  //  retorna el nombre de vides
           return posicio;
       }
        public void setPosicio(String novaPosicio) { 
           if (novaPosicio.equals("dret") || novaPosicio.equals("assegut") || novaPosicio.equals("estirat")) {
               posicio = novaPosicio;
           }
       }


       
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();


       }
   }






