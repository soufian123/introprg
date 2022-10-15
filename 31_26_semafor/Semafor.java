/*aquest programa es una guia de semafors
*El programa demanarà de quin color està el semàfor i segons la resposta recomanarà 
*respectivament 'espera', passa, o corre! (sí, no és un assistent massa responsable).
*/

        public class Semafor {
            public static void main(String[] args) {
            
            System.out.println("Color?");
            String color = Entrada.readLine();
            
            if (color.equals("groc")) {
             System.out.println("corre!");
             } else if (color.equals("vermell")) {
                    System.out.println("espera!");
                   } else if (color.equals("verd")) {
                         System.out.println("passa!");
                        }
    }
}
                             
