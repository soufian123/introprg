public class MesosAnys {
        public static void main(String[] args) {
        
        
        
        System.out.println("Mes?");
        
        int mes = Integer.parseInt(args[0]);
        System.out.println("Any?");
        int any = Integer.parseInt(args[0]);
        
        int mesAnterior = (1 - mes);
        int mesSeguent = (1 + mes);
        System.out.println("Mes anterior "+ mesAnterior + "/" +any+ " i mes següent " + mesSeguent + "/" +any);
        }
}
