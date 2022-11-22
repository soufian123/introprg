//Desenvolupa un programa que demani un text i dibuixi un triangle amb les lletres del text en ordre invers al text introduït.





public class PiramideLletres{
    public static void main (String[] args){
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        for(int lin=0; lin<text.length(); lin++){
            
            
            //imprimerix punts esquerra
            for(int num=(text.length()-1) ; num>lin; num--){
                System.out.print("..");
            }
            
            //lletres
            for (int num=0; num<=lin; num++){
                System.out.print(text.charAt(num));
                if(lin>1 && lin<text.length()){
                    System.out.print(".");
                }
            }
             //imprimerix -
            System.out.print("-");
            
            //lletres
            for (int num=lin; num>=0; num--){
                System.out.print(text.charAt(num));
                if(lin>1 && lin<text.length()){
                    System.out.print(".");
                }
            }
            //imprimerix punts dreta
            for(int num=(text.length()-1) ; num>lin; num--){
                System.out.print("..");
            }
            System.out.println();
        }
    }
}
            
            
        
