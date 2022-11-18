/*
 l`' Exercici 31_39. Endevina el nombre
 
    permetrà cancel·lar la partida en introduir una entrada buida (tal i com demanava Exercici 31_40. Endevina amb cancel·lació

    comprovarà que l'entrada siguin realment valors enters (com a Exercici 31_75. És enter)
*/





public class Endevina{
    public static void main (String[] args){
    

    int valor = (0);
    int valorPensat = (42);
    
    
    System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
    System.out.println("Introdueix un valor");
    valor = Integer.parseInt(Entrada.readLine());
    
    while (valor!=valorPensat) {
            
            if(valor>=101){
                System.out.println("Com a màxim 100");
            
            }else if(valor<=0){
                System.out.println("Com a mínim 1");
            
            }else if (valor<valorPensat){
                System.out.println("És més gran que "+ valor);
            
            }else if (valor>valorPensat){
                System.out.println("És més petit que "+ valor);}
            
            
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
    }
    
        System.out.println("Has encertat!");
    }
}





