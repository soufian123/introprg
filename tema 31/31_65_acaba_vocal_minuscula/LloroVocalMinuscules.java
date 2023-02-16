//Desenvolupa una nova versió del programa del Lloro que, en aquest cas només repeteixi les paraules que finalitzen amb una vocal en minúscules i s'aturi quan rebi una cadena en blanc.

public class LloroVocalMinuscules{
    public static void main (String[] args){
        
        System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
        String paraula= Entrada.readLine();


        

        if (!paraula.isBlank()){
            while (!paraula.isBlank()){
                if( paraula.charAt(paraula.length()-1)=='a' || paraula.charAt(paraula.length()-1)== 'e' || paraula.charAt(paraula.length()-1)=='i' || paraula.charAt(paraula.length()-1)=='o' || paraula.charAt(paraula.length()-1)=='u'){
                    System.out.println("El lloro diu: "+ paraula);
                }
                System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
                paraula= Entrada.readLine();
            }
        }
        System.out.print("Adéu");
    }
}
