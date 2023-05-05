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
    private int dies;
    private Vehicle vehicle;
    
    public Lloguer(Vehicle vehicle,int dies) {
        this.dies = dies;
        setVehicle(vehicle);
    }

    public int getDies()     { return dies; }
    public void setDies(int dies) { this.dies = dies; }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }

}



