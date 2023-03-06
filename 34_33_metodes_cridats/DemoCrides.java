/*
 * es la demo de les crides. El que fa aquest programa es anar cridant el programa Feli de tal forma que ens representi lo seguent
 * 
Neix Felí
Neix Felí
Neix Gat
Neix Felí
Neix Gat
Neix Renat
Felí neteja urpes des de class Feli
Felí neteja urpes des de class Gat
Felí neteja urpes des de class GatRenat
Gat miola des de class Gat
Renat miola des de class GatRenat
Neix Menjar("bacallà")
Renat menja bacallà des de class GatRenat
Felí neteja urpes des de class GatRenat
Gat menja bacallà des de class GatRenat
Felí menja bacallà des de class GatRenat
 * 
 */


public class DemoCrides{
    
    public static void main (String[] args){
        Feli feli = new Feli();
        Gat gat = new Gat();
        GatRenat renat = new GatRenat();
        feli.netejaUrpes();
        gat.netejaUrpes();
        renat.netejaUrpes();
        gat.miola();
        renat.miola();
        Menjar menjar = new Menjar("bacallà");
        renat.menja(menjar);
    }

}
