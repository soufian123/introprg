

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

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Entorn {
    private final Botiga botiga = new Botiga();
    public static void main(String[] args) throws IOException {
        boolean continua = true;
        int vinsContats = 0;
        String file = "botiga.csv";
        Entorn entorn = new Entorn();
        FileWriter fitxer = new FileWriter(file,true);
        fitxer.close();
        BufferedReader input = new BufferedReader(new FileReader(file));
        while (true) {
            String vi = input.readLine();
            if(vi==null){break;} 
            String[] viArray = vi.split(";");
            Vi nouVi = Vi.deArrayString(viArray);
            if(nouVi == null){continue;}
            else {
                entorn.botiga.afegeix(nouVi);
            }
        }
        input.close();
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
        System.out.printf("Referències llegides: %s\n",contaVins());
        while(continua) {
            System.out.print("botiga> ");
            String entrada = Entrada.readLine().strip();
            if(entrada.isEmpty()){continue;}
            if(entrada.equals("surt")){break;}
            switch(entrada) {
                case "ajuda" : mostraAjuda();
                            break;
                case "afegeix" : System.out.println("Comanda temporalment no disponible");//entorn.procesaAfegeix();
                            break;
                case "cerca" : entorn.procesaCerca();
                            break;
                case "modifica" : System.out.println("Comanda temporalment no disponible");//entorn.procesaModifica();
                            break;
                case "elimina" : System.out.println("Comanda temporalment no disponible");//entorn.procesaElimina();
                            break;
                default: mostraErrorComandaDesconeguda();
            }
        }
        entorn.botiga.iniciaRecorregut();
        entorn.guardaVins();
        vinsContats = contaVins();
        //System.out.printf("Referències guardades: %s\n",vinsContats);
        System.out.println("adéu");
    }

    // Mostra ajuda
    public static void mostraAjuda() {
        System.out.println("Comandes disponibles:\najuda\ncerca\nsurt");
    }
    // Afegeix vi
    /*
    public void procesaAfegeix() {
        String entrada = "";
        System.out.print("nom (enter cancel·la)> ");
        entrada = Entrada.readLine();
        if(entrada.isBlank()) {return;}
        System.out.print("preu (en cèntims)> ");
        String preu = Entrada.readLine();
        if (preu.isBlank()) {
            preu = "0";
        } else if (!UtilString.esEnter(preu)){
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } else if (Integer.parseInt(preu)<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } 
        System.out.print("estoc (enter sense estoc)> ");
        String stock = Entrada.readLine();
        if (stock.isBlank()) {
            stock = "0";
        }else if (!UtilString.esEnter(stock)) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } else if (Integer.parseInt(stock)<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } 
        Vi nouVi = new Vi(entrada,Integer.parseInt(preu),Integer.parseInt(stock));
        if (botiga.afegeix(nouVi)==null) {
            System.out.println("ERROR: no s'ha pogut afegir");
        } else {
            botiga.afegeix(nouVi);
            System.out.println("Introduït:\n"+nouVi);
        }
    }
    */
    // Funcio cerca vi
    public void procesaCerca() {
        String entrada = "";
        int precio = -1;
        int estoc = -1;
        String nom="";
        String preu="";
        String stock="";
        String lloc="";
        String deo="";
        String tipus="";
        String collita="";
        System.out.print("ref> ");
        entrada = Entrada.readLine();
        if(entrada.equals("!")){return;}
        if(!entrada.isBlank()) {
            Vi cercat = botiga.cerca(entrada);
            if (cercat == null) {
                return; 
                //System.out.println("No trobat");
            } else {
                System.out.println("Trobat:\n"+cercat);
            }
        } else {
            while(true) {
                System.out.print("nom> ");
                nom = Entrada.readLine();
                if(nom.equals("!")){break;}
                System.out.print("preu max.> ");
                preu = Entrada.readLine();
                if(preu.equals("!")){break;}
                if(UtilString.esEnter(preu)) {
                    precio = Integer.parseInt(preu);
                } else if (preu.isBlank()){
                    precio = -1;
                } else {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
                System.out.print("estoc min.> ");
                stock = Entrada.readLine();
                if(stock.equals("!")){break;}
                if(UtilString.esEnter(stock)) {
                    estoc = Integer.parseInt(stock);
                }else if(stock.isBlank()) {
                    estoc = -1;
                } else {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
                System.out.print("lloc> ");
                lloc = Entrada.readLine();
                if(lloc.equals("!")){break;}
                System.out.print("D.O.> ");
                deo = Entrada.readLine();
                if(deo.equals("!")){break;}
                System.out.print("tipus> ");
                tipus =Entrada.readLine();
                if(tipus.equals("!")){break;}
                System.out.print("collita> ");
                collita = Entrada.readLine();
                if(collita.equals("!")){break;}
                break;
            }
            Vi viABuscar = new Vi(entrada,nom,precio,estoc,lloc,deo,tipus,collita);
            Vi cercat = botiga.cerca(viABuscar);
            if (cercat == null) {
                cercat = botiga.cerca();
                if(cercat !=null){
                    System.out.println("Trobat:\n"+cercat);
                }
                return;
            } else {
                System.out.println("Trobat:\n"+cercat);
            }
        }
    }
    // Permite modificar vinos
    public void procesaModifica() {
        String entrada = "";
        System.out.print("nom (enter cancel·la)> ");
        entrada = Entrada.readLine();
        if(entrada.isBlank()) {return;}
        Vi cercat = botiga.cerca(entrada);
        if(cercat==null) {
            System.out.println("No trobat");
            return;
        }
        System.out.printf("preu (enter %s)> ",cercat.getPreu());
        String preu = Entrada.readLine();
        if (preu.isBlank()) {
            preu = Integer.toString(cercat.getPreu());
        } else if (!UtilString.esEnter(preu)){
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } else if (Integer.parseInt(preu)<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } 
        System.out.printf("estoc (enter %s)> ",cercat.getEstoc());
        String stock = Entrada.readLine();
        if (stock.isBlank()) {
            stock = Integer.toString(cercat.getEstoc());
        }else if (!UtilString.esEnter(stock)) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } else if (Integer.parseInt(stock)<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        int precio = Integer.parseInt(preu);
        int estoc = Integer.parseInt(stock);
        Vi modificat = botiga.modificaVi(entrada, precio, estoc);
        System.out.println("Modificat:\n"+botiga.cerca(entrada));
    }
    // ELimina vi
    public void procesaElimina() {
        String entrada ="";
        System.out.print("nom (enter cancel·la)> ");
        entrada = Entrada.readLine();
        if(entrada.isBlank()){return;}
        Vi cercat = botiga.cerca(entrada);
        if (cercat == null) {
            System.out.println("No trobat");
            return;
        }
        System.out.println("A eliminar:\n"+botiga.cerca(entrada));
        System.out.print("Segur?> ");
        if (UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())) {
            cercat = botiga.elimina(entrada);
            if (cercat == null) {
                System.out.println("ERROR: no s'ha pogut eliminar");
            } else {
                System.out.println("Eliminat");
            }
        } else {
            System.out.println("No eliminat");
        }
    }
    public static void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }
    // Funcion que devuelve un int con le numero de lineas que tiene un archivo
    public static int contaVins() throws IOException {
        String file = "botiga.csv";
        BufferedReader input = new BufferedReader(new FileReader(file));
        int contador = 0;
        String linia ="";
        while (true) {
            linia = input.readLine();
            if (linia == null) {break;}
            else {
                String[] viArray = linia.split(";");
                if(Vi.deArrayString(viArray)==null){continue;}
                else {contador++;}
            }
        }
        input.close();
        return contador;
    }

    //Funcion que guarda vinos
    private void guardaVins() throws IOException {
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




