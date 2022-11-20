//codificar el text






public class CodificaBasic{
    public static void main (String[] args){
        
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        String vocals="áéíúóàèìùòäëïöü";
        char ch= text.charAt(0);
        String accents= "false";

        for(int num=0; num<text.length(); num++){
            ch= text.charAt(num);
            accents= "false";
                if(text.charAt(num)=='@'){
                    System.out.print("@");
                }else if (!(Character.isLetter(text.charAt(num)))){
                    System.out.print(ch);
                }else if(text.charAt(num)=='z'){
                    System.out.print("a");
                }else if(text.charAt(num)==' '){
                    System.out.print(" ");
                
                    
                    
                }else if(Character.isLetter(text.charAt(num)) && Character.isLowerCase(text.charAt(num))){
                    
                for (int v=0; v<vocals.length(); v++){
            
                    if(text.charAt(num)==vocals.charAt(v)){

                        accents="true";
                        break;
                    }
                }
                if(accents=="true"){
                    System.out.print((char)(ch));
                }else{
                    System.out.print((char)(ch+1));
                }
                    
                    
                    
                    
                    System.out.print((char)(ch+1));
                    }else{ 
                        System.out.print((char)(ch));
                    }
                
        }
    }
}
