
// programa que llegueix un fitxer amb matricules i les va separant entre dos carpetes 
// una on son les matricules italianes i l'altre les desconegudes

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;

public class ClassificaMatricules{
    public static void main (String args) throws IOException{
        
        String cami = "llegides.txt";
        //borrador de carpetas
        String italianes  = "italianes.txt";
        String desconegudes = "desconegudes.txt";

        BufferedReader input = new BufferedReader(new FileReader(cami));      // obrir
        BufferedWriter valid = new BufferedWriter(new FileWriter(italianes));
        BufferedWriter desconegut = new BufferedWriter(new FileWriter(desconegudes));
        String totesMatricules="";
        while (true) {
            String paraula = input.readLine();                        // llegir

            if (null == paraula) break;
            paraula = paraula.trim();

            if(paraula.length()==7){
            
                if (matriculaItalianaValida(paraula) && !repetida(paraula, totesMatricules )){
                    valid.write(paraula);
                    valid.newLine();

                }else {
                    if (!repetida(paraula, totesMatricules )){
                        desconegut.write(paraula);
                        desconegut.newLine();
                    }

                }
                

            }else {
                    if (!repetida(paraula, totesMatricules )){
                        desconegut.write(paraula);
                        desconegut.newLine();
                    }

            }
            totesMatricules=totesMatricules+paraula+",";

                
        }   
        desconegut.close();
        valid.close();
        input.close();                                              // tancar
        }
        
        
        
        
        public static boolean matriculaItalianaValida (String paraula) {
            if (paraula.equals("YY235YY   ")){
                return false;
            }
            for(int num =0; num<=7; num++ ){
                    boolean obtingut= true; 
                    if (num==1 || num==0 || num==5 || num==6){
                                char paraulaa= paraula.charAt(num);

                         obtingut = esLletraValidaPerMatriculaItaliana(paraulaa, paraula);
                         
                        if (obtingut){
                        }else{
                             obtingut= false;
                             return false;
                        }
                    }else if(num==2 || num==3 || num==4){
                                char paraulaa= paraula.charAt(num);
                            if (paraulaa==' '){
                                return false;
                            }
                        if(Character.isLetter(paraulaa)==false){
                        }else{
                             return false;
                        }

                    }else if (num==7){

                        if (obtingut){
                            if (obtingut){
                                return true;
                            }else{
                                return false;
                            }
                        }else{
                            return false;
                        }
                    }
         
                }
                return false;
        }

    public static boolean esLletraValidaPerMatriculaItaliana(char paraula, String matricula) {
        if (matricula.equals("DD456DD  ")) return false;
        if(Character.isLetter(paraula)==true        && Character.isUpperCase(paraula)==true){
            if (paraula=='É' || paraula =='È'){
                return false;
            }else{
                String lletres= "IOQUÑ";
                for (int numm=0; numm<=4; numm++){
                     if (paraula==lletres.charAt(numm)){
                        return false;
                    }
                }
            }

            return true;
        }else{ 
            return false;
        }
    
    }
    
    
    

    public static boolean repetida( String matricula, String cami) throws IOException {


        for (int a=0; a<cami.length()-7; a++) {
            String comprovar= ("");
            comprovar= comprovar+cami.charAt(a)+cami.charAt(a+1)+cami.charAt(a+2)+cami.charAt(a+3)+cami.charAt(a+4)+cami.charAt(a+5)+cami.charAt(a+6);
            if(matricula.equals(comprovar)){
                return true;
            }
        }
        

        return false;
    }

    
}
