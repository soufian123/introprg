

/* 
 * Es un programa o archiu anomenat Entorn on es juga amb els diferents archius de la carpeta, 
 * anomenats vi, botiga, utilstring i utilitatsConfirmacio. Aquest programa ens deixa jugar
 * amb els diferent articles, en aquest cas es el vi, el que podem fer es modificar un vi
 * canviar l'estoc, el preu, etc. Ens permet afeguir vins , modificarlos, cercarlos
 * i eliminarlos tambe.
 * Despres te com altres que el que fa es mostrar a benvinguda, els errors, mostra comiat,
 * mostraPrompt i la ajuda
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;




public class Entorn {
    private final Botiga botiga = new Botiga();
    public static void main(String[] args) throws IOException {
        int vins = 0;
        String file = "botiga.csv";
        Entorn entorn = new Entorn();
        FileWriter fitxer = new FileWriter(file,true);
        fitxer.close();
        BufferedReader input = new BufferedReader(new FileReader(file));
        while (true) {
            String vi = input.readLine();
            if(vi==null){break;} 
            String[] viAr = vi.split(";");
            Vi nouVi = Vi.deArrayString(viAr);
            if(nouVi == null){continue;}
            else {
                entorn.botiga.afegeix(nouVi);
            }
        }
        input.close();

        mostraBenvinguda();
        System.out.printf("Referències llegides: %s\n",contarVins());
        while (true) {
            mostraPrompt();
            String comanda = Entrada.readLine().strip();
            if (comanda.isEmpty()) continue;
            if (comanda.equals("surt")) break;
            switch (comanda) {
                case "ajuda": mostraAjuda();
                             break;
                case "afegeix": entorn.processaAfegeix();
                           break;
                case "cerca": entorn.processaCerca();
                             break;
                case "modifica": entorn.processaModifica();
                            break;
                case "elimina": entorn.processaElimina();
                           break;
                default: mostraErrorComandaDesconeguda();
            }
        }
        entorn.botiga.iniciaRecorregut();
        entorn.guardarVins();
        vins = contarVins();
        System.out.printf("Referències guardades: %s\n",vins);
        mostraComiat();
    }
    private static void mostraComiat() {
        System.out.println("adéu");
    }
    private static void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }
    private static void mostraBenvinguda() {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
    }
    private static void mostraPrompt() {
        System.out.print("botiga> ");
    }
    
    private static void mostraAjuda() {
        System.out.println("Comandes disponibles:");
        System.out.println("ajuda");
        System.out.println("cerca");
        System.out.println("afegeix");
        System.out.println("modifica");
        System.out.println("elimina");
        System.out.println("surt");
    }
    
     private void processaCerca() {
        System.out.print("nom (enter cancel·la)> ");
        String nom= Entrada.readLine();
        if (nom.isEmpty()){
            return;
        }
        nom = Vi.normalitzaNom(nom);
        
        Vi vi = botiga.cerca(nom);
        if (vi==null){
            System.out.println("No trobat");
            return;
        }
        System.out.println("Trobat:");
        System.out.println(vi);

     }

    
    public void processaAfegeix(){
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) {
            return;
        }
        nom = Vi.normalitzaNom(nom);
        
        
        System.out.print("preu (en cèntims)> ");
        String num = Entrada.readLine();
        if (num.isEmpty()) num = "0";
        int preu = Integer.parseInt(num);
        if (preu<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        
        
        System.out.print("estoc (enter sense estoc)> ");
        String text = Entrada.readLine();
        if (text.isEmpty()) text="0";
        int estoc = Integer.parseInt(text);
        if (estoc<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        
        
        Vi vi = new Vi(nom,preu,estoc);
        if (botiga.afegeix(vi) == null) {
            System.out.println("ERROR: no s'ha pogut afegir");
            return;
        }
        
        System.out.println("Introduït:");
        System.out.println(vi);
    }
    
    public void processaModifica(){
        System.out.print("nom (enter cancel·la)> ");
        String nom= Entrada.readLine();
        if (nom.isEmpty()) return;
        nom=Vi.normalitzaNom(nom);
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("No trobat");
            return;
        }
            
            
        System.out.printf("preu (enter %s)> ",vi.getPreu());
        String num = Entrada.readLine();
        int preu=0;
        if (num.isEmpty()){
            preu = vi.getPreu();
        }else{
            preu = Integer.parseInt(num);
        }
        if (preu<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        vi.setPreu(preu);
        
        
        System.out.printf("estoc (enter %s)> ",vi.getEstoc());
        String text = Entrada.readLine();
        int estoc=0;
        if (text.isEmpty()){
            estoc = vi.getEstoc();
        }else{
            estoc = Integer.parseInt(text);
        }
        if (estoc<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        vi.setEstoc(estoc);
        
        System.out.println("Modificat:");
        System.out.println(vi);
    
    
    }
    private void processaElimina() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) return;
        nom = Vi.normalitzaNom(nom);
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("No trobat");
            return;
            
        }
        System.out.println("A eliminar:");
        System.out.println(vi);
        System.out.print("Segur?> ");
        String text = Entrada.readLine();
        
        if (!UtilitatsConfirmacio.respostaABoolean(text)) {
            System.out.println("No eliminat");
            return;
        }
        
        vi = botiga.elimina(nom);
        if (vi == null) {
            System.out.println("ERROR: no s'ha pogut eliminar");
        } else {
            System.out.println("Eliminat");
        }
    }

    
    public static int contarVins() throws IOException {
        String file = "botiga.csv";
        BufferedReader input = new BufferedReader(new FileReader(file));
        int num = 0;
        String linia ="";
        while (true) {
            linia = input.readLine();
            if (linia == null) {break;}
            else {
                String[] viAr = linia.split(";");
                if(Vi.deArrayString(viAr)==null){continue;}
                else {num++;}
            }
        }
        input.close();
        return num;
    }


    private void guardarVins() throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter("botiga.csv"));
        while(true) {
            Vi vi = botiga.getSeguent();
            if (vi==null){
                break;
            } else {
                String[] guardar = vi.aArrayString();
                String vicsv="";
                for(int i=0;i<guardar.length;i++){
                    if(i==0){
                        vicsv = guardar[i];
                    } else {
                        vicsv=vicsv+";"+guardar[i];
                    }
                }
                output.write(vicsv);
                output.newLine();
            }
        }
        output.close();
    }
}

