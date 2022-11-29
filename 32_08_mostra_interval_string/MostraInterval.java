
//imprimeix les lletres a base del inici y final que l'introdueixis amb moduls







public class MostraInterval{
    public static void main (String[] args){
    
        System.out.println("text?");
        String text= Entrada.readLine();
        System.out.println("inici?");
        int inici= Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fi= Integer.parseInt(Entrada.readLine());
        
        mostraInterval(text, inici, fi);
    }
        public static void mostraInterval(String text, int inici, int fi){
            if (fi<0 && inici<0 && fi<inici){
                fi=-fi+inici-1;
                inici=0;
            }
            if (fi<0 && inici<0 && fi>inici){
                fi=-inici+fi-1;
                inici=0;
            }
            if (inici<0){
                inici=0;
            }
            if (fi<0){
                fi=-fi-2;
            }
            if ((text.length()-1)<inici){
                inici=text.length()-1;
            }
            
            if (fi>text.length()-1){
                fi= text.length()-1;
            }
            
            if(inici<=fi){
            
                for(int num=inici; num<=fi; num++){

                        System.out.println(text.charAt(num));

                }
            
            }else if (fi<inici){
                    for(int num=inici; num>=fi; num--){
                        
                            System.out.println(text.charAt(num));
                        
                    }
            }
        }
}
   
