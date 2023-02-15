/*aquest es el programa del gat renat on tenim tota la seva informacio guardada*/





   public class Ascensor {
       private int pis = -1;
       private String moviment = "aturat";
       
       
       public String comEsta (){
            return (moviment+" al pis "+pis);
       }
        public int getPis() {  
           return pis;
       }
       public String getMoviment() {  
           return moviment;
       }
        
        public void setMoviment(String novaMoviment) { 
           if (novaMoviment.equals("abaix") || novaMoviment.equals("amunt") || novaMoviment.equals("aturat") || novaMoviment.equals("movent") || novaMoviment.equals("pujant") || novaMoviment.equals("baixant")) {
               moviment = novaMoviment;
           }
           
       }
       public boolean estaAbaix(){
            if(getPis()==-1){
                return true;
           }
           return false;
       }
      public boolean estaAmunt(){
           if(getPis()==10){
                return true;
           }
           return false;
        }
      public boolean estaAturat(){
           if(getMoviment().equals("aturat")){
                return true;
           }
            return false;
        }
        public boolean estaMovent(){
           if(getMoviment().equals("movent")){
                return true;
           }
            return false;
        }
        public boolean estaPujant(){
           if(getMoviment().equals("pujant")){
                return true;
           }
            return false;
        }
       public boolean estaBaixant(){
           if(getMoviment().equals("baixant")){
                return true;
           }
            return false;
        }
        
       public void setPis(int novespis) {   
           if (novespis<11 &  novespis >-2){
               pis = novespis;
           }
       }
       
       public static void main(String[] args) {
           Ascensor ascensor = new Ascensor();


       }
   }


