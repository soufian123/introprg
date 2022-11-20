//codificar el text






public class CodificaBasic{
    public static void main (String[] args){
        
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        char ch= text.charAt(0);
        
        System.out.print((char)(ch));
        for(int num=1; num<text.length(); num++){
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
                    
                    System.out.print((char)(ch+1));
                }else{ 
                
                }
        }
    }
}
