/*
 * Programa que et diu el dia de la setmana a base del numero de dia de la setmana
 */




    public class DiaSetmana {
        public static void main(String[] args) {
         int dia = Integer.parseInt(args[0]);
         
         String resultat;
         
        if (dia == 1) {

          resultat = "Dilluns";

             } else {

               if (dia == 2) {

                   resultat = "Dimarts";

                      } else {

                          if (dia == 3) {

                            resultat = "Dimecres";

                                  } else {

                                       if (dia == 4) {
    
                                        resultat = "Dijous";

                                               } else {
                                               
                                                       if (dia == 5) {
    
                                                            resultat = "Divendres";

                                                                  } else {

                                                                       if (dia == 6) {
    
                                                                            resultat = "Dissabte";

                                                                                       } else {

                                                                                                if (dia == 7) {
    
                                                                                                    resultat = "Diumenge";

                                                                                                        } else {
                                                                                                                if (dia > 7) {
    
                                                                                                                     resultat = "Error";

                                                                                                                                  } else {
                                                                                                                                  
                                                                                                                                        if (dia > 1) {
    
                                                                                                                     resultat = "Error";

                                                                                                                                  } else {

                                                                                                                                    resultat = "Error";




         }}}}}}}}}

      
        System.out.println(""+ resultat +"");
    }
}
