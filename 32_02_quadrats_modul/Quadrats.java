/*


un programa que demani un número per entrada estàndard, i dibuixi tants quadrats com indiqui el número. Si el número és 0 o negatiu, no dibuixarà res, pero des de main es cridarà un mòdul anomenat dibuixaQuadrats() que farà la feina de demanar el número de quadrats a dibuixar i els dibuixarà.



*/



public class Quadrats{
    public static void main (String[] args){
        
        dibuixaQuadrat();
    }
        
    public static void dibuixaQuadrat(){
        //preguntar quants
        System.out.println("Quants?");
        int quants=Integer.parseInt(Entrada.readLine());
        if(quants>0){
        //repeteix quadrat
            for (int num=1;num<=quants; num++){
                //imprimeix lineas
                for (int lin=1; lin<6; lin++){
                    //dibuixa en columnes
                    for(int col=1; col<6;col++){
                        //dibuixa X
                        System.out.print(" X");
                    }
                //dibuixa salt
                System.out.println();
                }
            }
        }
    }
}               
