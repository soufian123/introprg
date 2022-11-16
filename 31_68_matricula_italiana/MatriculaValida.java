//programa per introduir nomes matricules italianes


public class MatriculaValida{
    public static void main (String[] args){
        
        System.out.println("Introduïu una matrícula");
        String paraula= Entrada.readLine();
        
        if((paraula.length())==7){
            if (Character.isLetter(paraula.charAt(0))==true && Character.isLetter(paraula.charAt(1))==true && Character.isLetter(paraula.charAt(2))==false && Character.isLetter(paraula.charAt(3))==false && Character.isLetter(paraula.charAt(4))==false && Character.isLetter(paraula.charAt(5))==true && Character.isLetter(paraula.charAt(6))==true && Character.isUpperCase(paraula.charAt(1))==true && Character.isUpperCase(paraula.charAt(0))==true && Character.isUpperCase(paraula.charAt(5))==true && Character.isUpperCase(paraula.charAt(6))==true && (paraula.charAt(2))>=0 ==true && (paraula.charAt(3))>=0 ==true && (paraula.charAt(4))>=0 ==true){
            
                System.out.println("És una matrícula italiana vàlida");
            }else{System.out.println("No és una matrícula italiana vàlida");
            }
            }else{System.out.println("No és una matrícula italiana vàlida");
            }
    }
}
        
