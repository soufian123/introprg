/*

El programa Pilota mostra el contingut d'una taula de caràcters on la major part dels valors són el caracter '·' (un punt). Hi ha un, però, el 'O' que representa una pilota.

La pilota comença en la posició (0, 0) i, cada cop que el programa rep un salt de línia, incrementa en un la fila i la columna. Quan supera la darrera fila, torna a la primera. El mateix fa amb la columna.

La velocitat del canvi, doncs, depen de com de ràpid premem la tecla Enter.

Ah! I el programa finalitza quan li introduïm quelcom diferent a una cadena buida.

*/
public class Pilota {
    public static final int N_FILES = 9;
    public static final int N_COLS = 13;
    public static void netejaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void mostraCamp(char[][] camp) {
        for (int i=0; i<N_FILES; i++) {
            for (int j=0; j<N_COLS; j++) {
                System.out.print(camp[i][j]);
            }
            System.out.println();
        }
    }
    public static void netejaCamp(char[][] camp) {
        for (int i=0; i<N_FILES; i++) {
            for (int j=0; j<N_COLS; j++) {
                camp[i][j]= '·';
            }
            System.out.println();
        }
        //camp[0][0]= 'O';
        
    }
    public static void netejaPosicio(char[][] camp, int fila, int col) {
        
        System.out.print(camp[fila][col] = '·');
        
    }
    public static void posicionaPilota(char[][] camp, int fila, int col) {

        System.out.print(camp[fila][col] = 'O');

    }
    public static int seguentFila(int actual) {
        if(actual<9){
            actual++;
        }else{
            actual=0;
        }
        return actual; 
    }
    public static int seguentCol(int actual) {
        if(actual<13){
            actual++;
        }else{
            actual=0;
        }
        return actual;
    }
    public static void main(String[] args)  {
        char[][] camp = new char[N_FILES][N_COLS];
        netejaCamp(camp);
        int fila = 0;
        int col = 0;
        do {
            posicionaPilota(camp, fila, col);
            netejaPantalla();
            mostraCamp(camp);
            netejaPosicio(camp, fila, col);
            fila = seguentFila(fila);
            col = seguentCol(col);
            System.out.printf("%nEnter per continuar");
        } while (Entrada.readLine().isEmpty());
    }
}
