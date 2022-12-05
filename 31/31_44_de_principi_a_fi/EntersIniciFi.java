//un programa que demani tres nombres enters, i escrigui els valors entre el primer i el segon saltant d'un al següent amb el tercer.


public class EntersIniciFi{
    public static void main (String[] args) {
    
    
        int inicial;
        int finalNumero;
        int salt;
        int numero;
        
        
        System.out.println("Valor inicial?");
        inicial = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor final?");
        finalNumero = Integer.parseInt(Entrada.readLine());
        System.out.println("Salt?");
        salt = Integer.parseInt(Entrada.readLine());
        numero = inicial;
        
        while (numero<=finalNumero){
        
                System.out.println(numero);
                numero = numero + salt;

        }
    }
}
        
