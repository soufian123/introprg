




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NotaMitja {
     public static void main(String[] args) throws IOException {
     
     
          String cami = "notes.csv";
          FileReader fileReader = new FileReader(cami);
          BufferedReader input = new BufferedReader(fileReader);
          
          int numeros=0;
          double mitjana=0;
          int numero=0;
          while (true) {
          String linia = input.readLine();
            if (null == linia) break;

            if(numero==0){
                numero=1;
            }else{
                
                
                String[] elements = linia.split(",");
              for (int i=1; i<7; i++) {
                  if(Character.isDigit(elements[i].charAt(0))){
                      numeros= numeros + elements[i].charAt(0);
                    System.out.println(numeros);
                  }else{

                    mitjana= numeros/6;
                }
              }
              System.out.println(elements[0]+ "("+mitjana+")");
               numeros=0;
               mitjana=0;
         }
         }
     }
}
