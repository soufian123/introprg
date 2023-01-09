/*
Desenvolupa un programa que vagi demanant les notes obtingudes pels estudiants de programació en el darrer examen (com a mínim dues) i indiqui quina ha estat la nota més alta.

Les notes estaran representades en base 10 i, per tant, els valors vàlids són els números enters del 1 fins el 10.

El programa deixarà de recollir notes quan rebi un valor negatiu.

Finalment, el programa mostrarà quina ha estat la nota més alta.
*/


public class NotaMesAlta{
    public static void main (String[] args){
        int numUn=0;
        int numDos=354;
        int numAlt=0;
        boolean seguir=true;
        System.out.println("Introdueix les notes (-1 per finalitzar)");
        while(seguir){
            numUn= Integer.parseInt(Entrada.readLine());
            if(numUn==-1){
                System.out.println("Com a mínim calen dues notes");
                return;
            }
            numDos= Integer.parseInt(Entrada.readLine());
            if(numDos==-1){
                System.out.println("Com a mínim calen dues notes");
                return;
            }
            while(seguir){
                if (numUn<=numDos){
                    numAlt=numDos;
                }
                if (numUn>numDos){
                    numAlt=numUn;
                }
                numDos= Integer.parseInt(Entrada.readLine());
                if(numDos==-1){
                    seguir=false;
                }
            
            }
        }
    }
}
