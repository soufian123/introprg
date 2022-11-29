//Desenvolupa un programa que demani un text i dibuixi un triangle amb les lletres del text. (moduls)



public class TriangleLletres{
    public static void main (String[] args){
    
    
        
        System.out.println("Text?");
        String text= Entrada.readLine();


        if (!text.isBlank()){

            dibuixaTriangle(text)      ;  

        }


    }
    
    public static void dibuixaTriangle(String text){
    
        for (int lin = 0; lin<=text.length()-1; lin++){
            System.out.println();
            for (int col = 0; col<lin; col++){
                System.out.print(text.charAt(col)+", ");
            
            }
        dibuixaLinia(text, lin);
        }     
    }
    public static void dibuixaLinia(String text, int linia){
    
        System.out.print(text.charAt(linia));
    }   
            
    
          
}
