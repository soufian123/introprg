
/*"Origen" és una enumeració que s'utilitza per representar els possibles orígens dels vins.
 * tambe en te metodes com el descr o toString
 * 
 */



public enum Origen {
    PENEDES("Penedès"),
    TERRA_ALTA("Terra Alta"),
    CATALUNYA("Catalunya"),
    TARRAGONA("Tarragona"),
    CONCA_DE_BARBERA("Conca de Barberà"),
    COSTERS_DEL_SEGRE("Costers del Segre"),
    EMPORDA("Empordà"),
    MONTSANT("Montsant"),
    PRIORAT("Priorat"),
    ALELLA("Alella"),
    PLA_DE_BAGES("Pla de Bages"),
    ALTRE("altre");

    private final String descr;
        Origen(String descr) {
            this.descr = descr;
        }

    @Override
    public String toString() {
        return descr;
    }
}

