//Desenvolupa un programa que demani un nombre positiu més gran que 0. El programa escriurà una línia per nombre entre el nombre introduït i el 1 (és a dir, decreixentment). A cada línia escriurà tots els nombres des de l’1 fins el nombre corresponent a la línia.



public class TriangleInvertit {
    public static void main (String[] args){
    
    
        
        System.out.println("Nombre?");
        int valor= Integer.parseInt(Entrada.readLine());
        int inici=1;

        if (valor>=1 && valor<=9){
        
            for (int lin = valor; lin>=inici; lin--){
            System.out.println();
                for (int col = inici; col<lin; col++){
                System.out.print(col+", ");}
            System.out.print(lin);
            }        
        
        }else{

        }
    }       
}
