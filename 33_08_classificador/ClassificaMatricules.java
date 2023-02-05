
// programa que llegueix un fitxer amb matricules i les va separant entre dos carpetes 
// una on son les matricules italianes i l'altre les desconegudes

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ClassificaMatricules{
    public static void main (String[] args) throws IOException{
        
        String cami = "llegides.txt";
        String italianes  = "italianes.txt";
        String desconegudes = "desconegudes.txt";
        BufferedReader input = new BufferedReader(new FileReader(cami));      // obrir
        BufferedWriter valid = new BufferedWriter(new FileWriter(italianes));
        BufferedWriter desconegut = new BufferedWriter(new FileWriter(desconegudes));
        while (true) {
            String para = input.readLine();                        // llegir
            String paraula = para.trim();
            if (null == paraula) break;



            boolean comprovador= false;
            if((paraula.length())==7){
                for(int num =0; num<=7; num++ ){
                    boolean obtingut= true; 
                    if (num==1 || num==0 || num==5 || num==6){
                                char paraulaa= paraula.charAt(num);

                         obtingut = ClassificaMatricules.esLletraValidaPerMatriculaItaliana(paraulaa);
                         
                        if (obtingut){
                             obtingut= true;
                        }else{
                             obtingut= false;
                             desconegut.write(paraula);
                             desconegut.newLine();
                            break;
                        }
                    }else if(num==2 || num==3 || num==4){
                                char paraulaa= paraula.charAt(num);
                        if(Character.isLetter(paraulaa)==false){
                             obtingut= true;
                        }else{
                             obtingut= false;
                             desconegut.write(paraula);
                             desconegut.newLine();
                            break;
                        }

                    }else if (num==7){

                        if (obtingut){
                            if (comprovador==false){
                                valid.write(paraula);
                                valid.newLine();
                                    break;
                            }else{
                                desconegut.write(paraula);
                                desconegut.newLine();
                                break;}
                        }else{
                            desconegut.write(paraula);
                            desconegut.newLine();
                            break;
                        }
                    }
         
                }
            }else{
                desconegut.write(paraula);
                desconegut.newLine();

            }

                
        }   
        desconegut.close();
        valid.close();
        input.close();                                              // tancar
        }
        
        

    public static boolean esLletraValidaPerMatriculaItaliana(char paraula) throws IOException{
    
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
    
}
