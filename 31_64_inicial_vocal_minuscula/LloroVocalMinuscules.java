// Lloro que, en aquest cas només repeteixi les paraules que comencen per una vocal en minúscules i s'aturi quan rebi una cadena en blanc.

public class LloroVocalMinuscules{
    public static void main (String[] args){
        
        System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
        String paraula= Entrada.readLine();


        

        if (!paraula.isBlank()){
            while (!paraula.isBlank() && Character.isLowerCase(paraula.charAt(0))==true || paraula.charAt(0)=='a' || paraula.charAt(0)== 'e' || paraula.charAt(0)=='i' || paraula.charAt(0)=='o' || paraula.charAt(0)=='u'){
            
                System.out.println("El lloro diu: "+ paraula);
                System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
                paraula= Entrada.readLine();
            }
        }
        System.out.print("Adéu");
    }
}
