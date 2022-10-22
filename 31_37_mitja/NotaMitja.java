//t'informarà de la nota mitja corresponent a les notes introduïdes.




public class NotaMitja{
    public static void main (String[] args){
    
    
        
        
        
                int ancora;
    int valor;
    int valorSuma = (0);
    int mitja = (0);
    int valorsIntroduits= (0);


        System.out.println("Introdueix un valor");
        valor = Integer.parseInt(Entrada.readLine());
            if (valor>=0){

                        while (valor>=0){
                              valorsIntroduits= ((valorsIntroduits) + (1));
                              valorSuma= ((valorSuma) + (valor));
                                System.out.println("Introdueix un valor");
                                valor = Integer.parseInt(Entrada.readLine());
                        }
                  mitja= ((valorSuma) / (valorsIntroduits));
                  System.out.println("La mitja de les notes vàlides és "+ mitja);
           }else{System.out.println("Cap nota vàlida introduïda");}
    }
}
