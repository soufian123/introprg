//Desenvolupa un programa que demani un text i indiqui si el text és o no capicua.






public class Capicua{
    public static void main (String[] args){
    
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        int numero= (text.length()-1);
        String verificacio="false";
        
        if (!text.isBlank()){
            if (numero==0){
                System.out.println("És capicua");
            }else{
            
                if (numero % 2 == 0){
                    System.out.println("No és capicua");
                }else{
                    numero= (text.length()-1)/2;
                    int resta= numero;
                    for (int num=0;num<=numero; num++){
                        if(text.charAt(num)==text.charAt(resta)){
                            verificacio="true";
                            resta=resta-1;
                        }else{ 
                            verificacio="false";
                            break;
                        }
                    }
                    if (verificacio=="false"){
                        System.out.println("No és capicua");
                    }
                    if (verificacio=="true"){
                        System.out.println("És capicua");
                    }
                    verificacio="false";
                }
            }
        }
    }
}    
        
