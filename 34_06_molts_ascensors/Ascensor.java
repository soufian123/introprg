//programa que es un crea el numero que li diem dascensors i ens diu on esta en cada ascensor

public class Ascensor {

    public int pis;

    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[] ascensor= new Ascensor(quants);
        

        for(int a=0; a<=quants; a++){
            ascensor.pis=a;
            ascensor[a]=ascensor.pis;
        }
        return ascensor;

    }


    public static void main(String[] args){
        
        if (args[0].isDigit()){
            int quants= Integer.parseInt(args[0]);

            Ascensor[] ascensors = creaAscensors(quants);

            for (int i = 0; i < ascensors.length; i++) {

                System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);

            }
        }
        System.out.println("Cap ascensor");

    }

}
