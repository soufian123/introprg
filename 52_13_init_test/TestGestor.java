/*es una classe que el que fa es provar el meu gestor lite per veure si va be i fer els testos per que els pasi*/


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestGestor {
  
  @Test
  public void testInforme() {
    // Crear una nova instància del client demo
    Client client = GestorLite.creaClientDemo();
    
    // Definir el valor esperat
    String valorEsperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n" + 
                          "  	Seat 600: 90.0€" +
                          "  	Tata Vista: 180.0€" +
                          "  	Fiat Uno: 540.0€" +
                          "Import a pagar: 810.0€" +
                          "Punts guanyats: 4";
    
    // Cridar informe() i guardar el seu resultat com a valor obtingut
    String valorObtingut = client.informe();
    
    // Comparar el valor esperat amb el valor obtingut
    assertEquals(valorEsperat, valorObtingut);
  }
  
}


