import java.util.*;

public class UnaProva {
    public static void main(String[] args) {
                    Vi[] vins = vinsValids();
            Botiga botiga = botigaPlena(vins);

            botiga.iniciaRecorregut();
            Vi[] trobats = new Vi[vins.length];
            int i = 0;
            while (true) {
                System.out.printf("XXX i: %d hauria de ser <= vins.length: %d%n", i, vins.length);
                Vi trobat = botiga.getSeguent();
                if (trobat == null) break;
                trobats[i] = trobat;
                i++;
            }
            final int quants = i;
            System.out.printf("XXX Al final i: %d hauria de ser == vins.length: %d%n", i, vins.length);
    }
    
    private static Vi[] vinsValids() {
        return new Vi[] {
            new Vi("LLUMALBA20200001", "Llum d'Alba Blanc", 1750, 12, "P02E03N55D", "Priorat"          , "blanc", "2020"),
            new Vi("CARPATHI20180021", "Carpathia Negre"  , 3450,  6, "P23E01N43D", "Montsant"         , "negre", "2018"),
            new Vi("MATISNEG20190011", "Matís Negre"      , 1325, 12, "P20E01N12E", "Pla del Bages"    , "negre", "2019"),
            new Vi("SAOROSAT20180001", "Saó Rosat"        , 1040, 24, "P02E45N55D", "Costers del Segre", "negre", "2018"),
            new Vi("ROURABLA20200232", "Roura blanc"      , 1012, 42, "P21E45N55E", "Alella"           , "blanc", "2020"),
            new Vi("ROURABLA20200201", "Roura blanc"      ,  906,  3, "P21E45N55E", "Alella"           , "blanc", "2018"),
            new Vi("CERCIUMX20170002", "Cercium"          ,  565, 30, "P23E01N55D", "Empordà"          , "negre", "2017"),
            new Vi("MASIASER20200001", "Masia Serra"      , 1350, 12, "P02E02N55E", "Empordà"          , "negre", "2020")
        };
    }
    
    private static Botiga botigaPlena(Vi[] vins) {
        Botiga botiga = new Botiga();
        Arrays.stream(vins).forEach(botiga::afegeix);
        return botiga;
    }
 }
