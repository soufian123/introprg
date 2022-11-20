/*
 l`' Exercici 31_39. Endevina el nombre
 
    permetrà cancel·lar la partida en introduir una entrada buida (tal i com demanava Exercici 31_40. Endevina amb cancel·lació

    comprovarà que l'entrada siguin realment valors enters (com a Exercici 31_75. És enter)
*/





public class Endevina{
    public static void main (String[] args){
    

        int valor = (0);
        int valorPensat = (42);
        
        System.out.println("Nombre?");
        String text=Entrada.readLine();
        String verificacio="false";
        
        while (!text.isEmpty() || !text.isBlank() || valor!=valorPensat) {
            for( int num=0; num<=text.length()-1; num++){
                if (text.charAt(0)=='-' || text.charAt(0)=='+'){
                    if (num>0){
                        if (!Character.isDigit(text.charAt(num))){
                            verificacio="true";
                            break;
                        }    
                    }
                    if (0==(text.length()-1)) {
                        verificacio="true";
                    }
                }else if (!Character.isDigit(text.charAt(num))){
                        verificacio="true";
                        break;
                    }    
                }
                
            if (verificacio=="true"){
                System.out.println("Només nombres");
            }else if (verificacio=="false"){        
                valor = Integer.parseInt(text);
                if(valor==valorPensat){
                    System.out.println("Encertat!");
                    return;
                    
                }else if(valor>=101 || valor<=0){
                    System.out.println("Fora de rang");
                
                }else if (valor<valorPensat){
                    System.out.println("Massa petit");
                
                }else if (valor>valorPensat){
                    System.out.println("Massa gran");
                }
                }
                System.out.println("Nombre?");
                text=Entrada.readLine();
                verificacio="false";
                if (text.isEmpty() || text.isBlank()){
                    break;
            }
        }
        
            if (text.isEmpty() || text.isBlank()){
                System.out.println("Cancel·lat!");
            }
            if(valor==valorPensat){
                System.out.println("Encertat!");
            }
    }
}





