// Lloro que, en aquest cas només repeteixi les paraules que comencen per una vocal en minúscules i s'aturi quan rebi una cadena en blanc.

public class LloroVocalMinuscules{
    public static void main (String[] args){
        
        System.out.printl("El lloro pregunta paraula que comenci amb vocal en minúscules");
        String paraula= Entrada.readLine();
        char lletra= paraula.charAt(0);
        boolean minuscula =Character.isLowerCase(lletra);
        
        while (!paraula.isEmpty() || minuscula=true|| lletra=="a" || lletra== "e" || lletra=="i" || lletra=="o" || lletra=="u"){
        
            System.out.print("El lloro diu: "+ paraula);
            System.out.printl("El lloro pregunta paraula que comenci amb vocal en minúscules");
            paraula= Entrada.readLine();
            lletra= paraula.charAt(0);
            minuscula =Character.isLowerCase(lletra);
        }
    }
}
