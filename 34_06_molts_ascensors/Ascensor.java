//programa que es un crea el numero que li diem dascensors i ens diu on esta en cada ascensor

public class Ascensor {

    public int pis;

    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[] ascensor= new Ascensor[quants];
        

        for(int a=0; a<=quants; a++){
            ascensor[a]= new Ascensor();
            ascensor[a].pis=a;
        }
        return ascensor;

    }


    public static void main(String[] args){
        
        if (Character.isDigit(args[0].charAt(0))){
            int quants= Integer.parseInt(args[0]);

            Ascensor[] ascensors = creaAscensors(quants);

            for (int i = 0; i < ascensors.length; i++) {

                System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);

            }
        }
        System.out.println("Cap ascensor");

    }

}
