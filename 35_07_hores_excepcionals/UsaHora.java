//programa que ens permet comprobar el exercici dhora per validar si tot ha anat be


public class UsaHora {

    private static void canviaHora(Hora hora, int hores, int minuts, int segons) {
        Hora hora = new Hora();
        hora.setHora(hora)
        

    }

    public static void main(String[] args) {

        Hora hora = new Hora();

        System.out.println("Inicialment " + hora);

        System.out.println("Si intentem assignar a hores un -1");

        canviaHora(hora, -1, hora.getMinuts(), hora.getSegons());

        System.out.println("El valor resultant és " + hora);

        System.out.println();


        System.out.println("Si intentem assignar a minuts un -1");

        canviaHora(hora, hora.getHores(), -1, hora.getSegons());

        System.out.println("El valor resultant és " + hora);

        System.out.println();


        System.out.println("Si intentem assignar a segons un -1");

        canviaHora(hora, hora.getHores(), hora.getMinuts(), -1);

        System.out.println("El valor resultant és " + hora);

        System.out.println();

    }

}
