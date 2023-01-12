//Desenvolupa un programa que demani un text i un nombre enter, i mostri tants caràcters del text com indiqui el nombre enters, començant pel primer. En cas que en faltin, el programa tornarà a mostrar el text a partir del primer caràcter fins que hagi aconseguit tots els caràcters demanats. (modular)
 

public class CadenaContinua{
    public static void main (String[] args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();

        if (!(text.isBlank())){
        
        System.out.println("Nombre?");
            String nombre= Entrada.readLine();
            
            if(UtilString.esEnter(nombre)){
            
                int numero = Integer.parseInt(nombre);
			    String sortida = UtilString.cadenaContinua(text, numero);
			    System.out.println(sortida);
            
            }else{System.out.println("error");}
            
        }else{System.out.println("error");
        }
    }
} 
