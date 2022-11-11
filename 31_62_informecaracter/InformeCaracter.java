

//un programa que demani un text i, respecte el primer caràcter, composi un petit informe amb el resultat de les funcions anteriors.


public class InformeCaracter{
    public static void main (String[] args){
        
        
        System.out.println("Caràcter?");
        String text=Entrada.readLine(); 
        

        if (!text.isEmpty()){
            char lletra = text.charAt(0);
            //nom del caràcter
            String getName= Character.getName(lletra);
            System.out.println("Character.getName('"+lletra+"'): "+getName);



            //boolean que indica si és o no un dígit
            boolean isDigit=Character.isDigit(lletra);
            System.out.println("Character.isDigit('"+lletra+"'): "+isDigit);


            //boolean que indica si pot ser o no l'inici d'un identificador vàlid per Java
            boolean isJavaIdentifierStart=Character.isJavaIdentifierStart(lletra);
            System.out.println("Character.isJavaIdentifierStart('"+lletra+"'): "+ isJavaIdentifierStart);


            //boolean que indica si pot ser o no part d'un identificador vàlid de Java (sense considerar el caràcter inicial)
            boolean isJavaIdentifierPart=Character.isJavaIdentifierPart(lletra);
            System.out.println("Character.isJavaIdentifierPart('"+lletra+"'): "+ isJavaIdentifierPart);


            //boolean que indica si correspon o no a una lletra
            boolean isLetter=Character.isLetter(lletra);
            System.out.println("Character.isLetter('"+lletra+"'): "+isLetter);


            //boolean que indica si està o no en minúscules
            boolean isLowerCase=Character.isLowerCase(lletra);
            System.out.println("Character.isLowerCase('"+lletra+"'): "+ isLowerCase);


            //boolean que indica si està o no en majúscules
            boolean isUpperCase=Character.isUpperCase(lletra);
            System.out.println("Character.isUpperCase('"+lletra+"'): "+isUpperCase);


            //boolean que indica si correspon o no amb un espai blanc
            boolean isWhitespace=Character.isWhitespace(lletra);
            System.out.println("Character.isWhitespace('"+lletra+"'): "+isWhitespace);




            //retorna la versió del caràcter com a minúscules
            char toLowerCase=Character.toLowerCase(lletra);
            System.out.println("Character.toLowerCase('"+lletra+"'): "+ toLowerCase);



            //retorna la versió del caràcter com a majúscules
                
            char toUpperCase=Character.toUpperCase(lletra);
            System.out.println("Character.toUpperCase('"+lletra+"'): "+toUpperCase);
        }
    }
}
    
        
        
        
        
        
