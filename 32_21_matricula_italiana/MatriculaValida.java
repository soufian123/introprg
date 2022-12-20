//programa per introduir nomes matricules italianes (moduls)


public class MatriculaValida{
    public static void main (String[] args){
        
        System.out.println("Introduïu una matrícula");
        String paraula= Entrada.readLine();
        String lletres= "IOQUÑ";
        String comprovador= "false";

        
        if((paraula.length())==7){
        //boolean test = esLletraValidaPerMatriculaItaliana(paraula ,testDos);
        
        for(int num =0; num<=7; num++ ){

            boolean obtingut= true; 
            if (num==1 && num==0 && num==5 && num==6){
                        char paraulaa= paraula.charAt(num);
                 obtingut = MatriculaValida.esLletraValidaPerMatriculaItaliana(paraulaa);
                if (obtingut){
                     obtingut= true;
                }else{
                     obtingut= false;
                    break;
                }
            }else if(num==2 && num==3 && num==4){
                        char paraulaa= paraula.charAt(num);
                if(Character.isLetter(paraulaa)==false){
                     obtingut= true;
                }else{
                     obtingut= false;
                    break;
                }
            
        
           
           
           }else if (num==7){
            
            
                if (obtingut){
                
                for (int numm=0; numm<=4; numm++){
                    if (paraula.charAt(0)==lletres.charAt(numm) || paraula.charAt(1) ==lletres.charAt(numm) || paraula.charAt(5) ==lletres.charAt(numm) || paraula.charAt(6) ==lletres.charAt(numm)){
                        comprovador="true";
                    }
                }
                
                
                    if (comprovador=="false"){
                        System.out.println("És una matrícula italiana vàlida");
                    }else{System.out.println("No és una matrícula italiana vàlida");}
                }else{System.out.println("No és una matrícula italiana vàlida");
                }
                }else{System.out.println("No és una matrícula italiana vàlida");
                }
        }
            
 
           }
        }
        
        /*
                
                
                
            if (obtingut=true){
            
            for (int num=0; num<=4; num++){
                if (paraula.charAt(0)==lletres.charAt(num) || paraula.charAt(1) ==lletres.charAt(num) || paraula.charAt(5) ==lletres.charAt(num) || paraula.charAt(6) ==lletres.charAt(num)){
                    comprovador="true";
                }
            }
            
            
                if (comprovador=="false"){
                    System.out.println("És una matrícula italiana vàlida");
                }else{System.out.println("No és una matrícula italiana vàlida");}
            }else{System.out.println("No és una matrícula italiana vàlida");
            }
            }else{System.out.println("No és una matrícula italiana vàlida");
            }
    }
    */
    
    
    
    public static boolean esLletraValidaPerMatriculaItaliana(char paraula){
    
if(Character.isLetter(paraula)==true        && Character.isUpperCase(paraula)==true){

            return true;
        }else{ 
            return false;
        }
    
    }
    
}
