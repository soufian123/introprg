//Desenvolupa un programa que demani un text i mostri totes les lletres en minúscules excepte les vocals, que hauran d'estar en majúscules.



public class VocalsMajuscules{
    public static void main (String[] args){
        
        String vocals= "aeiou"; 
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        String esVocal="false";
        for(int num=0; num<text.length(); num++){
            esVocal="false";
            for (int v=0; v<vocals.length(); v++){
                if(text.charAt(num)==vocals.charAt(v)){
                    System.out.print(Character.toUpperCase(text.charAt(num)));
                    esVocal="true";
                }
            }
            
            if (esVocal=="false"){
                System.out.print(Character.toLowerCase(text.charAt(num)));
            }

        }
        
    }
}
