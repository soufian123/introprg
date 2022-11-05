
// Desenvolupa un programa que que demani un nombre enter positiu i dibuixi tants rombos com se li indiqui:



public class Rombos {
    public static void main (String[] args){
    
    
        
        System.out.println("quants?");
        int quants= Integer.parseInt(Entrada.readLine());

        for(int repetir=1; repetir<=quants; repetir++){
        
            for (int lin = 9; lin>=0; lin--){
                System.out.print(lin+ " ");
                // dibuixa punts esquerra
                
                for (int col = 0; col<lin; col++){
                    System.out.print(".");
                }
                // dibuixa creixent
                
                for (int col = lin; col<9; col++){
                    System.out.print(col);
                }
                //dibuixa decreixent
                for (int col = 9; col>=lin; col--){
                    System.out.print(col);
                }
                //dibuixa punts dreta
                for (int col = 0; col<lin; col++){
                    System.out.print(".");
                }
                System.out.println();
            }
            for (int lin = 1; lin<=9; lin++){
                System.out.print(lin+ " ");
                // dibuixa punts esquerra
                
                for (int col = 0; col<lin; col++){
                    System.out.print(".");
                }
                // dibuixa creixent
                
                for (int col = lin; col<9; col++){
                    System.out.print(col);
                }
                //dibuixa decreixent
                for (int col = 9; col>=lin; col--){
                    System.out.print(col);
                }
                //dibuixa punts dreta
                for (int col = 0; col<lin; col++){
                    System.out.print(".");
                }
                System.out.println();
            }        
        }
    }       
}
