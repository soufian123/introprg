//programa que ens permet comprobar el exercici dhora per validar si tot ha anat be


public class UsaHora {

    public static void main(String[] args) {

        System.out.println("Intentarem crear una hora amb valors no vàlids");

        try {

            Hora hora = new Hora(-1, 1, 1);

        } catch (IllegalArgumentException e) {

            System.out.println("Argument il·legal!");

        }

    }

}
