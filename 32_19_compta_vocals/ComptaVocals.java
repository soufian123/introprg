/* programa que mostra quantes vocals (les catalanes)  té el text llegit */



public class ComptaVocals {
    public static void main(String[] args) {
    
    
    
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        
        
        
        
        
        
        
        
        int numAs = quantesOcurrencies(entrada, 'a');
        int numAsAccent = quantesOcurrencies(entrada, 'à');
        int numEs = quantesOcurrencies(entrada, 'e');
        int numEsAccent = quantesOcurrencies(entrada, 'é');
        int numEsAccentdos = quantesOcurrencies(entrada, 'è');
        int numIs = quantesOcurrencies(entrada, 'i');
        int numIsAccent = quantesOcurrencies(entrada, 'í');
        int numIsDieresi = quantesOcurrencies(entrada, 'ï');
        int numOs = quantesOcurrencies(entrada, 'o');
        int numOsAccents = quantesOcurrencies(entrada, 'ó');
        int numOsAccentsDos = quantesOcurrencies(entrada, 'ò');
        int numUs = quantesOcurrencies(entrada, 'u');
        int numUsAccents = quantesOcurrencies(entrada, 'ú');
        int numUsAccentsDos = quantesOcurrencies(entrada, 'ü');
        
        mostraOcurrencies('a', numAs);
        mostraOcurrencies('à', numAsAccent);
        mostraOcurrencies('e', numEs);
        mostraOcurrencies('è', numEsAccentdos);
        mostraOcurrencies('é', numEsAccent);
        mostraOcurrencies('i', numIs);
        mostraOcurrencies('í', numIsAccent);
        mostraOcurrencies('ï', numIsDieresi);
        mostraOcurrencies('o', numOs);
        mostraOcurrencies('ó', numOsAccents);
        mostraOcurrencies('ò', numOsAccentsDos);
        mostraOcurrencies('u', numUs);
        mostraOcurrencies('ú', numUsAccents);
        mostraOcurrencies('ü', numUsAccentsDos);

        
        
        
    }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}
