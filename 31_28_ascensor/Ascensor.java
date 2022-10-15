/*
 *
 *aquest programa et demana en quina planta estas i 
 *
 */


public class SumaPositius {
    public static void main(String[] args) {


        String pis;


        String valor;

        System.out.println("pis?");
        pis = Entrada.readLine();
        System.out.println("botó?");
        valor = Entrada.readLine();
        
        if (pis= "planta baixa" && valor= "pujar un") {
        System.out.println("primer pis");
        
        }else if (pis= "planta baixa" && valor= "pujar dos") {
              System.out.println("segon pis");
        
                }else if (pis= "primer pis" && valor= "pujar un") {
                        System.out.println("segon pis");
        
                      }else if (pis= "primer pis" && valor= "baixa un") {
                            System.out.println("planta baixa");
                        
                            }else if (pis= "segon pis" && valor= "baixar un") {
                                  System.out.println("primer pis");
                        
                                  }else if (pis= "segon pis" && valor= "baixar dos") {
                                        System.out.println("planta baixa");

                                        }else {System.out.println("error");
                        }

    }
}
