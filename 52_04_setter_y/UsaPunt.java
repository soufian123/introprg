/* 
 * Es el Usa Punt que el que fa es anar fent les crides necessaries o 
 * Utilitzes com be diu el nom, el programa Punt perque ens vagi ensenyant 
 * tota la informacio de la que li anem dient.
 */



public class UsaPunt {
    public static void main(String[] args){
        Punt punt = new Punt();
        
        int x = 0; // args[0] si hi és i és enter, o 0 altrament
        int y = 0; //  args[1] si hi és i és enter, o 0 altrament
        if (args.length == 2) {
            if (UtilString.esEnter(args[0])) {
                x = Integer.parseInt(args[0]);
            }
            if (UtilString.esEnter(args[1])) {
                y = Integer.parseInt(args[1]);
            }
        } else if (args.length == 1) {
            if (UtilString.esEnter(args[0])) {
                x = Integer.parseInt(args[0]);
            }
        }

        punt.setX(x);
        punt.setY(y);
        System.out.printf("punt.getX() -> %d%n", punt.getX());
        System.out.printf("punt.getY() -> %d%n", punt.getY());
    }
}

