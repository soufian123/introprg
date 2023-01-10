//Desenvolupa un programa que a partir dels arguments que rebi per línia de comandes, mostri el resultat de sumar els enters que rebi.



public class SumaEnters{
    public static void main (String[] args){
        String text="";
        if (args.length==0){
            System.out.println("0");
            return;
        }
        
        int contador  =quantsEnters(args);
        
        if (contador==0){
            System.out.println("0");
            return;
        }
        
        System.out.println(sumaEnters(filtraEnters(args)));
  
    }


    public static int quantsEnters(String[] valors) {    // nombre d'enters a valors
        //contador d'enters
        int contador=0;
        for(int n=0; n<valors.length; n++){
            if(UtilString.esEnter(valors[n])){
                contador++;
            }
        }
        return contador;
    }
        
    public static int[] filtraEnters(String[] valors) {  // enters que hi ha a valors
        int valor[]=new int[quantsEnters(valors)];
		int num=0;
		for(int v=0;v<valors.length;v++) {
			if (UtilString.esEnter(valors[v])) {
				valor[num] = Integer.parseInt(valors[v]);
				num++;
			}
		}
		return valor;
	}
    
        
    public static int sumaEnters(int[] valors)    {      // suma dels valors
        int suma=0;
		for(int i=0;i<valors.length;i++) {
			suma =valors[i] + suma;
		}
		return suma;
	}



}



