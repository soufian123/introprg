    /* Joc de Tres en Ratlla */
    public class TresEnRatlla {
        public static void main(String[] args){


            
            
            // declaració del taulell
            char[][] taulell = new char[3][3];
            
            System.out.println("Comença el joc");

            // inicialització de la fila 0
            taulell[0][0] = '·';
            taulell[0][1] = '·';
            taulell[0][2] = '·';
            taulell[1][0] = '·';
            taulell[1][1] = '·';
            taulell[1][2] = '·';
            taulell[2][0] = '·';
            taulell[2][1] = '·';
            taulell[2][2] = '';
            

            // mostra la posició inicial del taulell
            mostraTaulell(taulell)
            int xo=0;
            while(){
                if(xo==0){
                    System.out.println("X?");
                    xo=1;
                }else if (xo==1){
                    System.out.println("O?");
                    xo=0;
                }
                
                // demana coordenades del moviment del jugador X
                int entrada = Integer.parseInt(Entrada.readLine());
                int fila = Integer.parseInt(entrada.charAt(0));
                int columna = Integer.parseInt(entrada.charAt(1));

                // marquem el nou moviment
                taulell[fila][columna] = 'X';

                // tornem a mostrar el taulell
                System.out.println("La posició final del taulell:");
                mostraFila(taulell[0]);
                mostraFila(taulell[1]);
                mostraFila(taulell[2]);
            }
    }

    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        for (int col = 0; col < fila.length; col++) {
            System.out.print(fila[col]);
        }
        System.out.println();
    }
    
    public static void mostraTaulell(char[][]){
        // mostra la posició inicial del taulell
        System.out.println("La posició inicial del taulell:");
        mostraFila(taulell[0]);     // mostra la línia 0
        mostraFila(taulell[1]);     // mostra la línia 1
        mostraFila(taulell[2]);     // mostra la línia 2
    }
    
    public static boolean casellaOcupada(char[][], int fila, int columna){
		if (taulell[fila][columna]=='·') {
			return false;
		} else {
			return true;
		}
    }
}



















