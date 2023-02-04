/*
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
        
            sortida.close();
        }
        
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

