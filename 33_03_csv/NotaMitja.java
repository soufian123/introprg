






public class NotaMitja {
     public static void main(String[] args) {
     
     
          String linia = "notes.csv";
          String[] elements = linia.split(",");
          int numeros=0;
          int dividir=0;
          for (int i=1; i<elements.length; i++) {
              if(Character.isDigit(elements[i].charAt(0))){
                  numeros= numeros + elements[i].charAt(0);
                  dividir++;
              }
          }
          
          int mitjana= numeros/dividir;
          System.out.println(elements[0]+ "("+mitjana+")");
     }
}
