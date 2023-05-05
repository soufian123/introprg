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
        return new Client("51590695Q","Eugènia Salinas Roig","93614214242");
    }
    
    public static void mostraClient(Client client){
        System.out.println("Client: " + client.getNom());
        System.out.println("\t" + client.getNif());
        System.out.println("\t" + client.getTelefon());
    }
    

    
    
}


