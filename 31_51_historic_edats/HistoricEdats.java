//Desenvolupa un programa que demani el nom d'una persona, la seva edat i l'any actual, i escrigui l'edat que tenia aquella persona cada any des del seu naixement.


public class HistoricEdats{
    public static void main (String[] args){
    
    
        
        
        System.out.println("El vostre nom?");
        String nom =Entrada.readLine();
            System.out.println("La vostra edat?");
        int edat =Integer.parseInt(Entrada.readLine());
            System.out.println("L'any actual?");
        int anyActual =Integer.parseInt(Entrada.readLine());
        int edatAny=0;
        
        for (int any= anyActual-edat;any<anyActual; any++){
            if(edatAny==0){
            System.out.println("El "+ any + " vau néixer");
            }else if(edatAny==1){
            System.out.println("El "+ any +" teníeu "+ edatAny + " any");
            }else{ System.out.println("El "+ any +" teníeu "+ edatAny + " anys");
            }
            edatAny= edatAny+1;
            }
        System.out.println("Adéu "+ nom);
    }
}        
