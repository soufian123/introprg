
//Desenvolupa un programa que demani texts fins que rebi una cadena buida.


//Cada cop que rebi un text no buit, indicarà si la segona lletra és igual a la penúltima.




public class SegonaIgualPenultima{
    public static void main (String[] args){
        
        System.out.println("Ves introduïnt texts (finalitza amb enter sol)");
        String text= "asd";
        
        if (!text.isBlank()){
            while (!text.isBlank()){
            text= Entrada.readLine();
                if ((text.length())>=2){
                        if (text.charAt(1) == text.charAt(text.length()-2)){
                             System.out.println("Segona igual a penúltima");
                        }else{System.out.println("Segona diferent de penúltima");}
                }else if((text.length())==1){System.out.println("Segona igual a penúltima");
                }else if((text.length())==0){System.out.println("Segona diferent de penúltima");}
                

            }
        }
        System.out.print("Adéu");
    }
}
