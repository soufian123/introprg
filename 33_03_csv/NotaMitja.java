
/*
 *
 *programa que li pasas un document csv amb el nom de lalumne i les notes   ue tens
 * i et fa una nota mitjana de totes les notes que li has pasat
 *
 */
 


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NotaMitja {
    public static void main(String[] args) throws IOException {
        
     
        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        
        int numeros=0;
        double mitjana=0;
        int numero=0;
        int intro=0;
        String linia = input.readLine();
        int cont =0;
        
        while (true) {
            linia = input.readLine();
            if (null == linia) break;

            String[] elements = linia.split(",");
            
            for (int i=1; i<7; i++) {
                if(UtilString.esEnter(elements[i])){
                
                    intro= Integer.parseInt(elements[i]);
                    numeros= numeros + intro;
                 //   System.out.println(numeros);
                }
            }
            mitjana= numeros/6;
            System.out.printf(elements[0]+ " ("+"%.2f)%n", (numeros/6.0));
            numeros=0;
            mitjana=0;
            cont++;

        }
        if (cont==0){
            System.out.println("Cap entrada");
        }
     }
}
