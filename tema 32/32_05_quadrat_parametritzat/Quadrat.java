//Desenvolupa un programa que esperi un valor enter positiu en args[0] i mostri un quadrat de " X" amb el costat indicat pel valor rebut.




public class Quadrat{
    public static void main (String[] args){
    
        int num=Integer.parseInt(args[0]);
        if(num>0){
            dibuixaQuadrat(num);
            
        }
    }
        
    public static void dibuixaQuadrat(int operand){
        for (int lin=0; lin<operand; lin++){
            dibuixaLinia(operand);
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia(int columnes){
        //dibuixa en columnes
        for(int col=0; col<columnes;col++){
            DibuixaX();
        }
    }
    public static void DibuixaX(){
        //dibuixa X
        System.out.print(" X"); 
    }
}

