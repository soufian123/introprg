//Desenvolupa un programa que esperi un valor enter positiu en args[0] i mostri un quadrat de " X" amb el costat indicat pel valor rebut.




public class Quadrat{
    public static void main (String[] args){
    
        int quants=Integer.parseInt(args[0]);
        if(quants>0){
            //dibuixaQuadrat();
            for (int lin=0; lin<quants; lin++){
                //dibuixaLinia();
                        //dibuixa en columnes
                for(int col=0; col<quants;col++){
                    //dibuixa X
                    System.out.print(" X");
                }    
                    //dibuixa salt
                System.out.println();
            }
        }
    }

        

  /*  public static void dibuixaQuadrat(){
        //imprimeix lineas
        for (int lin=0; lin<quants; lin++){
            dibuixaLinia();
            //dibuixa salt
            System.out.println();
        }
    }
    public static void dibuixaLinia(){
        //dibuixa en columnes
        for(int col=0; col<quants;col++){
            //dibuixa X
            System.out.print(" X");
        }
    }
    */
}
