//Desenvolupa un programa que demani un text i compti quantes vocals conté.



public class ComptaVocals{
    public static void main (String[] args){
        
        String vocals= "aeiouAEIOUáéíúóàèìùòäëïöüÁÉÍÚÓÀÈÌÙÒÄËÏÖÜ"; 
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        int contar=0;
        String esVocal= "false";
        for(int num=0; num<text.length(); num++){
            esVocal="false";
            for (int v=0; v<vocals.length(); v++){
                if(text.charAt(num)==vocals.charAt(v)){

                    contar=contar+1;
                    esVocal="true";
                }
            }

        }
        System.out.print(contar);
        
    }
}
