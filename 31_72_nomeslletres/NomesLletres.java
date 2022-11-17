//Desenvolupa un programa que demani un text i mostri només les lletres que conté. Cada lletra apareixerà separada per una coma en l'ordre en que apareixia al text original. La resta de caràcters no es mostraran.







public class NomesLletres{
    public static void main (String[] args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        for(int num=0; num<text.length(); num++){
            if (Character.isLetter(text.charAt(num))==true){
                System.out.print(text.charAt(num)+", ");
            }else if (Character.isLetter(text.charAt(num))){System.out.print(text.charAt(num));
            }
        }
    }
}
        
        
        

