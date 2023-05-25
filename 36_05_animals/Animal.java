/*
 *
 *
 * es la classe Animal on te un id on te tambe un nom en frmat string
 * tambe te Categoria categoria, vaga que en te coses per saber quin nom en te els 
 * animals el seu id i la seva categoria
 *
 *
 *
 */
 
 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class Animal{
    private int id;
    private String nom;
    private Categoria categoria;
    private Connection conn = null;
    
    public Animal(String nom, Categoria categoria){
        setNom(nom);
        setCategoria(categoria);
        
    }


    public Animal(int id, String nom, Categoria categoria){
        setId(id);
        setNom(nom);
        setCategoria(categoria);
        
    }
    
    public void setId(int id){
        if (id<0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }else{
            this.id=id;
        }
    }
    public int getId() {
        if (idIndefinit()) {
            throw new UnsupportedOperationException("L'identificador no està disponible");
        }
        return id;
    }
    
    
    
    public void setNom(String nom){
        if (nom==null || nom.isEmpty()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }else{
            this.nom=nom;
        }
    }
    public String getNom() {
        if (idIndefinit()) {
            throw new UnsupportedOperationException("L'identificador no està disponible");
        }
        return nom;
    }
    public Categoria getCategoria() {
        if (idIndefinit()) {
            throw new UnsupportedOperationException("L'identificador no està disponible");
        }
        return categoria;
    }
    public void setCategoria(Categoria categoria){
        if (categoria==null) {
            throw new IllegalArgumentException("La categoria no pot ser null");
        }else{
            this.categoria=categoria;
        }
    }

    
    public void afegeixCategoria(Categoria categoria) throws SQLException {
        String sql = String.format(
                "INSERT INTO ANIMALS (nom) VALUES ('%s')",
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
    public boolean idIndefinit() { return categoria.getId() < 0; }








}
