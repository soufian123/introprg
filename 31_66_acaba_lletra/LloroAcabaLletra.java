//Desenvolupa una nova versió del programa del Lloro que, en aquest cas només repeteixi les paraules que finalitzin amb una lletra no vocal. Com la versió original, s'aturarà quan rebi una cadena en blanc o buida.

public class LloroAcabaLletra{
    public static void main (String[] args){
        
        System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
        String paraula= Entrada.readLine();
        String vocals= "aeiouAEIOU";
        String coinsideixen= "false";
        
        int numero =0;
        if (!paraula.isBlank()){
            while (!paraula.isBlank()){
                if (Character.isLetter(paraula.charAt((paraula.length())-1))==true){
                    for(int num=0; num<=9; num++){
                        if (paraula.charAt(vocals.length()-1)==vocals.charAt(num)){
                            coinsideixen="true";
                        }
                    }
                    if (coinsideixen=="false"){
                        System.out.println("El lloro diu: "+paraula);
                    }
                }
                System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
                paraula= Entrada.readLine();
                coinsideixen= "false";
            }
        }
        System.out.print("Adéu");
    }
}
