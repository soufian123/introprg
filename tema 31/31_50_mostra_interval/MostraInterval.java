//Desenvolupa un programa que demani dos valors enters i mostri tots els enters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.


public class MostraInterval{
    public static void main (String[] args){
    
    
        
        
        System.out.println("inici?");
    int inici =Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
    int finalNum =Integer.parseInt(Entrada.readLine());
    
    if (inici!=finalNum){
            for (int i=inici; i<=finalNum; i++){
                System.out.println(i);
                }
            for(int i=inici; i>=finalNum; i--){
                System.out.println(i);
                }
    }else{int i=inici;
          System.out.println(i);
          }
  }
}
          
