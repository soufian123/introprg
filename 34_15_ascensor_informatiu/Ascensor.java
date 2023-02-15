/*aquest es el programa del gat renat on tenim tota la seva informacio guardada*/





   public class Ascensor {
       private int pis = -1;
       private int pisFin=0;
       private String posicio = "aturat";
       
       
       public String comEsta (){
            return (posicio+" al pis "+pisFin);
       }
        public int getPis() {  
           return pis;
       }

       public String getPosicio() {  
           return posicio;
       }
       public int getPisFin() {  
           return pisFin;
       }
        public void setPosicio(String novaPosicio) { 
           if (novaPosicio.equals("abaix") || novaPosicio.equals("amunt") || novaPosicio.equals("aturat") || novaPosicio.equals("movent") || novaPosicio.equals("pujant") || novaPosicio.equals("baixant")) {
               posicio = novaPosicio;
           }
           
       }
       public boolean estaAbaix(){
            if(getPosicio().equals("abaix")){
                return true;
           }
           return false;
       }
      public boolean estaAmunt(){
           if(getPosicio().equals("amunt")){
                return true;
           }
           return false;
        }
      public boolean estaAturat(){
           if(getPosicio().equals("aturat")){
                return true;
           }
            return false;
        }
        public boolean estaMovent(){
           if(getPosicio().equals("movent")){
                return true;
           }
            return false;
        }
        public boolean estaPujant(){
           if(getPosicio().equals("pujant")){
                return true;
           }
            return false;
        }
       public boolean estaBaixant(){
           if(getPosicio().equals("baixant")){
                return true;
           }
            return false;
        }
        
       public void setPisFin(int num){
            if (num<12){
                pisFin=num;
            }else{
                pisFin=pis;
            }
       }
       
       public static void main(String[] args) {
           Ascensor ascensor = new Ascensor();


       }
   }


