//En aquesta ocasió desenvoluparem un programa que permeti construir taules de multiplicar personalitzades.

public class TaulaMultiplicar{
    public static void main (String[] args){
        
        
        int inicialPrimer = Integer.parseInt(Entrada.readLine());
        int finPrimer = Integer.parseInt(Entrada.readLine());
        
        int inicialSegon = Integer.parseInt(Entrada.readLine());
        int finSegon = Integer.parseInt(Entrada.readLine());
        
        
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
