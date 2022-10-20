/*
 *
 *Desenvolupa un programa que vagi demanant enters 
 *positius i que, en el moment que rebi un de negatiu, 
 *mostri el valor màxim positiu introduït i finalitzi l'execució.
 *
 *
 *
*/

public class TrobaMaxim{
    public static void main (String[] args){
    
    
    int valor;

    int valorMaxim;

    System.out.println("Introdueix un valor");
    valor = Integer.parseInt(Entrada.readLine());
    valorMaxim= (valor);
    while (valor>=0){
            
            if (valor>valorMaxim){
                valorMaxim = (valor);
            }else{ 
                valorMaxim = (valorMaxim);
            }
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());

            }
            
      
      System.out.println("El màxim és "+ valorMaxim);
    }
}
            
