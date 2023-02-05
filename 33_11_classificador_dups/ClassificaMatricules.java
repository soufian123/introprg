
// programa que llegueix un fitxer amb matricules i les va separant entre dos carpetes 
// una on son les matricules italianes i l'altre les desconegudes

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;

public class ClassificaMatricules{
    public static void main (String[] args) throws IOException{
        
        String cami = "llegides.txt";
        //borrador de carpetas
        String italianes  = "italianes.txt";
        String desconegudes = "desconegudes.txt";

        BufferedReader input = new BufferedReader(new FileReader(cami));      // obrir
        BufferedWriter valid = new BufferedWriter(new FileWriter(italianes));
        BufferedWriter desconegut = new BufferedWriter(new FileWriter(desconegudes));
        while (true) {
            String paraula = input.readLine();                        // llegir
            
            if (null == paraula) break;
            paraula = paraula.trim();

            if(paraula.length()==7){
            
                if (matriculaItalianaValida(paraula) && !repetida(paraula, italianes )){
                    valid.write(paraula);
                    valid.newLine();

                }else {
                    if (!repetida(paraula, desconegudes )){
                        desconegut.write(paraula);
                        desconegut.newLine();
                    }

                }
                

            }else {
                    if (!repetida(paraula, desconegudes )){
                        desconegut.write(paraula);
                        desconegut.newLine();
                    }

            }

                
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

                         obtingut = esLletraValidaPerMatriculaItaliana(paraulaa);
                         
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

    public static boolean esLletraValidaPerMatriculaItaliana(char paraula) {
    
        if(Character.isLetter(paraula)==true        && Character.isUpperCase(paraula)==true){
            if (paraula=='É' || paraula =='È' || paraula ==' '){
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
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            if(linia.equals(matricula)){
                return true;
            }
        }
        input.close();
        return false;
    }

    
}
