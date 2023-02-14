/*aquest es el programa del ascensor on tenim tota la seva informacio guardada*/



   public class Ascensor {
       private int pis = -1;
       private String moviment = "aturat";

       public int getPis() {  
           return pis;
       }
       public void setPis(String text) { 
       
           if (Character.isDigit(text.charAt(0))) { 
                int novespis = Integer.parseInt(text);
               if (novespis<11 &  novespis >-2){
                   pis = novespis;
               }
           }
       }
       public void setMoviment(String nouMoviment) {  
           if (nouMoviment.equals("aturat") || nouMoviment.equals("pujant") || nouMoviment.equals("baixant")) {
               moviment = nouMoviment;
           }
       }
       
       public String getMoviment() {  
           return moviment;
       }
       
       public static void main(String[] args) {
           Ascensor ascensor = new Ascensor();


       }
   }
