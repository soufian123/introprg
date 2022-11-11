/*
 * Programa que demostra diferents manipulacions amb Strings
 */
public class ManipulaString {
    public static void main(String[] args){
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();

        // Mostra la longitud de la paraula (quantes lletres conté)
        System.out.println("La longitud és " + paraula.length());

        // Mostra la segona lletra de la paraula
        System.out.println("La segona lletra és '" +paraula.charAt(1)+"'");


        // int ultima = (paraula.length()-1)
        // Mostra la darrera lletra de la paraula
        System.out.println("La darrera lletra és '"+paraula.charAt(paraula.length()-1)+"'");

        // int penultima = (paraula.length()-2)
        // Mostra la penúltima lletra de la paraula
        System.out.println("La penúltima lletra és '"+paraula.charAt(paraula.length()-2)+"'");


        //boolean majuscula= paraula.isUpperCase()
        // Mostra la paraula amb totes les lletres en majúscules
        System.out.print("La paraula en majúscules és \"");
        for (int num=0; num<(paraula.length()); num++){
            char lletra = paraula.charAt(num);
            char toUpperCase=Character.toUpperCase(lletra);
            System.out.print(toUpperCase);
                        /*boolean majuscula= paraula.isUpperCase(lletra)
                            if (majuscula=true){
                                System.out.print(lletra);
                        */    
        }   
        
        System.out.println("\"");


        // Una composició formada per la primera lletra de la paraula en
        // majúscules, seguida de les següents tres lletres en minúscules. Per
        // exemple, si la paraula és «nEkAnE», resultatà en «Neka».

        System.out.print("La composició de quatre primeres és \""+Character.toUpperCase(paraula.charAt(0)));
      
     
        for (int num=1; num<4; num++){

            char toLowerCase=Character.toLowerCase(paraula.charAt(num));
            System.out.print(toLowerCase);
                   
        }
      System.out.println("\"");
                                                                               /* for (int num=0; num<(paraula.length()); numero++){
                                                                                    char lletra = text.charAt(num);
                                                                                    boolean majuscula= paraula.isUpperCase(lletra)
                                                                                        if (majuscula=true){
                                                                                            System.out.print(lletra);
                                                                                            num=paraula.length();
                                                                                        
                                                                                        
                                                                                        }   
                                                                                }
                                                                                */

        
        
        
        
        
        
        
        // Mostra una composició formada per la darrera lletra de la paraula,
        // seguida de les tres primeres. (ex. si la paraula és «Nekane»
        // mostrarà «aNek»)
        
        System.out.print("La composició de quatre és \""+ paraula.charAt(paraula.length()-1));
            System.out.print(Character.toUpperCase(paraula.charAt(0)));
        for (int numero=1; numero<=2; numero++){
            System.out.print(paraula.charAt(numero));
        }
        
        System.out.println("\"");












        // Com en el cas anterior però ara corregint les majúscules i
        // minúscules de manera que la primera sigui majúscules i la resta en
        // minúscules.  (ex. si la paraula és «Nekane» mostrarà «Enek»)
        System.out.print("La composició de quatre corregint majúscules és \""+Character.toUpperCase(paraula.charAt(paraula.length()-1)));
        for (int numero=0; numero<=2; numero++){
            System.out.print(paraula.charAt(numero));
        }
        
        System.out.println("\"");
        
    }
}

