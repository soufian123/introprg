




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NotaMitja {
     public static void main(String[] args) throws IOException {
     
     
          String cami = "notes.csv";
          FileReader fileReader = new FileReader(cami);
          BufferedReader input = new BufferedReader(fileReader);
          
          int numeros=0;
          int dividir=0;
          int mitjana=0;
          
          while (true) {
                String linia = input.readLine();
                if (null == linia) break;
                
                String[] elements = linia.split(",");
              for (int i=1; i<7; i++) {
                  if(Character.isDigit(elements[i].charAt(0))){
                      numeros= numeros + elements[i].charAt(0);
                      dividir++;
                  }else{
                    if (dividir==0 || numeros==0){
                    mitjana=0;
                    }else{
                    mitjana= numeros/dividir;
                }
                  }
              }
              System.out.println(elements[0]+ "("+mitjana+")");
         }
     }
}
