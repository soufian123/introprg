
//Escriu un programa que demani un enter positiu més gran que 0 i "dibuixi" un quadrat amb els nombres del 1 fins el valor de l'entrada.


public class QuadratNombres{
    public static void main (String[] args){
    
        
        System.out.println("Valor final?");
        int valor= Integer.parseInt(Entrada.readLine());
        int inici=1;
        if (valor>=1 && valor<=9){
        
            for (int lin = inici; lin<=valor; lin++){
            
                for (int col = inici; col<=valor; col++){
                System.out.println(col);}
            }        
        
        }
        System.out.println("Valor inadequat");
    }       
}
        
