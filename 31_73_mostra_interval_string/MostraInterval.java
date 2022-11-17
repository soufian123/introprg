//imprimeix les lletres a base del inici y final que l'introdueixis







public class MostraInterval{
    public static void main (String[] args){
    
        System.out.println("text?");
        String text= Entrada.readLine();
        System.out.println("inici?");
        int inici= Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fin= Integer.parseInt(Entrada.readLine());
        
        if(inici<=fin){
        
            for(int num=inici; num<=fin; num++){
                if (Character.isLetter(text.charAt(num))){
                    System.out.println(text.charAt(num));
                }
            }
        
        }else{
                for(int num=fin; num>=inici; num--){
                    
                        System.out.println(text.charAt(num));
                    
                }
        }
    }
}
        
        
        

