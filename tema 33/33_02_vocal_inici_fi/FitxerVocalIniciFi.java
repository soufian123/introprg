


/* 
 * probrama que llegeix el archiu frases, ho separa per frases i ho imprimeix si la primera lletra o la ultima
 * de la frase es vocal
 */




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




   //     /../32_23/LloroVocalIniciFi ;

public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            if(UtilString.esVocal(linia.charAt(0)) || UtilString.esVocal(linia.charAt((linia.length()-1)))){
                System.out.println(linia);
            }
        }
        input.close();
    }
}


