/*
versió del lloro que, com és tradicional, vagi demanant texts i els repeteixi fins que arribi un text en blanc o buit.

En aquesta versió, no obstant, si el text que rep és "dibuixa quadrat" o "dibuixa rectangle", en comptes de repetir el text, dibuixarà el quadrat o el rectangle corresponent.

En finalitzar, s'acomiadarà amb el tradicional "Adéu"
*/


public class LloroQuadrat{
    public static void main (String[] args){
    
    Lloro();
    }
    
    public static void Lloro(){
    
        String text =("asd");
        while (!text.isBlank()){
            System.out.println(" El lloro espera paraula:");
            text= Entrada.readLine();
            if (text=="dibuixa quadrat"){
                Quadrat();
            }else if (text=="dibuixa rectangle"){
                Rectangle();
            }else if (text.isBlank()){
            }else{
                System.out.println("El lloro repeteix: "+text);
            }
        }
    }
    ////////////////            Quadrat              ///////////////////////////////
    public static void Quadrat(){
        dibuixaQuadrat();
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
    ////////////////////              Rectangle                     //////////////////////////
    public static void Rectangle(){
        dibuixaRectangle();
    }
    public static void dibuixaRectangle(){
        //imprimeix lineas
        for (int lin=1; lin<6; lin++){
            dibuixaLiniaRectangle();
            //dibuixa salt
            System.out.println();
        }
    }
    public static void dibuixaLiniaRectangle(){
        //dibuixa en columnes
        for(int col=1; col<11;col++){
            //dibuixa X
            System.out.print(" X");
        }
    }
    
}
