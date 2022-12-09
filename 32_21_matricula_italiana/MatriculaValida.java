//programa per introduir nomes matricules italianes (moduls)


public class MatriculaValida{
    public static void main (String[] args){
        
        System.out.println("Introduïu una matrícula");
        String lletra= Entrada.readLine();
        String lletres= "IOQUÑ";
        String comprovador= "false";
        char res='r';
        boolean testDos=false;
        
        
        if((lletra.length())==7){
        //boolean test = esLletraValidaPerMatriculaItaliana(lletra ,testDos);
            boolean obtingut = MatriculaValida.esLletraValidaPerMatriculaItaliana(lletra);
            if (obtingut==true){
            
            for (int num=0; num<=4; num++){
                if (lletra.charAt(0)==lletres.charAt(num) || lletra.charAt(1) ==lletres.charAt(num) || lletra.charAt(5) ==lletres.charAt(num) || lletra.charAt(6) ==lletres.charAt(num)){
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
    
    
    
    
    public static boolean esLletraValidaPerMatriculaItaliana(String lletra){
        
        if (Character.isLetter(lletra.charAt(0))==true && Character.isLetter(lletra.charAt(1))==true && Character.isLetter(lletra.charAt(2))==false && Character.isLetter(lletra.charAt(3))==false && Character.isLetter(lletra.charAt(4))==false && Character.isLetter(lletra.charAt(5))==true && Character.isLetter(lletra.charAt(6))==true && Character.isUpperCase(lletra.charAt(1))==true && Character.isUpperCase(lletra.charAt(0))==true && Character.isUpperCase(lletra.charAt(5))==true && Character.isUpperCase(lletra.charAt(6))==true && (lletra.charAt(2))>=0 ==true && (lletra.charAt(3))>=0 ==true && (lletra.charAt(4))>=0 ==true){
            return true;
        }else{ 
            return false;
        }
    
    }
    
}
