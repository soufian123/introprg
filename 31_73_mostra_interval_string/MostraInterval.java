//imprimeix les lletres a base del inici y final que l'introdueixis







public class MostraInterval{
    public static void main (String[] args){
    
        System.out.println("text?");
        String text= Entrada.readLine();
        System.out.println("inici?");
        int inici= Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fin= Integer.parseInt(Entrada.readLine());
        
        if (fin<=0){
            fin=text.length()-1;
        }
        if (inici<0){
            inici=0;
        }
        if ((text.length()-1)<inici){
            inici=text.length()-1;
        }
        
        if (fin>text.length()-1){
            fin= text.length()-1;
        }
        
        if(inici<=fin){
        
            for(int num=inici; num<=fin; num++){

                    System.out.println(text.charAt(num));

            }
        
        }else if (fin<inici){
                for(int num=inici; num>=fin; num--){
                    
                        System.out.println(text.charAt(num));
                    
                }
        }
    }
}
        
        
        

