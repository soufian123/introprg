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
        
        if (primer<segon && segon<tercer) {
             System.out.println(primer + ", " + segon + " i " + tercer);
        } else {
                if (tercer<primer && primer<segon) {
                     System.out.println(tercer + ", " + primer + " i " + segon);
                } else {
                    if (segon<tercer && tercer<primer) {
                     System.out.println(segon + ", " + tercer + " i " + primer);
                     } else {System.out.println("error");}
                        
                                        

        }}
    }
}

