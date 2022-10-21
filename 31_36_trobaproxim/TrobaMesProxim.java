/*
 *
 *A continuació, el programa anirà demanant enters positius fins que s'introdueixi un de negatiu.
 *Finalment, mostrarà el valor enter positiu introduït, més proper a l'àncora.
 *
 *
*/

public class TrobaMesProxim{
    public static void main (String[] args){
    
    
    int ancora;
    int valor;
    int valorDos = (0);
    int valorProxim;
    int resta;
    int restaDos;

    System.out.println("Introdueix l'àncora");
    ancora = Integer.parseInt(Entrada.readLine());
    
    if (ancora>=0){
        System.out.println("Introdueix un valor");
        valor = Integer.parseInt(Entrada.readLine());
            if (valor>=0){
                resta = ((ancora) - (valor));
                valorProxim = (valor);
                        while (ancora>=0 && valor>=0){
                        
                                restaDos = ((ancora) - (valor));
                                            
                                            
                                        if (restaDos>resta){
                                            valorProxim = (valor);
                                            resta = (restaDos);
                                            valorDos=(valor);
                                            
                                        }else if(resta>restaDos){
                                            valorDos=(valor);
                                            
                                         
                                        }else if(resta==restaDos){
                                                    if(valor<valorDos){
                                                    valorProxim = (valor);
                                                    }else{valorProxim = (valorDos);}
                                            }
                                System.out.println("Introdueix un valor");
                                valor = Integer.parseInt(Entrada.readLine());
                        }

                  System.out.println("El valor introduït més pròxim a "+ ancora + " és "+ valorProxim);
           }else{System.out.println("No s'ha introduït cap valor positiu");}
      }else{System.out.println("Àncora no vàlida");}
    }
}
