//El text transformat

/*
    les vocals (les catalanes) apareixeran en minúscules

    les lletres no vocals apareixeran en majúscules

    els nombres (atenció, no els dígits!) apareixeran entre parèntesis ()

    la resta de caràcters, excepte els blancs, desapareixen a la versió transformada

*/


public class TransformaText{
    public static void main (String[] args){
        
        String vocals= "ÀÈÒÉÍÓÚÜÏàèòéíóúüï";
        String accents= "false";
        
        
        String vocal= "aeiouAEIOU";
        System.out.println("Text?");
        String text= Entrada.readLine();
        String esVocal="false";
        text= text.toLowerCase();

        
        for(int num=0; num<text.length(); num++){
            
            //nombre
            if (Character.isDigit(text.charAt(num))){           //num=0
                if (num==0){
                System.out.print("("+text.charAt(num));
                }
                if(num==text.length()-1){
                System.out.print(text.charAt(num)+")");
                }
                
                if (num>0 && num<text.length()-1){
                
                
                    if (Character.isDigit(text.charAt(num-1))){
                        System.out.print(text.charAt(num));
                        
                    }else{
                        System.out.print("("+text.charAt(num)); 
                    }
                 

                    if (Character.isDigit(text.charAt(num+1))){
                    System.out.print(text.charAt(num));
                    }else{
                        System.out.print(text.charAt(num)+")"); 
                    } 
                } 
                

            }
            
            esVocal="false";
            accents= "false";
            //vocals
            for (int v=0; v<vocal.length(); v++){
            
                if(text.charAt(num)==vocal.charAt(v)){
                    System.out.print(Character.toLowerCase(text.charAt(num)));
                    esVocal="true";
                    break;
                }
            }            
            //accents
            for (int v=0; v<vocals.length(); v++){
            
                if(text.charAt(num)==vocals.charAt(v)){
                    System.out.print(Character.toLowerCase(text.charAt(num)));
                    accents="true";
                    break;
                }
            }
            
            
            
            if (esVocal=="false" && accents=="false" && Character.isLetter(text.charAt(num))){
                System.out.print(Character.toUpperCase(text.charAt(num)));
            }
            if (Character.isWhitespace(text.charAt(num))){
                System.out.print(text.charAt(num));
            }
        }
        
    }
}
