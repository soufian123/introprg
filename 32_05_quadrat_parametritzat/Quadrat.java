//Desenvolupa un programa que esperi un valor enter positiu en args[0] i mostri un quadrat de " X" amb el costat indicat pel valor rebut.


/*

public class Quadrat{
    public static void main (String[] args){
    
        int num=Integer.parseInt(args[0]);
        if(num>0){
            dibuixaQuadrat();
            
        }
    }
        
    public static void dibuixaQuadrat(){
        for (int lin=0; lin<num; lin++){
            dibuixaLinia();
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia(){
        //dibuixa en columnes
        for(int col=0; col<num;col++){
            DibuixaX();
        }
    }
    public static void DibuixaX(){
        //dibuixa X
        System.out.print(" X"); 
    }
}
*/


public class Quadrat{
    public static void main (String[] args){
    
        int num=Integer.parseInt(args[0]);

        switch (num) {
            case 1: dibuixaQuadrat1();
                    break;
            case 2: dibuixaQuadrat2();
                    break;
            case 3: dibuixaQuadrat3();
                    break;
            case 4: dibuixaQuadrat4();
                    break;
            case 5: dibuixaQuadrat5();
                    break;
            case 6: dibuixaQuadrat6();
                    break;
            case 7: dibuixaQuadrat7();
                    break;
            case 8: dibuixaQuadrat8();
                    break;
            case 9: dibuixaQuadrat9();
                    break;
            default:
                    break;
        
        }
            
        
    }
    
    
    public static void dibuixaQuadrat1(){
        for (int lin=0; lin<1; lin++){
            dibuixaLinia1();
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia1(){
        //dibuixa en columnes
        for(int col=0; col<1;col++){
            DibuixaX();
        }
    }
    public static void DibuixaX(){
        //dibuixa X
        System.out.print(" X"); 
    }
    
    public static void dibuixaQuadrat2(){
        for (int lin=0; lin<2; lin++){
            dibuixaLinia2();
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia2(){
        //dibuixa en columnes
        for(int col=0; col<2;col++){
            DibuixaX();
        }
    }
    public static void dibuixaQuadrat3(){
        for (int lin=0; lin<3; lin++){
            dibuixaLinia3();
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia3(){
        //dibuixa en columnes
        for(int col=0; col<3;col++){
            DibuixaX();
        }
    }
    public static void dibuixaQuadrat4(){
        for (int lin=0; lin<4; lin++){
            dibuixaLinia4();
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia4(){
        //dibuixa en columnes
        for(int col=0; col<4;col++){
            DibuixaX();
        }
    }
    public static void dibuixaQuadrat5(){
        for (int lin=0; lin<5; lin++){
            dibuixaLinia5();
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia5(){
        //dibuixa en columnes
        for(int col=0; col<5;col++){
            DibuixaX();
        }
    }
    public static void dibuixaQuadrat6(){
        for (int lin=0; lin<6; lin++){
            dibuixaLinia6();
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia6(){
        //dibuixa en columnes
        for(int col=0; col<6;col++){
            DibuixaX();
        }
    }
    public static void dibuixaQuadrat7(){
        for (int lin=0; lin<7; lin++){
            dibuixaLinia7();
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia7(){
        //dibuixa en columnes
        for(int col=0; col<7;col++){
            DibuixaX();
        }
    }
    public static void dibuixaQuadrat8(){
        for (int lin=0; lin<8; lin++){
            dibuixaLinia8();
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia8(){
        //dibuixa en columnes
        for(int col=0; col<8;col++){
            DibuixaX();
        }
    }
    public static void dibuixaQuadrat9(){
        for (int lin=0; lin<9; lin++){
            dibuixaLinia9();
            //dibuixa salt
            System.out.println();
        }
    }
        
        
    public static void dibuixaLinia9(){
        //dibuixa en columnes
        for(int col=0; col<9;col++){
            DibuixaX();
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
