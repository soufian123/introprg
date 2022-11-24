//Desenvolupa un programa que demani un número per entrada estàndard, i dibuixi tants quadrats com indiqui el número. Si el número és 0 o negatiu, no dibuixarà res.


public class Quadrats{
    public static void main (String[] args){
        
        //preguntar quants
        System.out.println("Quants?");
        int quants=Integer.parseInt(Entrada.readLine());
        if(quants>0){
        //repeteix quadrat
            for (int num=1;num<=quants; num++){
                //imprimeix lineas
                for (int lin=0; lin<6; lin++){
                    //dibuixa en columnes
                    for(int col=0; col<6;col++){
                        //dibuixa X
                        System.out.println(" X");
                    }
                }
            }
        }
    }
}               
