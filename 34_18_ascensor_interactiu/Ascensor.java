/*
 * programa que guarda la informacio de l'ascensor i li donem la informacio 
 * que necesita el demanador(UsaAscensor)
 *
 */
 



   public class Ascensor {
       private int pis = -1;
       private String moviment = "pujant";
       private String inici="aturat";
       
       public String comEsta (){
            return (moviment+" al pis "+pis);
       }
       public String comEstaInici (){
            return (inici+" al pis "+pis);
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
        public boolean aturat(){
           if(getMoviment().equals("aturat")){
                return true;
           }
            return false;
        }
        public boolean estaMovent(){
           if(estaPujant() || estaBaixant()){
            return true;
            }else{
            return false;
            }
        }
        public boolean estaPujant(){
           if(getMoviment().equals("pujant")){
                return true;
           }
            return false;
        }
        public boolean arrencaAmunt(){
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
        public boolean arrencaAbaix(){
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
       public int seguentPis() {  
           if (moviment.equals("pujant") && pis==10){
			    moviment = "baixant";
            }
            if(moviment.equals("pujant")){
                pis++;
                return pis;
            }
            if (moviment.equals("baixant") && pis==-1){
                moviment = "aturat";
            }
                
            if(moviment.equals("baixant")){
                pis--;
                return pis;
            }
            return pis;
       }
       public static void main(String[] args) {
           Ascensor ascensor = new Ascensor();


       }
   }



