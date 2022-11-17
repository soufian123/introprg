

//Analísis d'un caràcter a un String







public class AnalitzaCaracter{
    public static void main (String[] args){
    
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        System.out.println("Posició?");
        int posicio= Integer.parseInt(Entrada.readLine());


        if((posicio>=0 && posicio <=(text.length()-1)) || ( posicio<=0 && posicio <=(-(text.length()-1)))){
        
        if (posicio<0){
            posicio= (text.length())+posicio;
            }
            
            
            if (Character.isLetter(text.charAt(posicio))){
                 System.out.println("\'"+text.charAt(posicio)+"\' és una lletra");
                 
            }else if (Character.isDigit(text.charAt(posicio))){
                    System.out.println("\'"+text.charAt(posicio)+"\' és un nombre");
                    
                }else{
                    System.out.println("\'"+text.charAt(posicio)+"\' és una altra cosa");
                }
     
        }else{
            System.out.println("Fora de rang");
        }
    
    }
}
