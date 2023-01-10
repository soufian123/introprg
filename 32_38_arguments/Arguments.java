//Es un programa que analitza els arguments que es passen per la línia de comandes i distingeix si són o no enters.


public class Arguments{
    public static void main (String[] args){
        String text="";
        if (args.length==0){
            System.out.println("Cap argument");
            return;
        }
        
        
        for (int num=0; num<args.length; num++){
            text= args[num];
            if(UtilString.esEnter(text)){
                System.out.println("["+ num +"] \"" + args[num] +"\": és enter");
            }else{
                System.out.println("["+ num +"] \"" + args[num] +"\": no és enter");
            }
        }
    }
}
              
/*   
        
        //pasa tot lo de args en un sol text
        String text = "";
        for (int num=0; num<args.length; num++){
            text= text+ args[num];
        }
        //contador d'espais
        int contador=0;
        for(int n=0; n<text.length(); n++){
            if(text.charAt(n)==' '){
                contador++
            }
        }
        //iniciem el array
        int[] numeros;
        numeros = new int[contador];
        
        //assignar cada array un text string
        Streng textArray="";
        int ar=0;
        for(int n=0; n<text.length(); n++){
            if(text.charAt(n)==' '){
                ar++
            }else{
                textArray= text.charAt + text.charAt(n);
            }
        }
*/      
