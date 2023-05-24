/*
 * el programa s'encarrega de connectar a una base de dades i fer operacions 
 * relacionades amb la creació i eliminació d'una taula anomenada "CATEGORIES" 
 * en aquesta base de dades.
 *
 */
 
 
import java.util.LinkedList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class Zoo {
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
        public void creaTaulaCategories() throws SQLException {
        String sql = "DROP TABLE IF EXISTS CATEGORIES;"+
                     "CREATE TABLE CATEGORIES (" +
                     "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "       nom       VARCHAR(40))";
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
    public void eliminaTaulaCategories() throws SQLException {
        String sql = "DROP TABLE IF EXISTS CATEGORIES;";
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
    
    public void afegeixCategoria(Categoria categoria) throws SQLException {
        String sql = String.format(
                "INSERT INTO CATEGORIES (nom) VALUES ('%s')",
                categoria.getNom());
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
    /*
    public void obteCategoriaPerNom(String nom) throws SQLException {
        String sql = "SELECT * FROM CATEGORIES WHERE = '"+nom+"';";
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
*/

    public List<Categoria> recuperaCategories() throws SQLException {
        String sql = "SELECT * FROM CATEGORIES ORDER BY nom";
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Categoria> categories = new LinkedList<>();
            while (rs.next()) {
                int bdId = rs.getInt("id");
                String nom = rs.getString("nom");
                Categoria categoria = new Categoria(bdId, nom);
                categories.add(categoria);
            }
            rs.close();
            return categories;
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }


    public Categoria obteCategoriaPerNom(String nom) throws SQLException {
        String sql = String.format(
                "SELECT * FROM CATEGORIES WHERE nom='%s' ORDER BY id LIMIT 1", nom);
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int bdId = rs.getInt("id");
                String nomCategoria = rs.getString("nom");
                Categoria categoria = new Categoria(bdId, nomCategoria);
                rs.close();
                return categoria;
            } else {
                rs.close();
                return null;
            }
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

















}

















