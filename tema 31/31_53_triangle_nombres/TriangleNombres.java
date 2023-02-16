//Desenvolupa un programa que demani un nombre positiu més gran que 0. El programa escriurà una línia per nombre entre el 1 i el nombre introduït (es a dir, creixentment). A cada línia escriurà tots els nombres des del nombre corresponent a la línia fins al 1.



public class TriangleNombres{
    public static void main (String[] args){
    
    
        
        System.out.println("Nombre?");
        int valor= Integer.parseInt(Entrada.readLine());
        int inici=1;

        if (valor>=1 && valor<=9){
        
            for (int lin = inici; lin<=valor; lin++){
            System.out.println();
                for (int col = lin; col>=inici; col--){
                System.out.print(" "+col);}
            }        
        
        }else{

        }
    }       
}
