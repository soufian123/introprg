//Desenvolupa un programa que demani un text i un nombre enter, i mostri tants caràcters del text com indiqui el nombre enters, començant pel primer. En cas que en faltin, el programa tornarà a mostrar el text a partir del primer caràcter fins que hagi aconseguit tots els caràcters demanat. (amb moduls)


public class CadenaContinua{
    public static void main (String[] args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();


        if (!(text.isBlank())){
        System.out.println("Nombre?");
            int longitud= Integer.parseInt(Entrada.readLine());

            longitud=longitud-1;
            mostraCadenaContinua(text, longitud);
            
        }else{System.out.println("error");
        }
    }
    
    
    public static void mostraCadenaContinua(String text, int longitud){
        int numero=0;
        if (longitud>=0){
            for(int num=0; num<=longitud; num++){
                
                if (numero<text.length()){
                }else{numero=0;}
                
                System.out.print(text.charAt(numero));
                numero= numero+1;
            }
        }
    }
}  
