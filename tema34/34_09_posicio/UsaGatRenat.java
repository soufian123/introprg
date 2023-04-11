// programa que et diu les vides, la posicio inicial i la posicio final del gat renat

 public class UsaGatRenat {

     public static void main(String[] args) {

         GatRenat renat = new GatRenat();

         System.out.println("Vides inicials: " + renat.vides);

         System.out.println("Posició inicial: " + renat.posicio);

         renat.posicio="assegut";

         System.out.println("Posició final: " + renat.posicio);

     }

 }

