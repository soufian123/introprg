//Desenvolupa un programa que demani un nombre enter positiu i dibuixi tants triangles com se li indiqui.



public class Triangle {
    public static void main (String[] args){
    
    
        
        System.out.println("quants?");
        int quants= Integer.parseInt(Entrada.readLine());
        int valor= 9;
        int inici=0;

        for(int repetir=1; repetir<=quants; repetir++){

            for (int lin = valor; lin>=inici; lin--){

                // dibuixa punts
                
                for (int col = inici; col<lin; col++){
                    System.out.print(".");
                }
                // dibuixa creixent
                
                for (int col = lin; col<9; col++){
                    System.out.print(col);
                }
                
                for (int col = valor; col>=lin; col--){
                    System.out.print(col);
                }

                for (int col = inici; col<lin; col++){
                    System.out.print(".");
                }
 System.out.println();
            }        
        }
    }       
}
