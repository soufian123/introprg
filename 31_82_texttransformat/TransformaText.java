//El text transformat

/*
    les vocals (les catalanes) apareixeran en minúscules

    les lletres no vocals apareixeran en majúscules

    els nombres (atenció, no els dígits!) apareixeran entre parèntesis ()

    la resta de caràcters, excepte els blancs, desapareixen a la versió transformada

*/


public class TransformaText{
    public static void main (String[] args){
        
        String vocals= "àèòéíóúüï";
        String accents= "false";
        
        
        String vocal= "aeiou";
        System.out.println("Text?");
        String text= Entrada.readLine();
        String esVocal="false";
        text= text.toLowerCase();
        
        
        for(int num=0; num<text.length(); num++){
            
            
            esVocal="false";
            accents= "false";
            //vocals
            for (int v=0; v<vocal.length(); v++){
            
                if(text.charAt(num)==vocals.charAt(v)){
                    System.out.print(text.charAt(num));
                    esVocal="true";
                    break;
                }
            }            
            //accents
            for (int v=0; v<vocals.length(); v++){
            
                if(text.charAt(num)==vocals.charAt(v)){
                    System.out.print(Character.toUpperCase(text.charAt(num)));
                    esVocal="true";
                    break;
                }
            }
            //nombre
            if (Character.isDigit(text.charAt(num))){
                System.out.print("(");   
                    for(int n=num; n<vocal.length(); n++){
                        if(Character.isDigit(text.charAt(num))){
                            System.out.print(text.charAt(n));
                            num=n;
                        }
                    }  
                System.out.print(")");
            }
            
            
            
            if (esVocal=="false"){
                System.out.print(Character.toUpperCase(text.charAt(num)));
            }

        }
        
    }
}
