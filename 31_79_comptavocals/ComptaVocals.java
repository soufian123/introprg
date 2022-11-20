//contador de vocals



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
                    System.out.print(text.charAt(num));
                    contar=contar+1;
                    esVocal="true";
                }
            }
            
            if (esVocal=="false"){
                System.out.print(text.charAt(num));
            }

        }
        
    }
}
