/*
 * es un lloro que repeteix les paraules i a mes les recorda(guarda les paraules a un ficher) per poder despres repetir totes les paraules
 */
// XXX aquí tots els imports. N'hi ha 5!

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Recordat {
    public static void main(String[] args) throws IOException {
        String cami = "records.txt";
        processaEntrada(cami);
        System.out.println("D'acord");        mostraRecords(cami);
    }



    /**
     * Demana frases per entrada estàndard i les guarda a un fitxer
     * @param nomFitxer: nom del fitxer
     */
    public static void processaEntrada(final String nomFitxer) throws IOException {
        // XXX: aquí la part d'escriure les memòries
        //      No oblidaràs tancar en sortir, oi?
        String linia ="assd";
        String cami = nomFitxer;            
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami));
        while(!linia.isBlank()){
            System.out.println("El lloro pregunta paraula:");
            linia = Entrada.readLine();
            if(linia.isBlank()){
                break;
            }
            System.out.println("El lloro registra: "+ linia);

            sortida.write(linia);
            sortida.newLine();
            
        }
        sortida.close();
    }
    
    
    /**
     * Mostra el contingut del fitxer amb nom nomFitxer
     * @param nomFitxer: el nom del fitxer del que es mostrarà el contingut
     */
    public static void mostraRecords(final String nomFitxer) throws IOException {
        // XXX: aquí la part de recordar les memòries escrites
        
        String cami = nomFitxer;
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            System.out.println("El lloro recorda: "+linia);
        }
        System.out.println("Adéu");
        input.close();
        
    }

}
