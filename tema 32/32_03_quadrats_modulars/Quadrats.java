/*


un programa que demani un número per entrada estàndard, i dibuixi tants quadrats com indiqui el número. Si el número és 0 o negatiu, no dibuixarà res, pero des de dibuixaQuadrats() es cridarà un mòdul anomenat dibuixaQuadrat() que farà la feina de dibuixar les difents línies del quadrat fent servir dibuixaLinia()



*/



public class Quadrats{
    public static void main (String[] args){
        
        dibuixaQuadrats();
    }
        
    public static void dibuixaQuadrats(){
        //preguntar quants
        System.out.println("Quants?");
        int quants=Integer.parseInt(Entrada.readLine());
        if(quants>0){
        //repeteix quadrat
            for (int num=1;num<=quants; num++){
                dibuixaQuadrat();
            }


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
