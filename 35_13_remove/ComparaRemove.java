/*
    Comparació de l'operació remove() en ArrayList i LinkedList
    eliminant per l'inici, pel final i pel mig.

    Els resultats obtinguts han estat:
    Primera execució:
    =================

Comparant l'eficiència de les llistes
Comparació quan eliminem sempre de l'inici
test remove(0) LinkedList:     9418851
test remove(0) ArrayList:      263510198

Comparació quan eliminem sempre del final
test remove(últim) LinkedList: 12879975
test remove(últim) ArrayList:  1689512
Comparació quan eliminem sempre del mig
test remove(mig) LinkedList:   2687909850
test remove(mig) ArrayList:    130287322

        Segona execució:
        ================
Comparant l'eficiència de les llistes

Comparació quan eliminem sempre de l'inici
test remove(0) LinkedList:     16310349
test remove(0) ArrayList:      242781104
Comparació quan eliminem sempre del final
test remove(últim) LinkedList: 13111445
test remove(últim) ArrayList:  1832172

Comparació quan eliminem sempre del mig
test remove(mig) LinkedList:   2748355102
test remove(mig) ArrayList:    133924084

        Tercera execució:
        =================
Comparant l'eficiència de les llistes

Comparació quan eliminem sempre de l'inici
test remove(0) LinkedList:     12961681
test remove(0) ArrayList:      268718308
Comparació quan eliminem sempre del final
test remove(últim) LinkedList: 14527320
test remove(últim) ArrayList:  6983335

Comparació quan eliminem sempre del mig
test remove(mig) LinkedList:   2741264197
test remove(mig) ArrayList:    138947985
        Resultats
        =========
        
        12896960,33	258336536,7	13506246,67	3501673	2725843050	134386463,7


========== ================== ================== ======================================================
**prova**  **linkedList**      **ArrayList**      **resultat**
---------- ------------------ ------------------ ------------------------------------------------------
inici       12896960,33         258336536,7          0.05
final       13506246,67	        3501673              0.26
mig         2725843050	        134386463,7          0.05
========== ================== ================== ======================================================
    Per calcular cada columna:

    * la cel·la (1, 1) correspon al temps mig de la implementació LinkedList eliminant des de l'inici
      Es calcula sumant els valors obtinguts a les tres execucions i dividint-los per 3
    * el resultat per la fila inici indica quantes vegades és més ràpid un que l'altre. Per fer-ho, dividim
      el valor més petit pel més gran i arrodonim a l'enter.

    Conclusions
    ===========

    En vistes als resultats, en cas que hagi de fer servir una List per eliminar molts valors, escolliré borrar desde el 
    final amb el arraylist, com podem veure es el que va molt mes rapid  
     */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ComparaRemove {
    private static final int LONGITUD = 100000;
    private static List<Integer> emplena(List<Integer> llista) {
        // XXX codi que emplena la llista amb enters del 0 a LONGITUD - 1
        for (int i = 0; i < LONGITUD; i++) {
            llista.add(i);
        }
        return llista;
    }
    private static long testRemove0(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        // XXX codi que elimina un a un tots els elements de la llista per la posició 0
        while (!llista.isEmpty()) {
            llista.remove(0);
        }
        
        return System.nanoTime() - tempsInicial;
    }
    private static long testRemove(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        // XXX codi que elimina un a un tots els elements de la llista per la darrera posició
        while (!llista.isEmpty()) {
            llista.remove(llista.size() - 1);
        }
        return System.nanoTime() - tempsInicial;
    }
    private static long testRemoveMig(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        // XXX codi que elimina un a un tots els elements de la llista per la posició mig
        while (!llista.isEmpty()) {
            llista.remove(llista.size() / 2);
        }
        return System.nanoTime() - tempsInicial;
    }
    public static void main(String[] args) {
        System.out.println("Comparant l'eficiència de les llistes");
        System.out.println();

        System.out.println("Comparació quan eliminem sempre de l'inici");
        System.out.printf("test remove(0) LinkedList:     %10d%n", testRemove0(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(0) ArrayList:      %10d%n", testRemove0(emplena(new ArrayList<Integer>())));
        System.out.println();
        System.out.println("Comparació quan eliminem sempre del final");
        System.out.printf("test remove(últim) LinkedList: %10d%n", testRemove(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(últim) ArrayList:  %10d%n", testRemove(emplena(new ArrayList<Integer>())));
        System.out.println();

        System.out.println("Comparació quan eliminem sempre del mig");
        System.out.printf("test remove(mig) LinkedList:   %10d%n", testRemoveMig(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(mig) ArrayList:    %10d%n", testRemoveMig(emplena(new ArrayList<Integer>())));
        System.out.println();
    }
}
