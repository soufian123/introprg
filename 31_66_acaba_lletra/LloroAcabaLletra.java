//Desenvolupa una nova versió del programa del Lloro que, en aquest cas només repeteixi les paraules que finalitzin amb una lletra no vocal. Com la versió original, s'aturarà quan rebi una cadena en blanc o buida.

public class LloroAcabaLletra{
    public static void main (String[] args){
        
        System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
        String paraula= Entrada.readLine();


        

        if (!paraula.isBlank()){
            while (!paraula.isBlank()){
            
                if( !(paraula.charAt(paraula.length()-1)=='a' || paraula.charAt(paraula.length()-1)== 'e' || paraula.charAt(paraula.length()-1)=='i' || paraula.charAt(paraula.length()-1)=='o' || paraula.charAt(paraula.length()-1)=='u' || paraula.charAt(paraula.length()-1)=='A' || paraula.charAt(paraula.length()-1)== 'E' || paraula.charAt(paraula.length()-1)=='I' || paraula.charAt(paraula.length()-1)=='O' || paraula.charAt(paraula.length()-1)=='U')){
                    System.out.println("El lloro diu: "+ paraula);
                }
                System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
                paraula= Entrada.readLine();
            }
        }
        System.out.print("Adéu");
    }
}
