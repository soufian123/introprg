



//Desenvolupa un programa que demani un text i el torni a mostrar però invertint l'ordre de les lletres dins de cada paraula. L'ordre de les paraules dins del text romandrà igual que a l'original.



public class ParaulesReves{
    public static void main(String[] args){
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        int espai=0;
        String verificar="false";
        String lletra="false";
        String nombres="false";
        
        for(int num=0; num<text.length(); num++){
            
            if(Character.isWhitespace(text.charAt(num))){
                verificar="true";
                break;
            }
        }
        for(int num=0; num<text.length(); num++){
            if(Character.isLetter(text.charAt(num))){
                lletra="true";
                
            }else{
                lletra="false";
                break;
            }
        }
        
        for(int num=0; num<text.length(); num++){
            if(Character.isDigit(text.charAt(num))){
                nombres="true";
            }else{
                nombres="false";
                break;
            
            }
        
        }
        
        if(verificar=="true" && ( lletra=="true" || nombres=="true")){
        
        
            for(int num=0; num<text.length(); num++){
                
                if(Character.isWhitespace(text.charAt(num))){
                    
                    for (int numero=num-1; numero>=espai; numero--){
                        System.out.print(text.charAt(numero));
                    }
                    System.out.print(" ");
                    
                    espai=num+1;
                    
                }
                
            }
            
            for (int numero=text.length()-1; numero>espai-1; numero--){
                System.out.print(text.charAt(numero));
            }

        }else if (verificar=="false" && ( lletra=="true" || nombres=="true") ){
            for (int numero=text.length()-1; numero>=0; numero--){
                System.out.print(text.charAt(numero));
            }
            
            
            
            
            
  /*      }else if(lletra=="false"){
        
        
            for(int num=0; num<text.length(); num++){
                
                if(Character.isWhitespace(text.charAt(num)) && Character.isLetter(text.charAt(num))){
                    
                    for (int numero=num-1; numero>=espai; numero--){
                        System.out.print(text.charAt(numero));
                    }
                    System.out.print(" ");
                    
                    espai=num+1;
                    
                }else{
                    System.out.print(text.charAt(num));
                }
            
                if(Character.isWhitespace(text.charAt(num)) && Character.isLetter(text.charAt(num))){
                    for (int numero=text.length()-1; numero>espai-1; numero--){
                    System.out.print(text.charAt(numero));
                    }
                }else{
                    System.out.print(text.charAt(num));
                }
            }

      */  }
        
    }
}
        
