/*aquest es el programa del gat renat on tenim tota la seva informacio guardada*/





   public class GatRenat {
       private boolean estaViu = true;
       private String posicio = "estirat";

       public boolean getEstaViu() {
           return estaViu;
       }
       public boolean getEstaDret() {
           return estaDret();
       }
       public boolean getEstaAssegut() {
           return estaAssegut();
       }
       public boolean getEstaEstirat() {
           return estaEstirat();
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
       public boolean estaDret(){
            if(getPosicio().equals("dret")){
                return true;
           }
           return false;
       }
      public boolean estaAssegut(){
           if(getPosicio().equals("assegut")){
                return true;
           }
           return false;
        }
      public boolean estaEstirat(){
           if(getPosicio().equals("estirat")){
                return true;
           }
            return false;
        }
       
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();


       }
   }






