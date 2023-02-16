/*
 * Programa que et diu el dia de la setmana a base del numero de dia de la setmana
 */




    public class DiaSetmanaSwitch {
        public static void main(String[] args) {
         int dia = Integer.parseInt(args[0]);
         
         String resultat;
         
         switch (dia) {
         case 1: resultat = "Dilluns";
                 break;
         case 2: resultat = "Dimarts";
                 break;
         case 3: resultat = "Dimecres";
                 break;
         case 4: resultat = "Dijous";
                 break;
         case 5: resultat = "Divendres";
                 break;
         case 6: resultat = "Dissabte";
                 break;
         case 7: resultat = "Diumenge";
                 break;
         default: resultat = "Error";
                 break;
         
         }
       

      
        System.out.println(""+ resultat +"");
    }
}
