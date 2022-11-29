//Desenvolupa un programa que demani un text i dibuixi un triangle amb les lletres del text en ordre invers al text introduït. (moduls)



public class TriangleLletresInvertit{
    public static void main (String[] args){
    
    
        
        System.out.println("Text?");
        String text= Entrada.readLine();


        if (!text.isBlank()){
        
            dibuixaTriangleInvertit(text);
        }

    }
    
    public static void dibuixaTriangleInvertit(String text){
            for (int lin = text.length()-1; lin>=0; lin--){
        System.out.println();
            for (int col = lin; col>0; col--){
            System.out.print(text.charAt(col)+", ");
            
            }
        dibuixaLiniaInvertida(text, lin);
        }  
    }      
    
    public static void dibuixaLiniaInvertida(String text, int linia){
        System.out.print(text.charAt(0));
    }
           
}
