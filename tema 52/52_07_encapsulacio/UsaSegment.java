
/* 
 * Es el Usa Segment que el que fa es anar fent les crides necessaries o 
 * Utilitzes com be diu el nom, el programa Segment perque ens vagi ensenyant 
 * tota la informacio de la que li anem dient.
 */



public class UsaSegment {
    public static void main(String[] args){

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int num=args.length;
        if (num<4) num=4;
        String[] xy = new String[4];

        for (int a= 0; a<args.length; a++){
            if(a==4) break;
            if (UtilString.esEnter(args[a])){
                xy[a]=args[a];
            }else{
                xy[a]="0";
            }
        }
        for (int a= args.length; a<4; a++){
            xy[a]="0";
        }
        x1 = Integer.parseInt(xy[0]);
        y1 = Integer.parseInt(xy[1]);// args[1] si hi és i és enter, o 0 altrament
        x2 = Integer.parseInt(xy[2]);// args[2] si hi és i és enter, o 0 altrament
        y2 = Integer.parseInt(xy[3]);// args[3] si hi és i és enter, o 0 altrament
        
        Punt punt1 = new Punt(x1, y1);
        Punt punt2 = new Punt(x2, y2);
        Segment segment1 = new Segment(punt1, punt2);
        Segment segment2 = new Segment();
        segment2.setP1(segment1.getP2());
        segment2.setP2(segment1.getP1());
        System.out.printf("p1: %s%n", punt1);
        System.out.printf("p2: %s%n", punt2);
        System.out.printf("s1: %s s1.longitud: %.02f%n", segment1, segment1.longitud());
        System.out.printf("s2: %s s2.longitud: %.02f%n", segment2, segment2.longitud());
    }
    
}
