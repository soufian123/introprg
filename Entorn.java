





public class Entorn {
    private final Botiga botiga = new Botiga();
    public static void main(String[] args) {
        Entorn entorn = new Entorn();
        mostraBenvinguda();
        while (true) {
            mostraPrompt();
            String comanda = Entrada.readLine().strip();
            if (comanda.isEmpty()) continue;
            if (comanda.equals("surt")) break;
            switch (comanda) {
                case "ajuda": mostraAjuda();
                             break;
                case "afegeix": entorn.processaAfegeix();
                           break;
                case "cerca": entorn.processaCerca();
                             break;
                case "modifica": entorn.processaModifica();
                            break;
                case "elimina": entorn.processaElimina();
                           break;
                default: mostraErrorComandaDesconeguda();
            }
        }
        mostraComiat();
    }
    private static void mostraComiat() {
        System.out.println("adéu");
    }
    private static void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }
    
    private static void mostraAjuda() {
        System.out.println("Comandes disponibles:");
        System.out.println("ajuda");
        System.out.println("cerca");
        System.out.println("afegeix");
        System.out.println("modifica");
        System.out.println("elimina");
        System.out.println("surt");
    }
    
     private void processaCerca() {
        system.out.print("nom (enter cancel·la)> ");
        String nom= Entrada.readLine();
        if (nom.isEmpty()){
            return;
        }
        nom = Vi.normalitzaNom(nom);
        
        Vi vi = Botiga.cerca(nom);
        if (vi==null){
            System.out.println("No trobat");
            return;
        }
        System.out.println("Trobat:");
        System.out.println(vi);

     }

    
    
    public void processaAfegeix(){
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) {
            return;
        }
        nom = Vi.normalitzaNom(nom);
        
        
        System.out.print("preu (en cèntims)> ");
        String num = Entrada.readLine();
        if (num.isEmpty()) num = "0";
        int preu = Integer.parseInt(num);
        if (preu<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        
        
        System.out.print("estoc (enter sense estoc)> ");
        String text = Entrada.readLine();
        if (text.isEmpty()) text="0";
        int estoc = Integer.parseInt(text);
        if (estoc<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        
        
        Vi vi = new Vi(nom,preu,estoc);
        if (botiga.afegeix(vi) == null) {
            System.out.println("ERROR: no s'ha pogut afegir");
            return;
        }
        
        System.out.println("Introduït:");
        System.out.println(vi);
    }
    
    public void processaModifica(){
        System.out.print("nom (enter cancel·la)> ");
        if (nom.isEmpty()) return;
        
        nom=Vi.normalitzaNom(nom);
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("No trobat");
            return;
        }
            
            
        System.out.printf("preu (enter %s)> ",vi.getPreu());
        String num = Entrada.readLine();
        if (num.isEmpty()){
            int preu = Integer.parseInt(vi.getPreu());
        }else{
            int preu = Integer.parseInt(num);
        }
        if (preu<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        vi.setPreu(preu);
        
        
        System.out.printf("estoc (enter %s)> ",vi.getEstoc());
        String text = Entrada.readLine();
        if (text.isEmpty()){
            int estoc = Integer.parseInt(vi.getEstoc());
        }else{
            int estoc = Integer.parseInt(text);
        }
        if (estoc<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        vi.setEstoc(estoc);
        
        System.out.println("Modificat:");
        System.out.println(vi);
    
    
    }
    private void processaElimina() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) return;
        nom = Vi.normalitzaNom(nom);
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("No trobat");
            return;
            
        }
        System.out.println("A eliminar:");
        System.out.println(vi);
        System.out.print("Segur?> ");
        String resposta = Entrada.readLine();
        
        if (!UtilitatsConfirmacio.respostaABoolean(resposta)) {
            System.out.println("No eliminat");
            return;
        }
        
        vi = botiga.elimina(nom);
        if (vi == null) {
            System.out.println("ERROR: no s'ha pogut eliminar");
        } else {
            System.out.println("Eliminat");
        }
    }
    
    
    
    
}
