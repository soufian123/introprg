/* 
 * 
 * programa Per poder provar Log.java
 * 
 */
 
 
 
 
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class UsaLog {
    public static void main(String[] args) throws IOException {
   
   
   
        String cami ="log.txt";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));


        Log.printError("Això és un error greu");
        sortida.newLine();
        Log.printWarning("Això és un avís");
        sortida.newLine();
        for (int i=0; i < args.length; i++) {
            sortida.write(Log.printInfo(String.format("Argument %d: %s", i, args[i])));
            sortida.newLine();
        }



        Log.reset();     // comencem a comptar un altre cop
        sortida.write(Log.printDebug("Aquí s'acaba el main()"));
        sortida.newLine();
        sortida.close();
    }
}



