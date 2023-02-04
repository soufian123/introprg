




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Penjat {
    public static void main(String[] args) throws IOException {
     
        String cami = "paraules.txt";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
     
        int cont =0;
        int contadorEncertades=0;
        int contadorFallades=0;
        int abandona=0;
        int intents=0;
        int cancel=0;
        System.out.println("Comencem a jugar");

        //joc complert
        while (true) {
            String totesLletres="";
            
            int errors=10;
            boolean encertat=false;
            String linia = input.readLine();
            if (null == linia && cont!=0){ 
                System.out.println("No queden més paraules");
                System.out.println("Paraules jugades: "+ cont);
                System.out.println("Paraules encertades: "+ contadorEncertades);
                System.out.println("Paraules fallades: "+ contadorFallades);
                System.out.println("Paraules cancel·lades: "+ abandona);
                System.out.println("Espero que t'hagis divertit");
                break;
            }else if (null == linia){
                System.out.println("No tinc paraules per jugar");
                break;
            }

            cont++;
            
            
            //assignar les lletres en arrays per poder despres canviarles
                
                char[] separades= new char[linia.length()];
                for(int a=0; a<linia.length(); a++){
                    separades[a]=linia.charAt(a);
                }
                char[] resultat= new char[linia.length()];
                for(int a=0; a<linia.length(); a++){
                    resultat[a]='*';
                }
            
            //joc amb la paraula
            while(!encertat){
                int err=0;
                int llargada=linia.length();
                
                
                
                
                

                
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
                String comprovar= text.toLowerCase();
                if (comprovar.equals("prou")){
                    System.out.println("Vols finalitzar?");
                    text= Entrada.readLine();
                    comprovar= text.toLowerCase();
                    if (UtilitatsConfirmacio.respostaABoolean(comprovar)){
                        abandona++;
                        System.out.println("Paraules jugades: "+ cont);
                        System.out.println("Paraules encertades: "+ contadorEncertades);
                        System.out.println("Paraules fallades: "+ contadorFallades);
                        System.out.println("Paraules cancel·lades: "+ abandona);
                        System.out.println("Espero que t'hagis divertit");
                        return;
                    }
                }
                
                //comprova si vol abandonar la paraula
                if (text.equals("glups")){
                    abandona++;
                    break;
                }
                if(text.length() != 1){
                    System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
                    continue;

                }
                
                char lletra = text.charAt(0);
                lletra= Character.toLowerCase(lletra);
                
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
                boolean si=false;
                String lletraComprovar=totesLletres.toLowerCase();
                for(int a=0; a<lletraComprovar.length(); a++){
                    if(lletra==lletraComprovar.charAt(a)){
                        System.out.println("La lletra ja ha estat utilitzada");
                        si=true;
                        break;
                    }
                }
                if(si){
                   continue;
                }
                totesLletres = totesLletres + lletra;

                

                
                //contador de errores de letras errors
                if(err==0){

                         switch (errors) {
                         case 10: Mostrat("recursos/figura0.txt");
                                 break;
                         case 9:  Mostrat("recursos/figura1.txt");
                                 break;
                         case 8:  Mostrat("recursos/figura2.txt");
                                 break;
                         case 7:  Mostrat("recursos/figura3.txt");
                                 break;
                         case 6:  Mostrat("recursos/figura4.txt");
                                 break;
                         case 5:  Mostrat("recursos/figura5.txt");
                                 break;
                         case 4:  Mostrat("recursos/figura6.txt");
                                 break;
                         case 3:  Mostrat("recursos/figura7.txt");
                                 break;
                         case 2:  Mostrat("recursos/figura8.txt");
                                 break;
                         case 1: Mostrat("recursos/figura9.txt");
                                 System.out.println("Has mort");
                                 break;
                         default: Mostrat("recursos/figura0.txt");
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
                   // abandona++;
                    contadorFallades++;
                    
                    break;
                }


            }
            if(encertat){
                System.out.println("Has encertat! La paraula era " + linia);	
                contadorEncertades++;
                encertat=false;
            }
        
        }

        if (cont==0){
            System.out.println("Cap entrada");
        }
     }


    public static void Mostrat(String imprimir) throws IOException {
        String cami = imprimir;
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            System.out.println(linia);
        }
        input.close();
    }
}


/*
System.out.println("Paraules jugades: "+ cont);
System.out.println("Paraules encertades: "+ contadorEncertades);
System.out.println("Paraules fallades: "+ contadorFallades);
System.out.println("Paraules cancel·lades: "+ abandona);
System.out.println("Espero que t'hagis divertit");


*/



