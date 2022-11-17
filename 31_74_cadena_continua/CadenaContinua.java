//Desenvolupa un programa que demani un text i un nombre enter, i mostri tants caràcters del text com indiqui el nombre enters, començant pel primer. En cas que en faltin, el programa tornarà a mostrar el text a partir del primer caràcter fins que hagi aconseguit tots els caràcters demanats.


public class CadenaContinua{
    public static void main (String[] args){
    
        System.out.println("text?");
        String text= Entrada.readLine();
        System.out.println("Nombre?");
        String nombres= Entrada.readLine();

        if (!(text.isBlank()  || nombres.isBlank() || text.isEmpty()  || nombres.isEmpty())){
            int nombre= Integer.parseInt(nombres);
            int numero=0;
            nombre=nombre+0;
            if (nombre>0){
                for(int num=0; num<=nombre; num++){
                    
                    if (numero<text.length()){
                    }else{numero=0;}
                    
                    System.out.print(text.charAt(numero));
                    numero= numero+1;
                }
            }
        }System.out.println("error");
    }
}                
