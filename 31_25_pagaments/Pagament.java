/*
 *rograma que simuli una transacció amb la quantitat a pagar i la pagada, 
 *de manera que el programa indiqui si sobren o falten diners.
 *
 *El programa demanarà el preu en € i la quantitat de € pagada. A continuació compararà les dues 
 *quantitats i escriurà els € que falten per pagar o bé els que se han de tornar.
 */
 
 
 
        public class Pagament {
            public static void main(String[] args) {
            
            
            System.out.println("Preu?");
            int preu = Integer.parseInt(args[0]);
            System.out.println("Paga?");
            int paga = Integer.parseInt(args[0]);
            int resultat;
            
            if (preu<paga){
            resultat= paga - preu;
            System.out.println("sobren "+ resultat);
            } else if (paga<preu) {
                   resultat= preu - paga;
                   System.out.println("Falten "+ resultat);
                   }else if (preu == paga){
                         System.out.println("No sobra ni falta res");
            }
    }
}
            
            
