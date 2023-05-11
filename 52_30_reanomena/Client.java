/*
 * es la classe client que el que fa es emagatzemar la ifnormacio de les persones(client) 
 * tot el que te es en format string i el que te es un nif, el nom i el telefon
 * amb un metode informe 
 * 
 * 
 */


import java.util.ArrayList;
public class Client {
    private String nif="null";
    private String nom="null";
    private String telefon="null";
    private static final double EUROS_PER_UNITAT_DE_COST = 30;
    
    private ArrayList<Lloguer> lloguers;
    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new ArrayList<Lloguer>();
    }
    public Client() {
    }

    public String getNif()     { return nif; }
    public String getNom()     { return nom; }
    public String getTelefon() { return telefon; }
    public ArrayList<Lloguer> getLloguers() { return lloguers; }
    public void addLloguers(Lloguer lloguer) { 
        lloguers.add(lloguer);
    }

    
    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) { this.telefon = telefon; }
    

    
    /*
    public String informe() {
        double total = 0;
        int bonificacions = 0;
        String resultat = "Informe de lloguers del client " +
            getNom() +
            " (" + getNif() + ")\n";
        for (Lloguer lloguer: lloguers) {
            

            // afegeix lloguers freqüents
            bonificacions ++;

            // afegeix bonificació per dos dies de lloguer de Luxe
            if (lloguer.getVehicle().getCategoria() == Vehicle.LUXE &&
                    lloguer.getDies()>1 ) {
                bonificacions ++;
            }

            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                (lloguer.quantitat(lloguer) * 30) + "€" + "\n";
            total += lloguer.quantitat(lloguer) * 30;
        }

        // afegeix informació final
        resultat += "Import a pagar: " + total + "€\n" +
            "Punts guanyats: " + bonificacions + "\n";
        return resultat;
    }
    */

    private double importTotal(){
        double total=0;
        for (Lloguer lloguer: lloguers) {
            total += lloguer.sumaQuantitats() * EUROS_PER_UNITAT_DE_COST;
        }
        return total;
    }
    private double bonificacionsTotal(){
        int bonificacions=0;
        for (Lloguer lloguer: lloguers) {
            bonificacions += lloguer.bonificacions();
        }
        return bonificacions;
    }
    private String composaCapsalera(){
        return "Informe de lloguers del client " +
            getNom() +
            " (" + getNif() + ")\n";
    }
    private String composaDetall(){
        String resultat="";
        for (Lloguer lloguer: lloguers) {

            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                ( lloguer.sumaQuantitats() * EUROS_PER_UNITAT_DE_COST) + "€" + "\n";
        }
        return resultat;
    }
    private String composaPeu(){
        return "Import a pagar: " + importTotal() + "€\n" +
            "Punts guanyats: " + bonificacionsTotal() + "\n";
    }
    
    
    public String informe() {
        return composaCapsalera() +
           composaDetall() +
           composaPeu();

    }
}
