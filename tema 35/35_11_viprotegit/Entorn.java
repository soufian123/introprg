

/* 
 * Es un programa o archiu anomenat Entorn on es juga amb els diferents archius de la carpeta, 
 * anomenats vi, botiga, utilstring i utilitatsConfirmacio. Aquest programa ens deixa jugar
 * amb els diferent articles, en aquest cas es el vi, el que podem fer es modificar un vi
 * canviar l'estoc, el textPreu, etc. Ens permet afeguir vins , modificarlos, cercarlos
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
    private final static Botiga sbotiga = new Botiga();
    private final Botiga botiga = new Botiga();
    private int referenciess;
    
    public static void main(String[] args) throws IOException, Exception {
        int vins = 0;
        String file = "botiga.csv";
        Entorn entorn = new Entorn();
        FileWriter fitxer = new FileWriter(file,true);
        fitxer.close();
        BufferedReader input = new BufferedReader(new FileReader(file));
        mostraBenvinguda();
        if (comptaReferenciesTotal()> entorn.botiga.getMax()){
            System.out.println("ERROR: massa entrades a botiga.csv");
            for(int a=0; a<entorn.botiga.getMax();a++) {
                String vi = input.readLine();
                if(vi==null){break;} 
                String[] viAr = vi.split(";");
                Vi nouVi = Vi.deArrayString(viAr);
                if(nouVi == null){continue;}
                else {
                    try{
                        entorn.botiga.afegeix(nouVi);
                    } catch (Exception e){
                        System.out.println(e);
                    }
                }
            }
            input.close();
            
        }else{
        
            while (true) {
                String vi = input.readLine();
                if(vi==null){break;} 
                String[] viAr = vi.split(";");
                Vi nouVi = Vi.deArrayString(viAr);
                if(nouVi == null){continue;}
                else {
                    try{
                        entorn.botiga.afegeix(nouVi);
                    } catch (Exception e){
                        System.out.println(e);
                    }
                }
            }
            input.close();
        }
        
        System.out.printf("Referències llegides: %s\n",comptaReferencies());
        while (true) {
            mostraPrompt();
            String comanda = Entrada.readLine().strip();
            if (comanda.isEmpty()) continue;
            if (comanda.equals("surt")) break;
            switch (comanda) {
                case "ajuda": mostraAjuda();
                             break;
                case "afegeix": System.out.println("Comanda temporalment no disponible");;
                           break;
                case "cerca": entorn.processaCerca();
                             break;
                case "modifica": System.out.println("Comanda temporalment no disponible");;
                            break;
                case "elimina": System.out.println("Comanda temporalment no disponible");;
                           break;
                default: mostraErrorComandaDesconeguda();
            }
        }
        entorn.botiga.iniciaRecorregut();
        entorn.guardarVins();
        vins = comptaReferencies();
        //System.out.printf("Referències guardades: %s\n",vins);
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
        //System.out.println("afegeix");
       // System.out.println("modifica");
        //System.out.println("elimina");
        System.out.println("surt");
    }
    
    public void processaCerca()  throws Exception{
        String ref ="";
        String nom="";
        int preu = -1;
        String textPreu="";
        int estoc = -1;
        String textEstoc="";
        String lloc="";
        String origen="";
        String tipus="";
        String collita="";
        
        System.out.print("ref> ");
        ref = Entrada.readLine();
        if(ref.equals("!")) return;
        if(!ref.isBlank()) {
            try{
                Vi busca = botiga.cerca(ref);
            
                if (busca == null) {
                    return;
                } else {
                    System.out.println("Trobat:\n"+busca);
                }
           } catch (Exception e){
                    System.out.println(e);
            }
        } else {
            while(true) {
                System.out.print("nom> ");
                nom = Entrada.readLine();
                if(nom.equals("!")) break;
                
                System.out.print("preu max.> ");
                textPreu = Entrada.readLine();
                if(textPreu.equals("!")) break;
                
                if(UtilString.esEnter(textPreu)) {
                    preu = Integer.parseInt(textPreu);
                } else if (textPreu.isBlank()){
                    preu = -1;
                } else {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
                
                System.out.print("estoc min.> ");
                textEstoc = Entrada.readLine();
                if(textEstoc.equals("!")) break;
                
                if(UtilString.esEnter(textEstoc)) {
                    estoc = Integer.parseInt(textEstoc);
                }else if(textEstoc.isBlank()) {
                    estoc = -1;
                } else {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
                
                System.out.print("lloc> ");
                lloc = Entrada.readLine();
                if(lloc.equals("!")) break;
                
                System.out.print("D.O.> ");
                origen = Entrada.readLine();
                if(origen.equals("!")) break;
                
                System.out.print("tipus> ");
                tipus =Entrada.readLine();
                if(tipus.equals("!")) break;
                
                System.out.print("collita> ");
                collita = Entrada.readLine();
                if(collita.equals("!")) break;
                break;
            }
            try{
                Vi busca = botiga.cerca(new Vi(ref,nom,preu,estoc,lloc,origen,tipus,collita));        
               // System.out.println("1sdfdsf");
                if (busca == null) {
                    busca = botiga.cerca();
                    if(busca !=null){
                        System.out.println("Trobat:\n"+busca);
                    }
                    return;
                } else {
                    System.out.println("Trobat:\n"+busca);
                }
            } catch (Exception e){
                    System.out.println(e);
            }
        }
    }

    

    public void processaAfegeix() throws Exception {
        
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) {
            return;
        }
        nom = Vi.normalitzaString(nom);
        
        
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
        try{
            if (botiga.afegeix(vi) == null) {
                System.out.println("ERROR: no s'ha pogut afegir");
                return;
            }
        } catch (Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Introduït:");
            System.out.println(vi);
       }
    }
    
    public void processaModifica()  throws Exception{
        System.out.print("nom (enter cancel·la)> ");
        String nom= Entrada.readLine();
        if (nom.isEmpty()) return;
        nom=Vi.normalitzaString(nom);
        
        try{
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
            
        } catch (Exception e){
            System.out.println(e);
        }
    
        
    
    
    }
    private void processaElimina()  throws Exception{
        try{
            System.out.print("nom (enter cancel·la)> ");
            String nom = Entrada.readLine();
            if (nom.isEmpty()) return;
            nom = Vi.normalitzaString(nom);
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
        }catch (Exception e){
        System.out.println(e);
        }
    }
    
    public static int contarVins() throws IOException {
        int num = 0;
        String linia ="";
        String file = "botiga.csv";
        BufferedReader input = new BufferedReader(new FileReader(file));
        while (true) {
            linia = input.readLine();
            if (linia == null) break;
            
            String[] viAr = linia.split(";");
            if(Vi.deArrayString(viAr)==null) continue;
            num++;
            
        }
        input.close();
        return num;
    }
    public static int comptaReferencies() throws IOException {
        File fitxer = new File("botiga.csv");
        Entorn entorn=new Entorn();
        sbotiga.iniciaRecorregut();
        if (fitxer.isFile()) {
            BufferedReader input = new BufferedReader(new FileReader("botiga.csv"));
            String line = input.readLine();
            int a = 0;
            while (true) {
                if (line == null) {
                    break;
                }
                String[] array = line.split(";");
                if (array.length == 8 && UtilString.esEnter(array[2]) && UtilString.esEnter(array[3]) && UtilString.esEnter(array[7])) {
                    a++;
                }
                line = input.readLine();
            }
            input.close();
            if (a> entorn.botiga.getMax()){
                return entorn.botiga.getMax();

            }
            return a;
        }
        return 0;
    }

    public static int comptaReferenciesTotal() throws IOException {
        File fitxer = new File("botiga.csv");
        Entorn entorn=new Entorn();
        sbotiga.iniciaRecorregut();
        if (fitxer.isFile()) {
            BufferedReader input = new BufferedReader(new FileReader("botiga.csv"));
            String line = input.readLine();
            int a = 0;
            while (true) {
                if (line == null) {
                    break;
                }
                String[] array = line.split(";");
                if (array.length == 8 && UtilString.esEnter(array[2]) && UtilString.esEnter(array[3]) && UtilString.esEnter(array[7])) {
                    a++;
                }
                line = input.readLine();
            }
            input.close();

            return a;
        }

        return 0;
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





