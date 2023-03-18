
/*
 *
 *
 * aquest archiu usaGats inclou una serie de text per comprovar els altres diferents archius com ara 
 * gat, GatRenat i Garfield per saber si esta tot be i funciona,
 * la classe base s'anomena Gat i dues subclasses anomenades GatRenat i Garfield.
 * Cada objecte de gat té un nom, vides i una posició, i pot realitzar accions com ara seure, estar dret i estirat.
 *
 *
 */




class UsaGats{
    public static void main(String[] args) {
        Gat[] gats = new Gat[] {
            new Gat("Misifú"),
            new GatRenat(),
            new Garfield()
        };
        for (Gat gat: gats) {
            System.out.println("Entrenant el gat " + gat.getNom());
            System.out.println(gat.getNom() + " diu: "+ gat.seu());
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
            System.out.println(gat.getNom() + " diu: "+ gat.estirat());
            System.out.println();
        }
    }
}





