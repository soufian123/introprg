//programa per introduir nomes matricules italianes (moduls)


public class MatriculaValida{
    public static void main (String[] args){
        
        System.out.println("Introduïu una matrícula");
        String paraula= Entrada.readLine();
        String lletres= "IOQUÑ";
        String comprovador= "false";
        char res='r';
        boolean testDos=false;
        String lletra= "hola";
        boolean obtingut = MatriculaValida.esLletraValidaPerMatriculaItaliana(paraula, testDos);
        
        if((paraula.length())==7){
        //boolean test = esLletraValidaPerMatriculaItaliana(paraula ,testDos);
            if (obtingut==true){
            
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
    
    
    
    
    public static boolean esLletraValidaPerMatriculaItaliana(String paraula ,boolean testDo){
        
        if (Character.isLetter(paraula.charAt(0))==true && Character.isLetter(paraula.charAt(1))==true && Character.isLetter(paraula.charAt(2))==false && Character.isLetter(paraula.charAt(3))==false && Character.isLetter(paraula.charAt(4))==false && Character.isLetter(paraula.charAt(5))==true && Character.isLetter(paraula.charAt(6))==true && Character.isUpperCase(paraula.charAt(1))==true && Character.isUpperCase(paraula.charAt(0))==true && Character.isUpperCase(paraula.charAt(5))==true && Character.isUpperCase(paraula.charAt(6))==true && (paraula.charAt(2))>=0 ==true && (paraula.charAt(3))>=0 ==true && (paraula.charAt(4))>=0 ==true){
            return true;
        }else{ 
            return false;
        }
    
    }
    
}
