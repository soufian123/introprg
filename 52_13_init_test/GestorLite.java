/*
 * es En aquest exercici codificaràs la classe GestorLite que et
 * permetrà fer una prova bàsica del meu codi.
 * Utilitzan les altres classes.
 *
 */
 



class GestorLite{
    private Client client;

    public static void main(String[] args) {
        Client demo = creaClientDemo();
        mostraClient(demo);
    }
    public static Client creaClientDemo(){
        Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");     
        client.addLloguers(new Lloguer(new Vehicle("Seat","600",Vehicle.BASIC),2));
        client.addLloguers(new Lloguer(new Vehicle("Tata","Vista",Vehicle.BASIC),5));
        client.addLloguers(new Lloguer(new Vehicle("Fiat","Uno",Vehicle.LUXE),3));
        return client;
    }
    
    public static void mostraClient(Client client){
        System.out.println("Client: " + client.getNom());
        System.out.println("        " + client.getNif());
        System.out.println("        " + client.getTelefon());
        System.out.println("Lloguers: " + client.getLloguers().size());
        for (int a=0; a<client.getLloguers().size(); a++){
            
            System.out.println("        "+(a+1)+". vehicle: " + client.getLloguers().get(a).getVehicle().getMarca()+ " "+ client.getLloguers().get(a).getVehicle().getModel());
            System.out.println("           dies llogats: " + client.getLloguers().get(a).getDies());
        }
        String valorEsperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n" +
                          "\tSeat 600: 90.0€\n" +
                          "\tTata Vista: 180.0€\n" +
                          "\tFiat Uno: 540.0€\n" +
                          "Import a pagar: 810.0€\n" +
                          "Punts guanyats: 4\n";
        System.out.println(valorEsperat);
    }

}


