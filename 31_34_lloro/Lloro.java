/*
 *
 *Desenvolupa un programa que vagi demanant paraules i 
 *les repeteixi fins que rebi una resposta en blanc o bé buida. 
 *És a dir, la resposta sigui un return directament o bé només espais.
 *
*/

public class Lloro {
    public static void main(String[] args) {
    
        System.out.println("El lloro espera paraula:");
        String paraula = Entrada.readLine();
        boolean empty=paraula.isEmpty();
		boolean blank=paraula.isBlank();
        while (paraula) {
               if (paraula.isEmpty()||paraula.isBlank()) {
               System.out.println("Adéu");
               }else{
               System.out.println("El lloro repeteix: "+ paraula);
               System.out.println("El lloro espera paraula:");
               paraula = Entrada.readLine();}
        
        }
    }
}
