        /*
         *Programa que ordena 3 nombres
         *
         */
         

public class TresEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
           System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());
           System.out.println("Tercer?");
        int tercer = Integer.parseInt(Entrada.readLine());
        int un;
        int dos;
        int tres;
        
        if (primer<segon && segon<tercer) {
            un = (primer);
            dos = (segon);
            tres = (tercer);
                     System.out.println(un + ", " + dos + " i " + tres);
        } else { if (tercer<primer && primer<segon) {
             un = (tercer);
             dos = (primer);
             tres = (segon);
               System.out.println(un + ", " + dos + " i " + tres);
                } else { if (segon<tercer && tercer<primer) {
             un = (segon);
             dos = (tercer);
             tres = (primer);
                     System.out.println(un + ", " + dos + " i " + tres);
                     } else {
                     if (segon<primer && primer<tercer) {
             un = (segon);
             dos = (primer);
             tres = (tercer);
                     System.out.println(un + ", " + dos + " i " + tres);
             } else {
             if (tercer<segon && segon<primer) {
             un = (tercer);
             dos = (segon);
             tres = (primer);
               System.out.println(un + ", " + dos + " i " + tres);
                } else {if (primer<tercer && tercer<segon) {
            un = (primer);
            dos = (tercer);
            tres = (segon);
                    System.out.println(un + ", " + dos + " i " + tres);
        } else{}}}}}}
            
}
}
