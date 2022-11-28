//Farem ara una nova versió del quadrat parametritzat. En aquesta ocasió, el programa serà capaç de mostrar un caràcter diferent de X a partir del que main() rebi a args[1]




public class Quadrat{
    public static void main (String[] args){
    
        int num=Integer.parseInt(args[0]);
        char caracter=Entrada.readLine().charAt(1);
        if(num>0){
            dibuixaQuadrat(num, caracter);
            
        }
    }
        
    public static void dibuixaQuadrat(int operand, char carac){
        for (int lin=0; lin<operand; lin++){
            dibuixaLinia(operand, carac);
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia(int columnes, char car){
        //dibuixa en columnes
        for(int col=0; col<columnes;col++){
            DibuixaX( columnes, car);
        }
    }
    public static void DibuixaX( int columnes, char lletra){
        //dibuixa X
        System.out.print(lletra); 
    }
}

