


//retorna un valor boolean cuan comprova si es enter o no





public class UtilString{

    public static boolean esEnter(String texto, boolean estricte){


        boolean resultat=true;
        boolean texts=true;


        //comprova si tot es lletra o numero 
        for(int num=0; num<=(texto.length()-1); num++){
            if(Character.isLetter(texto.charAt(num))){
                texts=true;
            }else {
                texts=false;
            }
        }
        return texts;
        
    }


    public static int aEnter(String texto, boolean texts){
        
        boolean resultat=true;
        //comprovacio si es enter o no en el cas de lletra
        if (texts){
            int numeroLletra=(texto.length()-1);
            if (numeroLletra % 2 == 0){
                resultat= true;
            }else{
                resultat=false;
            }

        }

        //comprovacio si es enter o no en el cas de numero
        if(texts==false){

            int numero= Integer.parseInt((texto));
            if (numero % 2 == 0){
                resultat= false;
            }else{
                resultat=true;
            }

        }
        if (resultat){
            return 1;
        }else{
            return 2;
        }

    
    
    }

}






