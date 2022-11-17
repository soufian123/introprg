//imprimeix les lletres a base del inici y final que l'introdueixis







public class MostraInterval{
    public static void main (String[] args){
    
        System.out.println("text?");
        String text= Entrada.readLine();
        System.out.println("inici?");
        int inici= Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fin= Integer.parseInt(Entrada.readLine());
        
        
        
        for(int num=inici; num<fin; num++){
            if (Character.isLetter(text.charAt(num))){
                System.out.print(text.charAt(num));
            }
        }
    }
}
        
        
        

