/*
 * es la classe client que el que fa es emagatzemar la ifnormacio de les persones(client) 
 * tot el que te es en format string i el que te es un nif, el nom i el telefon
 * amb un metode informe 
 * 
 * 
 */


import java.util.ArrayList;
public class Client {
    private String nif;
    private String nom;
    private String telefon;
    private ArrayList<Lloguer> lloguers;
    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new ArrayList<Lloguer>();
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

    public String informe() {
    double total = 0; 
    int bonificacions = 0;
    String resultat = "Informe de lloguers del client " + getNom() + " (" + getNif() + ")\n";
    for (Lloguer lloguer : getLloguers()) {
        double quantitat = 0;
        switch (lloguer.getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitat += 3;
                if (lloguer.getDies() > 3) {
                    quantitat += (lloguer.getDies() - 3) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += 4;
                if (lloguer.getDies() > 2) {
                    quantitat += (lloguer.getDies() - 2) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                quantitat += lloguer.getDies() * 6;
                break;
        }
        // afegir cost de la opció GPS si es dóna el cas
        if (lloguer.getVehicle().getCategoria() == Vehicle.LUXE && lloguer.getVehicle().getGPS()) {
            quantitat += lloguer.getDies() * 2.5;
        }
        // afegir bonificació per dos dies de lloguer de Luxe
        if (lloguer.getVehicle().getCategoria() == Vehicle.LUXE && lloguer.getDies() > 1) {
            bonificacions ++;
        }
        // afegeix lloguer a l'informe
        resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (quantitat * 30) + "€\n";
        total += quantitat * 30;
    }
    // afegeix informació de les bonificacions al final de l'informe
    resultat += "Import a pagar: " + total + "€\n";
    resultat += "Punts guanyats: " + bonificacions + "\n";
    return resultat;


    }
}
