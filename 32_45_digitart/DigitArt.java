 /* el programa construeix 3 taules i substitueix els enters per les X */
 
 
public class DigitArt {
    public static char[][] construeix1() {
        return new char[][] {
            {'·', '·', '·', '·', '·'},
                {'·', 'X', 'X', '·', '·'},
                {'·', '·', 'X', '·', '·'},
                {'·', '·', 'X', '·', '·'},
                {'·', '·', 'X', '·', '·'},
                {'·', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', '·'}
       };
   }
   public static char[][] construeix2() {
       return new char[][] {
                {'·', '·', '·', '·', '·', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', 'X', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', 'X', '·', '·', '·', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', '·', '·'},
        };
    }
    public static char[][] construeix3() {
       return new char[][] {
                {'·', '·', '·', '·', '·', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', 'X', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', 'X', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', '·', '·'},
        };
    }
    public static void mostraResultat(char[][] origen, char[][] resultat) {
        /* XXX */
        for(int i=0; i<7; i++){
            for(int a=0; a<5; a++){
                System.out.print(origen[i][a]);
            }
            System.out.print(" -> ");
            for(int a=0; a<5; a++){
                System.out.print(resultat[i][a]);
            }
            System.out.println();
        }
    }
    public static void processaCaracter(char ch) {
        char[][] origen;
        switch (ch) {
            case '1': origen = construeix1();
                      break;
            case '2': origen = construeix2();
                      break;
            case '3': origen = construeix3();
                      break;
            default: return;    // no conec aquest caràcter
        }
        char[][] desti = UtilTaula.substitueix(origen, 'X', ch);
        mostraResultat(origen, desti);
        System.out.println();
    }
    public static void processaArgument(String arg) {
        /* XXX crida a processaCaracter() per cada caracter de arg */
        
        for(int a=0; a<arg.length(); a++){
            processaCaracter(arg.charAt(a));
        }
        
    }
    public static void main(String[] args){
        // comprova que com a mínim hi hagi un argument
        /* XXX */
        if (args.length==0){
            return;
        }
        
        // processa cada argument
        /* XXX crida a processaArgument() per cada argument */
        for(int a=0; a<args.length; a++){
            processaArgument(args[a]);
        }
        
    }
}
