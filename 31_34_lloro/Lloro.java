/*
 *
 *Desenvolupa un programa que vagi demanant paraules i 
 *les repeteixi fins que rebi una resposta en blanc o bé buida. 
 *És a dir, la resposta sigui un return directament o bé només espais.
 *
*/

public class Lloro {
    public static void main(String[] args) {
    

        String paraula = Entrada.readLine();
        while (!paraula.equals(" ")) {
               System.out.println(" "+ paraula);
                paraula = Entrada.readLine();}
        
        System.out.println("Adéu");
    }
}
