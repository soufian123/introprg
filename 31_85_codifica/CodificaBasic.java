//codificar el text






public class CodificaBasic{
    public static void main (String[] args){
        
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        String lletres="qwertyuiopasdfghjklñxcvbnm";
        char ch= text.charAt(0);
        

        for(int num=0; num<text.length(); num++){
            ch= text.charAt(num);
            
                if(text.charAt(num)=='@'){
                    System.out.print("@");
                }else if (!(Character.isLetter(text.charAt(num)))){
                    System.out.print(ch);
                }else if(text.charAt(num)=='z'){
                    System.out.print("a");
                }else if(text.charAt(num)==' '){
                    System.out.print(" ");
                }else if(Character.isLetter(text.charAt(num))){
                    if(Character.isLowerCase(text.charAt(num))){
                        for(int numero=0; numero<=lletres.length(); numero++)
                            if (lletres.charAt(numero)==text.charAt(num)){
                    
                                System.out.print((char)(ch+1));
                            }else{ System.out.print((char)(ch));
                
                        }
                    }
                }
        }
    }
}
