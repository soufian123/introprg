/*es una classe que el que fa es provar el meu gestor lite per veure si va be i fer els testos per que els pasi*/


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
public class TestGestor {

    @Test
    public void testInforme() {
        // Crear una nova instància del client demo
        Client client = GestorLite.creaClientDemo();

        // Definir el valor esperat
        String valorEsperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n" +
            "\tSeat 600: 90.0€\n" +
            "\tTata Vista: 180.0€\n" +
            "\tFiat Uno: 540.0€\n" +
            "Import a pagar: 810.0€\n" +
            "Punts guanyats: 4\n";


        // Cridar informe() i guardar el seu resultat com a valor obtingut
        String valorObtingut = client.informe();

        // Comparar el valor esperat amb el valor obtingut
        assertEquals(valorEsperat, valorObtingut);
    }
    
    @Test
    public void capLloguer(){
        new Lloguer();
    } 
    
    
    @Test
    public void constructor() {
        new Lloguer(new Vehicle("Seat","600",Vehicle.BASIC), 1);
    }
    
    
    @Test
    public void capClient(){
        new Client();
    } 
    
    
    @Test
    public void constructorClient() {
        new Client("51590695Q","Eugènia Salinas Roig","93614214242");
    }
    
    @Test
    public void capVehicle(){
        new Vehicle();
    } 
    
    
    @Test
    public void constructorVehicle() {
        new Vehicle("Seat","600",Vehicle.BASIC);
    }
    
    
    
    
    
    @Test
    public void testVehicleBasicUn() {
        Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
        Lloguer lloguer = new Lloguer(new Vehicle("Seat","600",Vehicle.BASIC), 1);
        client.addLloguers(lloguer);

        assertEquals(lloguer, client.getLloguers().get(0));
    }
    
    @Test
    public void testVehicleBasicDos() {
        Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
        Lloguer lloguer = new Lloguer(new Vehicle("Seat","600",Vehicle.BASIC), 2);
        client.addLloguers(lloguer);

        assertEquals(lloguer, client.getLloguers().get(0));
    }

    @Test
    public void testVehicleBasicTres() {
        Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
        Lloguer lloguer = new Lloguer(new Vehicle("Seat","600",Vehicle.BASIC), 3);
        client.addLloguers(lloguer);

        assertEquals(lloguer, client.getLloguers().get(0));
    }
    @Test
    public void testVehicleBasicCinco() {
        Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
        Lloguer lloguer = new Lloguer(new Vehicle("Seat","600",Vehicle.BASIC), 5);
        client.addLloguers(lloguer);

        assertEquals(lloguer, client.getLloguers().get(0));
    }
    /*rgsfdughfdsilkhgslfdkjghfdslkjh*/
    @Test
    public void testVehicleBasicDosVehicles() {
        Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
        Lloguer lloguer1 = new Lloguer(new Vehicle("Seat","600",Vehicle.BASIC), 1);
        client.addLloguers(lloguer1);
        Lloguer lloguer2 = new Lloguer(new Vehicle("Seattt","60000",Vehicle.BASIC), 1);
        client.addLloguers(lloguer2);
        assertEquals(lloguer1, client.getLloguers().get(0));
        assertEquals(lloguer2, client.getLloguers().get(1));
    }
    
    @Test
    public void testVehicleBasicDosVehiclesDos() {
        Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
        Lloguer lloguer1 = new Lloguer(new Vehicle("Seat","600",Vehicle.BASIC), 2);
        client.addLloguers(lloguer1);
        Lloguer lloguer2 = new Lloguer(new Vehicle("Seattt","60000",Vehicle.BASIC), 2);
        client.addLloguers(lloguer2);
        assertEquals(lloguer1, client.getLloguers().get(0));
        assertEquals(lloguer2, client.getLloguers().get(1));
    }
    @Test
    public void testVehicleBasicDosVehiclesTres() {
        Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
        Lloguer lloguer1 = new Lloguer(new Vehicle("Seat","600",Vehicle.BASIC), 3);
        client.addLloguers(lloguer1);
        Lloguer lloguer2 = new Lloguer(new Vehicle("Seattt","60000",Vehicle.BASIC), 3);
        client.addLloguers(lloguer2);
        assertEquals(lloguer1, client.getLloguers().get(0));
        assertEquals(lloguer2, client.getLloguers().get(1));
    }
    
    @Test
    public void testVehicleBasicDosVehiclesCinco() {
        Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
        Lloguer lloguer1 = new Lloguer(new Vehicle("Seat","600",Vehicle.BASIC), 5);
        client.addLloguers(lloguer1);
        Lloguer lloguer2 = new Lloguer(new Vehicle("Seattt","60000",Vehicle.BASIC), 5);
        client.addLloguers(lloguer2);
        assertEquals(lloguer1, client.getLloguers().get(0));
        assertEquals(lloguer2, client.getLloguers().get(1));
    }

}



