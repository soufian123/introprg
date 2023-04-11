
/*
 *
 * aquest archiu GatRenat es una herencia de la classe base anomenada Gat .
 * Cada objecte de gat té un nom, vides i una posició, i pot realitzar accions com ara seure, estar dret i estirat.
 * pero en GatRenat es diu renat sempre i se li pot canviar les vides i la posicio
 *
 *
 *
 */

class GatRenat extends Gat{

    public GatRenat() {
        super("Renat",7, "estirat");
    }
    public GatRenat(int vides) {
        super("Renat", vides, "estirat");
    }

    public GatRenat(String posicio) {
        super("Renat", 7, posicio);
    }

    public GatRenat(int vides, String posicio) {
        super("Renat", vides, posicio);
    }
}
