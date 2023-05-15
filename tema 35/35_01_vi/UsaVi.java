/*
 *
 * es el usa vi que tracta de verificar i usar tots els demes archius de la carpeta
 * per executarlo i verificar que tot els demes archius estiguin correcte.
 * 
 */

public class UsaVi {
    public static void main(String[] args) {
        System.out.println("Vi sense estoc" + new Vi("Roura blanc", 1234));
        Vi vi = new Vi("Roura blanc", 1234, 24);
        System.out.println("Vi amb estoc" + vi);
        vi.setPreu(vi.getPreu() + 120);  // incrementa preu del vi
        vi.setEstoc(vi.getEstoc() - 10); // decrementa el nombre d'ampolles
        System.out.println("Vi modificat" + vi);
    }
}
