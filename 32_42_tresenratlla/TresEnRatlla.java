    /* Joc de Tres en Ratlla */
    public class TresEnRatlla {
        public static void main(String[] args){


            
            
            // declaració del taulell
            char[][] taulell = new char[3][3];
            
            

            // inicialització de la fila 0
            taulell[0][0] = '·';
            taulell[0][1] = '·';
            taulell[0][2] = '·';
            taulell[1][0] = '·';
            taulell[1][1] = '·';
            taulell[1][2] = '·';
            taulell[2][0] = '·';
            taulell[2][1] = '·';
            taulell[2][2] = '·';
            System.out.println("Comença el joc");
            String jugador = "X?";
            String jugadorDos = "O?";
		    String canviar = "";
		    String lloc="";
		    int fila=0;
		    int columna=0;
		    char persona='a';
            while (true){
                mostraTaulell(taulell);
			    System.out.println(jugador);
			    persona = jugador.charAt(0);
			    lloc = Entrada.readLine();
                if (lloc.equals("a")) {
				    System.out.println(persona + " abandona");
				    break;
			    }
			    fila = lloc.charAt(0)-48;
			    columna =lloc.charAt(1)-48;
			    if (casellaOcupada(taulell, fila, columna)){
			        System.out.println("Ocupada");
			        continue;
			    }
			    taulell[fila][columna] = persona;

			    if(jugadorGuanya(taulell, persona)) {
				    mostraTaulell(taulell);
				    System.out.println(persona + " guanya");
				    return;
			    }
			    if(hiHaEmpat(taulell)) {
				    System.out.println("Empat");
				    return;
			    }

			    canviar=jugador;
			    jugador=jugadorDos;
			    jugadorDos=canviar;

            }
        }

    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        for (int col = 0; col < fila.length; col++) {
            System.out.print(fila[col]);
        }
        System.out.println();
    }
    
    public static void mostraTaulell(char[][] taulell){
        // mostra la posició inicial del taulell
        mostraFila(taulell[0]);     // mostra la línia 0
        mostraFila(taulell[1]);     // mostra la línia 1
        mostraFila(taulell[2]);     // mostra la línia 2
    }
    public static boolean hiHaEmpat(char[][] tauler) {
		for (int i=0;i<3;i++){
			for(int c=0;c<3;c++){
				if(tauler[i][c]=='·') {
					return false;
				}
			}
		}
		return true;
	}
    
    public static boolean casellaOcupada(char[][] taulell, int fila, int columna){
		if (taulell[fila][columna]=='·') {
			return false;
		} else {
			return true;
		}
    }
    
    public static boolean jugadorGuanya(char[][] taulell, char jugador) {
        // comprova les columnes
        for (int i = 0; i < 3; i++) {
            if (taulell[0][i] == jugador && taulell[1][i] == jugador && taulell[2][i] == jugador) {
                return true;
            }
        }
        // comprova les files
        for (int i = 0; i < 3; i++) {
            if (taulell[i][0] == jugador && taulell[i][1] == jugador && taulell[i][2] == jugador) {
                return true;
            }
        }
 
 
        // comprova les diagonals
        if (taulell[0][0] == jugador && taulell[1][1] == jugador && taulell[2][2] == jugador) {
            return true;
        }
        if (taulell[0][2] == jugador && taulell[1][1] == jugador && taulell[2][0] == jugador) {
            return true;
        }
 
        return false;
    }
}



















