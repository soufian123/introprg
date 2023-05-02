/* 
 * Es el Usa Punt que el que fa es anar fent les crides necessaries o 
 * Utilitzes com be diu el nom, el programa Punt perque ens vagi ensenyant 
 * tota la informacio de la que li anem dient.
 */


 public class UsaPunt {
     public static void main(String[] args){
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int num=args.length;
        if (num<4) num=4;
        String[] xy = new String[num];

        for (int a= 0; a<args.length; a++){
            if (UtilString.esEnter(args[a])){
                xy[a]=args[a];
            }
        }
        for (int a= args.length; a<4; a++){
            xy[a]="0";
        }

        x1 = Integer.parseInt(xy[0]);
        y1 = Integer.parseInt(xy[1]);// args[1] si hi és i és enter, o 0 altrament
        x2 = Integer.parseInt(xy[2]);// args[2] si hi és i és enter, o 0 altrament
        y2 = Integer.parseInt(xy[3]);// args[3] si hi és i és enter, o 0 altrament
            
        Punt p1 = new Punt(x1, y1);
        Punt p2 = new Punt(x2, y2);
        System.out.printf("p1: (%d, %d)%n", p1.getX(), p1.getY());
        System.out.printf("p2: (%d, %d)%n", p2.getX(), p2.getY());
        p1.suma(p2);
        System.out.printf("p1+p2: (%d, %d)%n", p1.getX(), p1.getY());
     }
 }

