
/*
 *
 *aquest programa demana quants fills tenen els usuaris i respon segons el nombre de fills sigui.
 *
 */


public class Fills {
    public static void main(String[] args) {



        int valor;

        System.out.println("Quants fills tens?");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor <= 0) {
        System.out.println("No pots tenir menys de 0 fills!"); 
        
        }else if (valor == 1) {
              System.out.println("Compte de no mimar-lo massa!"); 
             }else if (valor == 0) {
             System.out.println("Tot el que t'has estalviat en bolquers!"); 
                    }else if (valor<5 && valor>1) {
                          System.out.println("No t'avorreixes a casa, eh?");
                          }else if (valor>4) {
                                System.out.println("Tu sí fas país!");

        }


    }
}
