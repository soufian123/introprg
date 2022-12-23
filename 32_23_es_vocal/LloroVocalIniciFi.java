/* Lloro que, en aquest cas només repeteixi les paraules que comencen per una vocal en minúscules i s'aturi quan rebi una cadena en blanc.





*/
public class LloroVocalIniciFi{
    public static void main (String[] args){
        


        boolean sortir=true;
        while (sortir){
        System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
        String lletra= Entrada.readLine();
            if (!lletra.isBlank()){
                while (!lletra.isBlank()){
                
                char inicial=Character.toLowerCase(lletra.charAt(0));
                boolean obtingut = UtilString.esVocal(inicial);
                
                if( obtingut){
                }else{
                    char fin=Character.toLowerCase(lletra.charAt(lletra.length()-1));
                    obtingut = UtilString.esVocal(fin);
                }
                
                    if( obtingut){
                        System.out.println("El lloro diu: "+ lletra);
                    }
                    System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
                    lletra= Entrada.readLine();
                }

            }
            System.out.println("El lloro demana confirmació per finalitzar");
            String sortida= Entrada.readLine();
            sortir = UtilitatsConfirmacio.respostaABoolean(sortida);
            if(sortir){
                System.out.print("Adéu");
                return;
            }
            sortir=true;
        }
    }
}
