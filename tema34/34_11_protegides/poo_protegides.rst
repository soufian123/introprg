##########################################
Anotacions sobre les propietats protegides
##########################################

* Autor/a: soufian

* Data: 14/2/23

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
*propietats protegides* dins de la *programació orientada a objectes*.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que 

UsaGatRenat.java:4: error: vides has private access in GatRenat
           System.out.println("El gat Renat té " + renat.vides + " vides");
                                                        ^
1 error


Penso que passa perquè les vides de gat renat es privada

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és que li afegim un get.

El resultat ara és El gat Renat té 7 vides


Penso que passa això perquè li posem un get que agafa el valor de vides encara que estigui privada.

Pregunta 3. Canviant valor
==========================

Per què des del ``main()`` de ``UsaGatRenat`` poguem dir que ``renat`` té
5 vides, cal fer XXX.

El codi de ``UsaGatRenat`` seria:

::

    
     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             renat.setVides(5);
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    
       public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
   }


La meva explicació de perquè això és així és al ser privat hem de usar els valors per poder modificar el seu valor.


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, ens
trobem que te 7 vides

El codi seria:

::

         public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             renat.setVides(-12);
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }


La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 7 vides



La meva explicació de perquè això és així és el numero de vides numes pot ser positu


Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo què El gat Renat té -12 vides


Comparant-lo amb el que passava a la pregunta 1, veiem que si canvia el valor si ens referim a una private desde el seu programa.

La meva explicació és les provades es poden modificar pero si es fa desde el seu programa

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és no perquè si no modifiquem el programa nomes spodrem posar vides positives.

Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és laopcio de donar acces a accedir/modificar des de fora o no.

Pregunta 8. Només *getter*
==========================

Aquesta implementació de ``GatRenat`` disposa de *getter* i de *setter*.
Aquests venen definits pels mòduls getVides i  setVides.

En cas que ``GatRenat`` només disposés de *getter*, el resultat seria el valor que se li ha posat a la private, el getter es per consultar.

En canvi, si només en tingués *setter* el que passaria és podriem canviar el valor, pero no consultaro.

Finalment, si no en tingués cap dels dos, ens trobaríem que no es pot ni consultar ni canviar, aixi que el private no ens seria util.


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret que no porten cap static

