

//Analísis d'un caràcter a un String







public class AnalitzaCaracter{
    public static void main (String[] args){
    
        System.out.println("Introduïu una matrícula");
        String text= Entrada.readLine();
        
        System.out.println("Posició?");
        int posicio= Integer.parseInt(Entrada.readLine());
        String numero="false";
        
        if(posicio <=(text.length()-1) || -posicio <=(text.length()-1)){
            
            if (Character.isLetter(text.charAt(posicio))==true){
                 System.out.println("\'"+text.charAt(posicio)+"\' és una lletra");
            }else{
                for(int num=0; num<=9; num++){
                    if(text.charAt(posicio)==num){
                        numero="true";
                    }
                }
                if (numero=="true"){
                    System.out.println("\'"+text.charAt(posicio)+"\' és un nombre");
                }else{System.out.println("\'"+text.charAt(posicio)+"\' és una altra cosa");
                }
            }
     
        }else{
            System.out.println("Fora de rang");
        }
    
    }
}
