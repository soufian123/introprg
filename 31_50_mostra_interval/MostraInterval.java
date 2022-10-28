//Desenvolupa un programa que demani dos valors enters i mostri tots els enters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.


public class MostraInterval{
    public static void main (String[] args){
    
    
        
        
        System.out.println("inici?");
    int inici =Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
    int finalNum =Integer.parseInt(Entrada.readLine());

    int numero = 0;
    
    
    if (inici!=finalNum){
            for (int i=inici; i<=finalNum; i++){
                numero = numero + i;
                System.out.println(numero);
                }
            for(int i=inici; i>=finalNum; i--){
            System.out.println(numero);
                numero = numero + i;
                System.out.println(numero);
                }
    }else{numero=numero;
          System.out.println(numero);
          }
  }
}
          
