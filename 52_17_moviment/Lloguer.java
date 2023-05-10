/*
 * 
 *
 * es la classe Lloguer que el que fa es emagatzemar la ifnormacio del lloguer 
 * tot el que te es en format int i son els dies
 * amb un contreuctor Lloguer 
 *
 *
 */

import java.util.*;
public class Lloguer {
    private int dies=0;
    private Vehicle vehicle= new Vehicle("cap","vehicle",Vehicle.LUXE);
    
    public Lloguer(Vehicle vehicle,int dies) {
        setDies(dies);
        setVehicle(vehicle);
    }
    
    public Lloguer() {
    }
    public double quantitatPerLloguer(Lloguer lloguer){
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
            
            return quantitat;
        }

    public int getDies()     { return dies; }
    public void setDies(int dies) { this.dies = dies; }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }

}



