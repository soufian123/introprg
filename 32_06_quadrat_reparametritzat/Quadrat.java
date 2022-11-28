//Farem ara una nova versió del quadrat parametritzat. En aquesta ocasió, el programa serà capaç de mostrar un caràcter diferent de X a partir del que main() rebi a args[1]




public class Quadrat{
    public static void main (String[] args){
    
        int num=Integer.parseInt(args[0]);
        char caracter=Entrada.readLine().charAt(1);
        if(num>0){
            dibuixaQuadrat(num, caracter);
            
        }
    }
        
    public static void dibuixaQuadrat(int operand, char caracter){
        for (int lin=0; lin<operand; lin++){
            dibuixaLinia(operand, caracter);
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia(int columnes, char caracter){
        //dibuixa en columnes
        for(int col=0; col<columnes;col++){
            DibuixaX( caracter);
        }
    }
    public static void DibuixaX( char caracter){
        //dibuixa X
        System.out.print(caracter); 
    }
}

