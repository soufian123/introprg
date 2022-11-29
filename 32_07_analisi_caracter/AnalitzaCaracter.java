


//Analísis d'un caràcter a un String amb moduls




public class AnalitzaCaracter{
    public static void main (String[] args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();
        System.out.println("Posició?");
        int posicio= Integer.parseInt(Entrada.readLine());
        char lletra= text.charAt(posicio);
        
        if(( posicio<=0 && -posicio<(text.length())) || (posicio>=0 && posicio <text.length())){
        
            if (posicio<0){
                posicio= (text.length())+posicio;
                }
                analitzaCaracter(lletra);
        }else{
            System.out.println("Fora de rang");
        }
    }
    
    
    public static void analitzaCaracter(char lletra){


        if (Character.isLetter(lletra)){
             System.out.println("\'"+lletra+"\' és una lletra");
             
        }else if (Character.isDigit(lletra)){
                System.out.println("\'"+lletra+"\' és un nombre");
                
        }else{
            System.out.println("\'"+lletra+"\' és una altra cosa");
        }
   
    }
}
