
//Desenvolupa un programa que demani texts fins que rebi una cadena buida.


//Cada cop que rebi un text no buit, indicarà si la segona lletra és igual a la penúltima.




public class SegonaIgualPenultima{
    public static void main (String[] args){
        
        System.out.println("Ves introduïnt texts (finalitza amb enter sol)");
        String text= Entrada.readLine();
        
        if (!text.isBlank()){
            while (!text.isBlank()){
                if ((text.length())>=2){
                        if (text.charAt(text.length()-1) == text.charAt(text.length()-2)){
                             System.out.println("Segona igual de penúltima");
                        }else{System.out.println("Segona diferent de penúltima");}
                }else{System.out.println("Segona igual de penúltima");}
                
            text= Entrada.readLine();
            }
        }
        System.out.print("Adéu");
    }
}
