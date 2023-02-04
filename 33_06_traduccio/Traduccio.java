/*
 * es un programa que rebra 3 argumens, el primer es el nom del fixer de text, el segon es un fitxer de text que també suposarem que 
 * existeix, i que anomenarem traducció i El tercer argument correspondrà al nom d'un fitxer de text que pot no existir.
 * Ens referirem a aquest fitxer com la destinació
 * El programa escriurà en la destinació el contingut de l'origen pel que haurà reemplaçat les aparicions de les claus pels corresponents 
 * valors.
 *
 */
// XXX aquí tots els imports. N'hi ha 5!

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;



public class Traduccio {
    public static void main(String[] args) throws IOException{
        if (args.length!=3){
            System.out.println("ERROR: Cal especificar els fitxers origen, traduccio i destinació");
            return;
        }
        tradueix(args[0],args[1],args[2]);
    }
    
    public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException{
        BufferedReader input = new BufferedReader(new FileReader(fitxerOrigen));
        BufferedWriter sortida = new BufferedWriter(new FileWriter(fitxerDestinacio));
        while (true){
            String linia= input.readLine();
            if (null == linia) break;
            linia = tradueixLinia(linia,fitxerTraduccio);
            sortida.write(linia);
            sortida.newLine();
        
            
        }
        sortida.close();
    }
    
    
    public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException{
        BufferedReader input = new BufferedReader(new FileReader(fitxerTraduccio));
        
        while (true){
            String liniaTraduir = input.readLine();
            if (null == liniaTraduir) break;
            String[] paraula = liniaTraduir.split(",");
            linia = linia.replaceFirst(paraula[0].strip(),paraula[1].strip());
        }
        return linia;
    }
}

