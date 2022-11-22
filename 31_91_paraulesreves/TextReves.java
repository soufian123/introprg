



//Desenvolupa un programa que demani un text i el torni a mostrar però invertint l'ordre de les lletres dins de cada paraula. L'ordre de les paraules dins del text romandrà igual que a l'original.














public class TextReves{
    public static void main(String[] args){
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        int espais=0;
        
        for(int num=0; num<text.length(); num++){
            
            if(Character.isWhitespace(text.charAt(num))){
                
                for (int numero=num; numero>num; numero--){
                    System.out.print(text.charAt(numero));
                }
                
            }
        }
        System.out.println();
    }
}
        
