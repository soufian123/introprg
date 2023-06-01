/*
 * aquest programa o archiu es la botiga, la botiga gestiona v en te tot els seu inventari
 * on un dels seus inventaris es el vi, gestionarem la botiga v posare v eliminarem 
 * els productes que volguem, en aquest cas es el vi.
 *
 */
 import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Botiga{
    private int DEFAULT_MAX_VINS=10;
    private Vi[] vins;
    private int contador = -1;
    
    public Botiga(){
    vins = new Vi[DEFAULT_MAX_VINS];
    }
    public Botiga(int maxVins){
    vins = new Vi[maxVins];
    }
    
    
    public Vi afegeix(Vi vi) {
        boolean esta = true;
        if (vi.esValid()) {
            for (int v = 0; v < vins.length; v++) {
                if (vins[v] != null) {
                    if (vins[v].getNom().equals(vi.getNom())) {
                        esta = false;
                    }
                }
            }
            if (esta) {
                for (int v = 0; v < vins.length; v++) {
                    if (vins[v] == null) {
                        vins[v] = vi;
                        return vi;
                    }
                }
            }
        }
        return null;
    }
    
    public Vi elimina(String nom) {
        nom = Vi.normalitzaNom(nom);
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
                if (vins[v].getNom().equals(nom)) {
                    if (vins[v].getEstoc() > 0) {
                        return null;
                    } else {
                        Vi vi = vins[v];
                        vins[v] = null;
                        return vi;
                    }
                }
            }
        }
        return null;
    }
    
    
    public Vi cerca(String nom){
        nom = Vi.normalitzaNom(nom).toLowerCase();
        for (int v = 0; v < vins.length; v++) {
            if (vins[v] != null) {
                String vi = vins[v].getNom().toLowerCase();
                if (vi.equals(nom)) {
                    return vins[v];
                }
            }
        }
        return null;
    }


    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
     public void iniciaRecorregut() {
        setContador(-1);
    }


    public Vi getSeguent() {
        if (getContador() < vins.length) {
            setContador(getContador() + 1);
        }
        if (getContador() == vins.length) {
            return null;
        }

        while (vins[getContador()] == null && getContador() < vins.length - 1) {
            setContador(getContador() + 1);
        }

        return vins[getContador()];
    }






    private static final String NOM_BASE_DE_DADES = "animals.bd";
    private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" +
                                                     NOM_BASE_DE_DADES;
    private Connection conn = null;
    public void connecta() throws SQLException {
        if (conn != null) return;
        conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);
    }

    public void desconnecta() throws SQLException {
        if (conn == null) return;
        conn.close();
        conn = null;
    }
    public void creaTaulaBotiga() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS botiga (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nom VARCHAR(50) NOT NULL," +
                     "preu INTEGER NOT NULL," +
                     "quantitat INTEGER NOT NULL,";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    public void creaTaulaVi() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS vins (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nom VARCHAR(50) NOT NULL," +
                     "preu INTEGER NOT NULL," +
                     "quantitat INTEGER NOT NULL,";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    public void eliminaTaulaBotiga() throws SQLException {

        String sql = "DROP TABLE IF EXISTS botiga;";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    
    public void afegeixVi(Vi vi) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO vins (nom, tipus, preu, quantitat) " +
                "VALUES ('" + vi.getNom() +
                "', " + vi.getPreu() + ")";
        stmt.executeUpdate(sql);
    }




}
