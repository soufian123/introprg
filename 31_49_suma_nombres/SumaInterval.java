
//En aquest exercici demanaràs dos valors enters i sumaràs tots els nombres que hi hagin entre el més petit i el més gran d'ells.





public class SumaInterval{
    public static void main (String[] args){
    
        System.out.println("inici?");
    int inici =Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
    int finalNum =Integer.parseInt(Entrada.readLine());

    int numero = 0;
        if (inici!=finalNum){
        
                for (int i= inici; i <= finalNum; ++i ){
                numero= numero + i;
                }
                for (int i= inici; i >= finalNum; --i ){
                numero= numero + i;
                }
          }else{numero=inici;}
        System.out.println(numero);
    }
}
