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
    private static final double DIES_BASIC = 3;
    private static final double DIES_GENERAL = 2;
    private static final double MULTIPLE_BASIC = 1.5;
    private static final double QUANTITAT_GENERAL = 4;
    private static final double MULTIPLE_GENERAL = 2.5;
    private static final double MULTIPLE_LUXE = 6;
    public double sumaQuantitats(){
        double quantitatTotal = 0;
        switch (getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitatTotal += DIES_BASIC;
                if (getDies() > DIES_BASIC) {
                    quantitatTotal += (getDies() - DIES_BASIC) * MULTIPLE_BASIC;
                }
                break;
            case Vehicle.GENERAL:
                quantitatTotal += QUANTITAT_GENERAL;
                if (getDies() > DIES_GENERAL) {
                    quantitatTotal += (getDies() - DIES_GENERAL) * MULTIPLE_GENERAL;
                }
                break;
            case Vehicle.LUXE:
                quantitatTotal += getDies() * MULTIPLE_LUXE;
                break;
        }
        
        return quantitatTotal;
    }
    public int bonificacions(){
        int bonificacions=0;
        // afegeix lloguers freqüents
        bonificacions ++;

        // afegeix bonificació per dos dies de lloguer de Luxe
        if (getVehicle().getCategoria() == Vehicle.LUXE &&
                getDies()>1 ) {
            bonificacions ++;
        }
        return bonificacions;
    }

    public int getDies()     { return dies; }
    public void setDies(int dies) { this.dies = dies; }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }

}



