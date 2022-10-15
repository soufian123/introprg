/*
 *
 *aquest programa et demana en quina planta estas i 
 *
 */


public class Ascensor {
    public static void main(String[] args) {


        String pis;


        String valor;

        System.out.println("pis?");
        pis = Entrada.readLine();
        System.out.println("botó?");
        valor = Entrada.readLine();
        
        if (pis.equals("planta baixa") && valor.equals("pujar un")) {
        System.out.println("primer pis");
        
        }else if (pis.equals("planta baixa") && valor.equals("pujar dos")) {
              System.out.println("segon pis");
        
                }else if (pis.equals("primer pis") && valor.equals("pujar un")) {
                        System.out.println("segon pis");
        
                      }else if (pis.equals("primer pis") && valor.equals("baixa un")) {
                            System.out.println("planta baixa");
                        
                            }else if (pis.equals("segon pis") && valor.equals("baixar un")) {
                                  System.out.println("primer pis");
                        
                                  }else if (pis.equals("segon pis") && valor.equals("baixar dos")) {
                                        System.out.println("planta baixa");

                                        }else {System.out.println("error");
                        }

    }
}
