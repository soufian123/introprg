
//Desenvolupa un programa que demani tres nombres enters, i escrigui els valors entre el primer i el segon saltant d'un al següent amb el tercer.




public class EntersIniciFi{
    public static void main(String[] args){
    
        
        System.out.println("Valor inicial?");
        int inicial = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor final?");
        int finalNum = Integer.parseInt(Entrada.readLine());
        System.out.println("salt?");
        int salt = Integer.parseInt(Entrada.readLine());
        
            for (int numero = inicial; numero<=finalNum; numero = numero + salt){
                    System.out.println(numero);
            }
    }
}
        

