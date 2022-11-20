//posa les majuscules a les inicials



public class MajusculitzaInicials{
    public static void main (String[] args){
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        
        String seguenMajuscula="false";
        
        System.out.print(Character.toUpperCase(text.charAt(0)));
        text= text.toLowerCase();
        String espai=" ";

        
        for(int num=1; num<text.length(); num++){

            if(seguenMajuscula=="true" || text.charAt(num-1)==' '){
                System.out.print(Character.toUpperCase(text.charAt(num)));
                seguenMajuscula="false";
                
            }else if(seguenMajuscula=="false"){
            
                if (text.charAt(num)==' ' || Character.isLetter(text.charAt(num))==false){
                    seguenMajuscula="true";
                    System.out.print(text.charAt(num));
                    
                }else{
                    System.out.print(text.charAt(num));
                }
            }

        }
        
    }
}
