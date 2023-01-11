//es un programa que simula el joc del 3 en ratlla

public class TresEnRatlla {
    public static void main(String[] args){
        // declaració de les files
        char[] fila0 = new char[3];
        char[] fila1 new char[3];
        char[] fila2 = new char[3];

        // inicialització de la fila 0
        fila0[0] = 'O';
        fila0[1] = '·';
        fila0[2] = 'X';

        // inicialització de la fila 1
        fila1[0] = 'X';
        fila1[1] = 'X';
        fila1[2] = 'X';

        // inicialització de la fila 2
        fila2[0] = 'O';
        fila2[1] = '·';
        fila2[2] = 'X';

        // mostra el taulell
        mostraFila(fila0);
        mostraFila(fila1);
        mostraFila(fila2);
    }

    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        for (int col=0; col<fila.length; col++) {
            System.out.print(fila[col]);
        }
        System.out.println();
    }
}
