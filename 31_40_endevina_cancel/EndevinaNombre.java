

//En aquesta ocasió desenvoluparem un programa que es pensarà un nombre enter entre el 1 i el 100, i reptarà els usuaris a que l'endevini.

//Per simplicitat, el nombre pensat serà sempre el 42.

//El programa demanarà que li diguin un nombre, el compararà amb el pensat i indicarà si ha encertat, s'ha passat o no ha arribat, o si està fora de rang.

//El programa finalitzarà quan els usuaris encertin el nombre pensat o Quan els usuaris entrin la cadena buida, el programa respondrà amb el missatge "Cancel·lat!" i finalitzarà..



public class EndevinaNombre {
public static void main (String[] args) {


    int valor = (0);
    int valorPensat = (42);
    String text = ("asd");
    
    System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
    System.out.println("Introdueix un valor");
    text = Entrada.readLine();
    valor = Integer.parseInt(text);
    while (!text.isBlank() && valor!=valorPensat) {
    
       
            
            if(valor>=101){
                System.out.println("Com a màxim 100");
            
            }else if(valor<=0){
                System.out.println("Com a mínim 1");
            
            }else if (valor<valorPensat){
                System.out.println("És més gran que "+ valor);
            
            }else if (valor>valorPensat){
                System.out.println("És més petit que "+ valor);}
            
            
            System.out.println("Introdueix un valor");
            text = Entrada.readLine();
            valor = Integer.parseInt(text);
    }
    
        if  (valor==valorPensat ) { 
         
           System.out.println("Has encertat!");
           }else{
           System.out.println("Cancel·lat!");
          }
    
    
    }
}
