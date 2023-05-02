/* 
 * Es el Usa Punt que el que fa es anar fent les crides necessaries o 
 * Utilitzes com be diu el nom, el programa Punt perque ens vagi ensenyant 
 * tota la informacio de la que li anem dient.
 */



public class UsaPunt {
    public static void main(String[] args){
        Punt punt = new Punt();
        if (!UtilString.esEnter(args[0]) || args[0]==null){
            args[0]="0";
        }
        if (!UtilString.esEnter(args[1]) || args[1]==null){
            args[1]="0";
        }
        
        
        int x = Integer.parseInt(args[0]); // args[0] si hi és i és enter, o 0 altrament
        int y = Integer.parseInt(args[1]); //  args[1] si hi és i és enter, o 0 altrament
        punt.setX(x);
        punt.setY(y);
        System.out.printf("punt.getX() -> %d%n", punt.getX());
        System.out.printf("punt.getY() -> %d%n", punt.getY());
    }
}

