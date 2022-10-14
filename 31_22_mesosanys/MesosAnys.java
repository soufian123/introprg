
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
         
         
         switch (mes) {
         case 1: mesSeguent = (1 + mes);
                 mesAnterior = (12);
                 anyAnterior = (any - 1);
                 anySeguent = (any);
                 
                 break;

         case 12: mesAnterior = ( mes - 1);
                  mesSeguent = (1);
                  anySeguent = (any + 1);
                  anyAnterior = (any);
                 break;

         default:
         mesAnterior = ( mes - 1);
         mesSeguent = (1 + mes);
         anyAnterior = (any);
         anySeguent = (any);
                 break;
       }
        System.out.println("Mes anterior "+ mesAnterior +"/"+ anyAnterior +" i mes següent "+ mesSeguent + "/" + anySeguent);
}
}
