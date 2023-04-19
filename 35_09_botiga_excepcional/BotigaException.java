

/*
 * aquest programa o archiu es la botiga, la botiga gestiona v en te tot els seu inventari
 * on un dels seus inventaris es el vi, gestionarem la botiga v posare v eliminarem 
 * els productes que volguem, en aquest cas es el vi.
 *
 */



@SuppressWarnings("serial")
    public class BotigaException extends Exception throws Exception {
        public BotigaException(){
            super("Botiga plena");
        }
        public BotigaException(String missatge){
            super(missatge);
        }
    }
