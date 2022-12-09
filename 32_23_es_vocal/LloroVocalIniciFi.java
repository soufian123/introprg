/* Lloro que, en aquest cas només repeteixi les paraules que comencen per una vocal en minúscules i s'aturi quan rebi una cadena en blanc.





*/
public class LloroVocalIniciFi{
    public static void main (String[] args){
        


        boolean sortir=true;
        while (sortir){
        System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
        String paraula= Entrada.readLine();
            if (!paraula.isBlank()){
                while (!paraula.isBlank()){
                boolean resposta = UtilString.esVocal(paraula);
                
                
                    if( resposta){
                        System.out.println("El lloro diu: "+ paraula);
                    }
                    System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
                    paraula= Entrada.readLine();
                }

            }
            System.out.println("El lloro demana confirmació per finalitzar");
            String sortida= Entrada.readLine();
            sortir = UtilitatsConfirmacio.respostaABoolean(sortida);
            if(sortir){
                System.out.print("Adéu");
                return;
            }
        }
    }
}
