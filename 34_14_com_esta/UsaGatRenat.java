
 /*programa del gat renat on retorna boolens si esta viu, mort, estirat, assegut, dret...*/



public class UsaGatRenat {

    public static void main(String[] args) {

        GatRenat renat = new GatRenat();

        System.out.println("Inicialment renat.estaViu(): " + renat.getEstaViu());
        System.out.println("Inicialment renat.estaDret(): " + renat.getEstaDret());
        System.out.println("Inicialment renat.estaAssegut(): " + renat.getEstaAssegut());
        System.out.println("Inicialment renat.estaEstirat(): " + renat.getEstaEstirat());
        System.out.println("Introdueix quantes vides:");
        renat.setVides(Integer.parseInt(Entrada.readLine()));
        System.out.println("Introdueix nova posició:");
        renat.setPosicio(Entrada.readLine());
        System.out.println("Finalment renat.estaViu(): " + renat.getEstaViu());
        System.out.println("Finalment renat.estaDret(): " + renat.getPosicio().equals("dret"));
        System.out.println("Finalment renat.estaAssegut(): " + renat.getPosicio().equals("assegut"));
        System.out.println("Finalment renat.estaEstirat(): " + renat.getPosicio().equals("estirat"));

    }

}
