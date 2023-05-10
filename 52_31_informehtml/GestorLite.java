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
        
        System.out.println(client.informeHTML());

            
            String valorEsperat =  "<p>Informe de lloguers del client <em>Eugènia Salinas Roig</em> (<strong>51590695Q</strong>)</p>\n"
    +"<table>\n"
    +"  <tr>\n"
    +"    <td><strong>Marca</strong></td>\n"
    +"    <td><strong>Model</strong></td>\n"
    +"    <td><strong>Import</strong></td>\n"
    +"  </tr>\n"
    +"  <tr><td>Seat</td><td>600</td><td>90.0€</td></tr>\n"
    +"  <tr><td>Tata</td><td>Vista</td><td>180.0€</td></tr>\n"
    + "  <tr><td>Fiat</td><td>Uno</td><td>540.0€</td></tr>\n"
    +"</table>\n"
    +"<p>Import a pagar: <em>720.0€</em></p>\n"
    +"<p>Punts guanyats: <em>4</em></p>";
            System.out.println(valorEsperat);
    }

}





