//Desenvolupa un programa que demani un text i el torni a mostrar però invertint l'ordre dels caràcters que el composen. Els caracters resultants apareixeran separats per comes.







public class TextReves{
    public static void main (String[] args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        if (!text.isBlank()){
            int fin=0;
            for(int num=text.length()-1; num>=0; num--){

                    fin=num;
                    num=0;
                
            }
            
            
            for(int num=fin; num>0; num--){

                    System.out.print(text.charAt(num)+", ");
              }  
            System.out.print(text.charAt(0));
        }

    }
}
