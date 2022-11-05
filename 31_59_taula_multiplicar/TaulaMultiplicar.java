//En aquesta ocasió desenvoluparem un programa que permeti construir taules de multiplicar personalitzades.

public class TaulaMultiplicar{
    public static void main (String[] args){
        System.out.println("El primer argument és " + args[0]);
        System.out.println("El segon argument és  " + args[1]);
        System.out.println("El tercer argument és " + args[2]);
        System.out.println("El quart argument és  " + args[3]);
        
        int inicialPrimer = Integer.parseInt(args[0]);
        int finPrimer = Integer.parseInt(args[1]);
        
        int inicialSegon = Integer.parseInt(args[2]);
        int finSegon = Integer.parseInt(args[3]);
        
        
        if (inicialPrimer>finPrimer){
            int numero=finPrimer;
            inicialPrimer = finPrimer;
            finPrimer = inicialPrimer;
        }
        if (inicialSegon>finSegon){
            int numero=finSegon;
            inicialSegon = finSegon;
            finSegon = inicialSegon;
        }
        for (int increment = inicialPrimer; increment<=finPrimer; increment++){

            for (int iSegon = inicialSegon; iSegon<=finSegon; iSegon++){
                int resultat= (increment) * (iSegon);
                System.out.println(increment + " x "+ iSegon +" = " + resultat);
            }
        }
    }
}
