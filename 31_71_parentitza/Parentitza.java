//Desenvolupa un programa que demani un text i mostri cada lletra entre parèntesis







public class Parentitza{
    public static void main (String[] args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        for(int num=0; num<text.length(); num++){
            if (!(text.charAt(num)==' ') || Character.isLetter(text.charAt(num))==true){
                System.out.print("("+text.charAt(num)+")");
            }else{System.out.print(text.charAt(num));
            }
        }
    }
}
        
        
        

