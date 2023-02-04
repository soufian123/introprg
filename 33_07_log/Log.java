/* 
 * biblioteca anoenada Log on estan guardats moduls de mini programes que 
 * en aquest cas imprimira diferents errors, depen de la crida.
 * 
 * 
 */
 

public class Log {
    private static int contador = 1;

    public static String printError(String text) {
        String linea = String.format("["+contador+"] ERROR: "+text);
        contador++;
        return linea;
    }

    public static String printWarning(String text) {
        String linea = String.format("["+contador+"] WARNING: "+text);
        contador++;
        return linea;
    }

    public static String printInfo(String text) {
        String linea = String.format("["+contador+"] INFO: "+text);
        contador++;
        return linea;
    }

    public static String printDebug(String text) {
        String linea = String.format("["+contador+"] DEBUG: "+text);
        contador++;
        return linea;
    }

    public static void reset() {
        contador = 1;
    }
}










