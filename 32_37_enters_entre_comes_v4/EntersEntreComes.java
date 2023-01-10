/*
Desenvolupa un programa que mostri tres enters separats per comes tenint en comptes que els tres valors es troben emmagatzemats en un array d'enters. v4
*/

public class EntersEntreComes {

    public static void main(String[] args) {
        
        int[] numeros;
        System.out.println("Quants?");
        String text= Entrada.readLine();
        boolean enter= UtilString.esEnter(text);
        while (!(UtilString.esEnter(text))){
            System.out.println("Per favor, un valor enter");
            text= Entrada.readLine();
        }
        int quants= Integer.parseInt(text);
        
        System.out.println("Quants?");
        String textSeparador= Entrada.readLine();
        char separador = textSeparador.charAt(0);
        if (quants<1){
            System.out.println("Res a fer");
            return;
        }else{
        
            numeros = new int[quants];
            String resposta = UtilString.entreComes(numeros, separador);
            
            System.out.println(resposta); 
        }

        
    }

}

