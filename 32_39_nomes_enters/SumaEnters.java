//Desenvolupa un programa que a partir dels arguments que rebi per línia de comandes, mostri el resultat de sumar els enters que rebi.



public class SumaEnters{
    public static void main (String[] args){
        String text="";
        if (args.length==0){
            System.out.println("Cap argument");
            return;
        }
        
        int contador  =quantsEnters(args);
        
        if (contador==0){
            System.out.println("0");
            return;
        }
        
        //iniciem el array
        int[] numeros;
        int a=0;
        numeros = new int[contador];
        for (int num=0; num<args.length; num++){
            if (UtilString.esEnter(text)){
                numeros[a]= args[]
                
                
                
                
                
                filtraEnters(args);

        }
        
        
    }
        
        


    public static int quantsEnters(String[] valors) {    // nombre d'enters a valors
        //contador d'enters
        int contador=0;
        for(int n=0; n<valors.length; n++){
            if(UtilString.esEnter(args[n])){
                contador++
            }
        }
        return contador;
    }
        
    public static int[] filtraEnters(String[] valors) {  // enters que hi ha a valors
        int num=0;
        for (int num=0; num<numEnters; num++){
            if(UtilString.esEnter(text)){
                num
            }
        }
    }
    
        
    public static int sumaEnters(int[] valors)    {      // suma dels valors
        int num=0;
        
        for (n=0; n)



















