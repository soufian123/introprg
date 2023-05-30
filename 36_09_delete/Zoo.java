/*
 * el programa s'encarrega de connectar a una base de dades i fer operacions 
 * relacionades amb la creació i eliminació d'una taula anomenada "CATEGORIES" 
 * en aquesta base de dades.
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
        eliminaTaulaAnimals();
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
            ResultSet rs = st.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            categoria.setId(id);
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


    public void creaTaulaAnimals() throws SQLException {
        eliminaTaulaAnimals();
        eliminaTaulaCategories();
        creaTaulaCategories();
        String sql = "DROP TABLE IF EXISTS ANIMALS;"+
                     "CREATE TABLE ANIMALS (" +
                     "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "       nom       TEXT,"+
                     "       categoria INTEGER,"+
                     "FOREIGN KEY(categoria) REFERENCES CATEGORIES(id))";
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
    public void eliminaTaulaAnimals() throws SQLException {
        String sql = "DROP TABLE IF EXISTS ANIMALS;";
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


    public String getNomTaules() throws SQLException {
        String sql = "SELECT name FROM sqlite_schema " +
                     "WHERE name NOT LIKE 'sqlite%' " +
                     "ORDER BY name";
        List<String> taules = new ArrayList<>();
        try (Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) { taules.add(rs.getString("name")); }
            rs.close();
        }
        return taules.size() > 0 ? String.join(", ", taules) : "cap";
    }

    public void afegeixAnimal(Animal animal) throws SQLException {
        Categoria categoria = obteCategoriaPerNom(animal.getCategoria().getNom());
        if (categoria==null) {
            afegeixCategoria(animal.getCategoria());
            categoria =animal.getCategoria();

        }
        animal.setCategoria(categoria);
        String sql = String.format(
        "INSERT INTO ANIMALS (nom, categoria) VALUES ('%s', '%d')", animal.getNom(), categoria.getId(),
        animal.getNom(),
        animal.getCategoria().getId());
        Statement st = null;

        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            animal.setId(id);

        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    
    private Categoria obteCategoriaPerId(int bdCategoria) {
        String sql = String.format(
                "SELECT * FROM CATEGORIES WHERE id=%d", bdCategoria);
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
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String obteAnimalPerNom(String nom) throws SQLException {
        String sql = String.format(
                "SELECT * FROM ANIMALS WHERE nom='%s' ORDER BY id LIMIT 1", nom);
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                int bdId = rs.getInt("id");
                String nomAnimal = rs.getString("nom");
                int bdCategoria = rs.getInt("categoria");
                Categoria categoria = obteCategoriaPerId(bdCategoria);
                Animal animal = new Animal(bdId, nomAnimal, categoria);
                rs.close();
                return animal.toString();
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
    
    
    
    

    
   /* 
    public List<Animal> recuperaAnimals() throws SQLException {
        String sql = "SELECT ANIMALS.id as idAnimal, ANIMALS.nom as nomAnimal, CATEGORIES.id as idCategoria, CATEGORIES.nom as nomCategoria FROM ANIMALS JOIN CATEGORIES ON (ANIMALS.categoria=CATEGORIES.id) ORDER BY ANIMALS.nom";

        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Animal> animals = new LinkedList<>();
            while (rs.next()) {
                int idAnimal = rs.getInt("idAnimal");
                String nomAnimal = rs.getString("nomAnimal");
                int idCategoria = rs.getInt("idCategoria");
                String nomCategoria = rs.getString("nomCategoria");
                Animal animal = new Animal(idAnimal, nomAnimal,new Categoria(idCategoria,nomCategoria));
                animals.add(animal);
            }
            rs.close();
            return animals;
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    */
    public List<Animal> recuperaAnimals() throws SQLException {
        String sql = "SELECT * FROM ANIMALS JOIN CATEGORIES ON (ANIMALS.categoria=CATEGORIES.id) ORDER BY ANIMALS.nom";

        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Animal> animals = new LinkedList<>();
            while (rs.next()) {
                int idAnimal = rs.getInt("ANIMALS.id");
                String nomAnimal = rs.getString("ANIMALS.nom");
                int idCategoria = rs.getInt("CATEGORIA.id");
                String nomCategoria = rs.getString("CATEGORIA.nom");
                Animal animal = new Animal(idAnimal, nomAnimal,new Categoria(idCategoria,nomCategoria));
                animals.add(animal);
            }
            rs.close();
            return animals;
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    
    

    
    
    public void canviaCategoria(Animal animal, Categoria categoria) throws SQLException{
        if (animal.idIndefinit()) {
            animal.setCategoria(categoria);
            afegeixAnimal(animal);
        }
        if (categoria.idIndefinit()) {
            afegeixCategoria(categoria);
            String sql = String.format("UPDATE ANIMALS " +
                           "SET categoria = %d " +
                           "WHERE id = %d",
                           obteCategoriaPerNom(categoria.getNom()).getId(),
                           animal.getId()
                           );
            Statement st = null;
            try {
                st = conn.createStatement();
                st.executeUpdate(sql);
                ResultSet rs = st.getGeneratedKeys();
                rs.next();
                int id = rs.getInt(1);
                animal.setId(id);
            } finally {
                if (st != null) {
                    st.close();
                }
            }
        } else {
            String sql = String.format("UPDATE ANIMALS " +
                           "SET categoria = %d " +
                           "WHERE id = %d",
                           obteCategoriaPerNom(categoria.getNom()).getId(),
                           animal.getId()
                           );
            Statement st = null;
            try {
                st = conn.createStatement();
                st.executeUpdate(sql);
                ResultSet rs = st.getGeneratedKeys();
                rs.next();
                int id = rs.getInt(1);
                animal.setId(id);
            } finally {
                if (st != null) {
                    st.close();
                }
            }
        }
    }
    
    
    public void eliminaAnimal(Animal animal) throws SQLException{
        
        if (animal.getId()>0){
            String sql = "DELETE FROM ANIMALS WHERE id = '"+animal.getId()+"';";
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
    }
    
    
    public void eliminaCategoria(Categoria categoria) throws SQLException{
        if (categoria.idIndefinit()) {
            return;
        }
        String sql = String.format("DELETE FROM ANIMALS WHERE categoria = %d;", categoria.getId());
        String sqlDos = String.format("DELETE FROM CATEGORIES WHERE id = %d;", categoria.getId());
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            st.executeUpdate(sqlDos);
            } finally {
            if (st != null) {
                st.close();
            }
        }
    }

}















