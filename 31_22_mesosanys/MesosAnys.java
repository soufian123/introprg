
/*
 * Programa que et diu el mes anterior y seguent del mes que li escriguis 
 */




public class MesosAnys {
        public static void main(String[] args) {
        
        
        
        System.out.println("Mes?");
        
        int mes = Integer.parseInt(Entrada.readLine());
        System.out.println("Any?");
        int any = Integer.parseInt(Entrada.readLine());
         int mesAnterior;
         int mesSeguent;
         int anyAnterior;
         int anySeguent;
         
         String mesAnteriorr;         
         String mesSeguentt;
         
         switch (mes) {
         case 1: mesAnteriorr = "12";
                 mesSeguent = (1 + mes);
                 mesSeguentt = "";
                 mesAnterior = (12);
                 anyAnterior = (any - 1);
                 
                 break;

         case 12: mesSeguentt = "1";
                  mesAnterior = ( mes - 1);
                  mesAnteriorr = "";
                  mesSeguent = (1);
                  anySeguent = (any + 1);
                 break;

         default:  
         mesSeguentt = "";
         mesAnteriorr = "";
         mesAnterior = ( mes - 1);
         mesSeguent = (1 + mes);
                 break;
       }
        System.out.println("Mes anterior "+ mesAnterior +"/"+any+" i mes següent "+ mesSeguent +"/" +any);
}
}
