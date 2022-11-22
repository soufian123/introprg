//En aquesta ocasió desenvoluparem un programa que ens permetrà construir un triangle, no de caràcters sinó de paraules!

//Considerarem que les paraules són cadenes de caràcters separades per espais en blanc.



public class TriangleParaules{
    public static void main(String[] args){
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        int espais=0;
        
        for(int num=0; num<text.length(); num++){
            
            if(Character.isWhitespace(text.charAt(num))){
                
                for (int numero=0; numero<=num; numero++){
                    System.out.print(text.charAt(numero));
                }
                System.out.println();
            }
        }
        System.out.println(text);
    }
}
        
