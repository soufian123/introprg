



//Desenvolupa un programa que demani un text i el torni a mostrar però invertint l'ordre de les lletres dins de cada paraula. L'ordre de les paraules dins del text romandrà igual que a l'original.














public class ParaulesReves{
    public static void main(String[] args){
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        int espai=0;
        String verificar="false";
        
        for(int num=0; num<text.length(); num++){
            
            if(Character.isWhitespace(text.charAt(num))){
                verificar="true";
                break;
            }
        }
        
        if(verificar=="true"){
        
        
            for(int num=0; num<text.length(); num++){
                
                if(Character.isWhitespace(text.charAt(num))){
                    
                    for (int numero=num; numero>=espai; numero--){
                        System.out.print(text.charAt(numero));
                    }
                    espai=num;
                    
                }
            }
            for (int numero=text.length()-1; numero>=espai; numero--){
                System.out.print(text.charAt(numero));
            }
            System.out.println();
        }else{
            for (int numero=text.length()-1; numero>=0; numero--){
                System.out.print(text.charAt(numero));
            }
        }
        
    }
}
        
