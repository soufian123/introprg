//Desenvolupa un programa que demani un text i mostri només les lletres que conté. Cada lletra apareixerà separada per una coma en l'ordre en que apareixia al text original. La resta de caràcters no es mostraran.







public class NomesLletres{
    public static void main (String[] args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        
        int fin=0;
        for(int num=text.length()-1; num>=0; num--){
            if (Character.isLetter(text.charAt(num))){
                fin=num;
                num=0;
            }
        }
        
        
        for(int num=0; num<fin; num++){
            if (Character.isLetter(text.charAt(num))){
                System.out.print(text.charAt(num)+", ");
            }
        }
        System.out.print(text.charAt(fin));
    }
}
        
        
        

