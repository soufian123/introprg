//Desenvolupa un programa que vagi demanant texts fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit.





public class ConteDarrer{
    public static void main (String[] args){
    
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text= Entrada.readLine();
        String comprovar="true";
        char ultim='a';
        while (!(text.isBlank() || text.isEmpty())){
            if (!(text.isBlank() || text.isEmpty())){
                for(int num=0; num<=(text.length()-1); num++){
                    if((text.charAt(num)==Character.toUpperCase(ultim)) || (text.charAt(num)==Character.toLowerCase(ultim)) ) {
                        comprovar="true";
                    }

                }
                if (comprovar=="true"){
                    System.out.println("bé");
                
                }else{
                break;
                
                }
            }    
            ultim= (text.charAt(text.length()-1));
            text= Entrada.readLine();
            comprovar="false";
            }
        System.out.println("Adéu");
        
    }
}                

