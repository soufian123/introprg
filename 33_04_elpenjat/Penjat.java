




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Penjat {
    public static void main(String[] args) throws IOException {
        
     
     
        String cami = "paraules.txt";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        
     
        int cont =0;
        System.out.println("Comencem a jugar");
        //joc complert
        while (true) {
            int errors=10;
            boolean encertat=false;
            String linia = input.readLine();
            if (null == linia && cont!=0){ 
                System.out.println("No queden més paraules");
                break;
            }else if (null == linia){
                System.out.println("No tinc paraules per jugar");
                break;
            }

            int abandona=0;
            int intents=0;
            String totesLletres="";
            
            
            
            //joc amb la paraula
            while(!encertat){
                int err=0;
                int llargada=linia.length();
                
                
                //assignar les lletres en arrays per poder despres canviarles
                
                char[] separades= new char[llargada];
                for(int a=0; a<linia.length(); a++){
                    separades[a]=linia.charAt(a);
                }
                char[] resultat= new char[llargada];
                for(int a=0; a<linia.length(); a++){
                    resultat[a]='*';
                }
                
                

                
                //imprimeix apartat de paraula    
                System.out.print("Paraula: ");
                for(int a=0; a<llargada; a++){
                    System.out.print( resultat[a]);
                }
                System.out.println();
                
                //iprimeix apartat de Utilitzades
                totesLletres= totesLletres.toUpperCase();
                String utilitzades="";
                if (totesLletres.length()==0){
                    utilitzades="cap";
                }else{
                    
                }
                
                System.out.print("Utilitzades: "+ utilitzades);
                if(totesLletres.length()>2){
                    for(int a=0; a<totesLletres.length()-2; a++){
                        System.out.print(totesLletres.charAt(a)+", ");
                    }
                }
                if (totesLletres.length()>1) {
                    System.out.print(totesLletres.charAt(totesLletres.length()-2)+" i "+totesLletres.charAt(totesLletres.length()-1));
                }else{
                  System.out.print(totesLletres);  
                }
                System.out.println("");
                
                System.out.println("Intents disponibles: "+errors);





                System.out.println("Introdueix una lletra");
                String text = Entrada.readLine();
                //comprovador de si vol sortir
                if (text=="prou"){
                    System.out.println("Vols sortir?");
                    String text2= Entrada.readLine();
                    if (UtilitatsConfirmacio.respostaABoolean(text2)){
                        return;
                    }
                }
                
                
                char lletra = text.charAt(0);
                                //comprovador de si es la mateixa lletra o no
                
                for(int a=0; a<linia.length(); a++){
                    if(resultat[a]=='*'){
                        if (lletra==separades[a]){
                            resultat[a]=lletra;
                            err++;
                        }
                    }
                }
                
                //comprovar si ja sha utilitzar aquella lletra
                boolean si=true;
                for(int a=0; a<totesLletres.length(); a++){
                    if(lletra==totesLletres.charAt(a)){
                        System.out.println("La lletra ja ha estat introduïda");
                        si=true;
                        break;
                    }else{
                        si=false;
                    }
                }
                if(si){
                    continue;
                }
                
                

                
                
                //comprova si vol abandonar la paraula
                if (text=="glups"){
                    abandona++;
                    break;
                }
                
                //guardem les lletres que han introduit
                totesLletres=totesLletres+lletra;
                
                
                
                
                //contador de errores de letras errors
                if(err==0){

                         switch (errors) {
                         case 10: System.out.println("/recursos/figura0.txt");
                                 break;
                         case 9:  System.out.println("/recursos/figura1.txt");
                                 break;
                         case 8:  System.out.println("/recursos/figura2.txt");
                                 break;
                         case 7:  System.out.println("/recursos/figura3.txt");
                                 break;
                         case 6:  System.out.println("/recursos/figura4.txt");
                                 break;
                         case 5:  System.out.println("/recursos/figura5.txt");
                                 break;
                         case 4:  System.out.println("/recursos/figura6.txt");
                                 break;
                         case 3:  System.out.println("/recursos/figura7.txt");
                                 break;
                         case 2:  System.out.println("/recursos/figura8.txt");
                                 break;
                         case 1:  System.out.println("/recursos/figura9.txt");
                                 break;
                         default:  System.out.println("/recursos/figura0.txt");
                                 break;
                         
                         }
                    errors--;
                }
                
                
                //comprovar si han encertat la paraula
                for(int a=0; a<llargada; a++){
                    if (resultat[a]=='*'){
                        encertat=false;
                        break;
                    }else{
                        encertat=true;
                    }
                }
                /*        shauria de preguntar si vol seuir jugant o no     
                
                        els jugadors que han encertat la paraula actual i se'ls ofereix la següent, 
                        si en queden, o es finalitza el joc.
                  */

                //si es fa el maxim derrors suma un abandonat
                if(errors==0){
                    abandona++;
                    break;
                }


            }
            
            
            

        
        }
        if (cont==0){
            System.out.println("Cap entrada");
        }
     }
}
