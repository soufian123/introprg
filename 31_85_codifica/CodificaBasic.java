//codificar el text






public class CodificaBasic{
    public static void main (String[] args){
        
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        char ch= text.charAt(0);
        
        System.out.println((char)(ch+1));
        for(int num=1; num<text.length(); num++){
            ch= text.charAt(num);
            System.out.println((char)(ch+1));
        }
    }
}
