//Desenvolupa un programa que esperi un valor enter positiu en args[0] i mostri un quadrat de " X" amb el costat indicat pel valor rebut.




public class Quadrat{
    public static void main (String[] args){
    
        int quants=Integer.parseInt(args[0]);
        if(quants>0){
            dibuixaQuadrat();

        }
    }
        

    public static void dibuixaQuadrat(){
        //imprimeix lineas
        for (int lin=1; lin<6; lin++){
            dibuixaLinia();
            //dibuixa salt
            System.out.println();
        }
    }
    public static void dibuixaLinia(){
        //dibuixa en columnes
        for(int col=1; col<6;col++){
            //dibuixa X
            System.out.print(" X");
        }
    }
}
