//posa les majuscules a les inicials



public class MajusculitzaInicials{
    public static void main (String[] args){
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        
        String seguenMajuscula="false";
        
        System.out.print(Character.toUpperCase(text.charAt(0)));
        //text= Character.toLowerCase();
        
        for(int num=1; num<text.length(); num++){
        
            if(seguenMajuscula=="true"){
                System.out.print(Character.toUpperCase(text.charAt(num)));
                seguenMajuscula="false";
                
            }else if(seguenMajuscula=="false"){
            
                if (Character.isLetter(text.charAt(num))==false || text.charAt(num)==' '){
                    seguenMajuscula="true";
                    System.out.print(Character.toLowerCase(text.charAt(num)));
                    
                }else{
                    System.out.print(Character.toLowerCase(text.charAt(num))+".   ");
                }
            }

        }
        
    }
}
