/*
Desenvolupa un programa que mostri tres enters separats per comes tenint en comptes que els tres valors es troben emmagatzemats en un array d'enters. v3
*/

public class EntersEntreComes {

    public static void main(String[] args) {
        int v=1;
        int[] numeros;
        System.out.println("Quants?");
        int quants= Integer.parseInt(Entrada.readLine());
        if (quants<1){
            System.out.println("Res a fer");
            return;
        }else{
            numeros = new int[quants];
            for(int q=0; q<numeros.length; q++){
                System.out.println("Valor "+v+"?");
                numeros[q] = Integer.parseInt(Entrada.readLine());
                v++;

            }
            

            System.out.print(numeros[0]);

            for (int i = 1; i < numeros.length; i++) {

                System.out.print(", " + numeros[i]);

            }

            System.out.println();
        }
    }

}
