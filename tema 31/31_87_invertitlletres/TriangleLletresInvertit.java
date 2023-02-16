//Desenvolupa un programa que demani un text i dibuixi un triangle amb les lletres del text en ordre invers al text introduït.



public class TriangleLletresInvertit{
    public static void main (String[] args){
    
    
        
        System.out.println("Text?");
        String text= Entrada.readLine();


        if (!text.isBlank()){
        
            for (int lin = text.length()-1; lin>=0; lin--){
            System.out.println();
                for (int col = lin; col>0; col--){
                System.out.print(text.charAt(col)+", ");
                
                }
            System.out.print(text.charAt(0));
            }        
        
        }

    }       
}
