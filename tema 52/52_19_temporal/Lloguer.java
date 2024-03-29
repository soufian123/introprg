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
    public double quantitat(){
            double quantitat = 0;
            switch (getVehicle().getCategoria()) {
                case Vehicle.BASIC:
                    quantitat += 3;
                    if (getDies() > 3) {
                        quantitat += (getDies() - 3) * 1.5;
                    }
                    break;
                case Vehicle.GENERAL:
                    quantitat += 4;
                    if (getDies() > 2) {
                        quantitat += (getDies() - 2) * 2.5;
                    }
                    break;
                case Vehicle.LUXE:
                    quantitat += getDies() * 6;
                    break;
            }
            
            return quantitat;
        }

    public int getDies()     { return dies; }
    public void setDies(int dies) { this.dies = dies; }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }

}



