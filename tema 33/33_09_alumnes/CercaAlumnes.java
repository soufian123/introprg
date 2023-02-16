/*
 * aquest programa es un cercador dalumnes, tracta que llegeix un document anomenat 'alumnes.csv' on tu li dius 
 * 'CercaAlumnes elef'i et busca totes les persones que continguin elef
 *
 */


import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class CercaAlumnes {

    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }

    public static Alumne construeixAlumne(String nom, String email,
                                          int edat, boolean esOient,
                                          int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
        System.out.println("Alumne: " + alumne.nom);
        System.out.println("- email: " + alumne.email);
        System.out.println("- edat: " + alumne.edat);
        System.out.println("- és oïent: " + (alumne.esOient?"Sí":"No"));
        System.out.println("- notes: " + notesACsv(alumne.notes));
    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", " +
                "edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }

    // converteix un array de notes a CSV
    // Té en comptes els valors NP com a -1
    public static String notesACsv(int[] notes) {
        // XXX a completar
        //iprimeix apartat de Utilitzades

        String utilitzades="";
        for(int a=0; a<notes.length-1; a++){
            if(notes[a]<0){
                utilitzades= utilitzades+"NP,";
            }else{
                utilitzades= utilitzades+ notes[a]+",";
            }
        }
        if(notes[notes.length-1]<0){
            utilitzades= utilitzades+"NP";
        }else{
            utilitzades= utilitzades+ notes[notes.length-1];
        }
        
        return utilitzades;
        
        
    }

    public static String alumneACsv(Alumne alumne) {
        // XXX a completar encara que no es fa servir en aquest programa
        String nom = alumne.nom;
    	String email = alumne.email;
    	int edat = alumne.edat;
    	boolean esOient = alumne.esOient;
        int [] notess = alumne.notes;
        String utilitzades="";
        for(int a=0; a<notess.length-1; a++){
            if(notess[a]<0){
                utilitzades= utilitzades+"NP,";
            }else{
                utilitzades= utilitzades+ notess[a]+",";
            }
        }
        if(notess[notess.length-1]<0){
            utilitzades= utilitzades+"NP";
        }else{
            utilitzades= utilitzades+ notess[notess.length-1];
        }
    	String csv = (nom + "," + email + "," + edat + "," + esOient + "," + utilitzades);
    	
    	return csv;
    }

    public static Alumne csvAAlumne(String csv) {
        // XXX a completar
        String[] cami = csv.split(",");
        int edat = Integer.parseInt(cami[2]);
        
		boolean esOient = Boolean.parseBoolean(cami[3]);
		int[] notes = new int[6];
		for(int i=4; i < cami.length; i++){
		    if(cami[i].equals("NP")){
		        notes[i-4]=-1;
		    }else{
			    notes[i-4]=Integer.parseInt(cami[i]);
			}
		}
		
		return construeixAlumne(cami[0], cami[1], edat, esOient, notes);
		
		
		
    }

    public static void main(String[] args) throws IOException {
        // assegura que hi ha el criteri de cerca
        // XXX a completar
        if (args.length==0){
            System.out.println("Error: indica el criteri de cerca");
            return;
        }

        // declaracions, inicialitzacions, apertura de fitxer, ignora línia de capçaleres, etc.
        // XXX a completar
        BufferedReader input = new BufferedReader(new FileReader("alumnes.csv"));
		String linia = input.readLine();
		Alumne alumne = new Alumne();
        int paraules=0;
        while (true) {
            // llegeix entrada i finalitza bucle si no en queden més
            // XXX a completar
            linia = input.readLine();
			if (null == linia) break;

            // converteix l'entrada a Alumne
            // XXX a completar
            alumne = csvAAlumne(linia);

            // comprova si el criteri de cerca es troba dins del nom o
            // el email. Si és així, mostra'l
            // XXX a completar
            if (linia.contains(args[0])){
		        	paraules++;
		        	mostraAlumne(alumne);
	        }
        }
	    if (paraules==0){
    	System.out.println("Cap alumne");
        }
        // consideracions finals com ara el tancament del fitxer
        // XXX a completar
        input.close();
    }
}
