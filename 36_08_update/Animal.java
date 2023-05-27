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
    private int id =-1;
    private String nom;
    private Categoria categoria;
    private Connection conn = null;
    
    public Animal(String nom, Categoria categoria){
        if(nom==null || nom.isBlank()) throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        setNom(nom);
        if (categoria==null) throw new IllegalArgumentException("La categoria no pot ser null");
        setCategoria(categoria);
        
    }


    public Animal(int id, String nom, Categoria categoria){
        if (id<0) throw new IllegalArgumentException("L'identificador ha de ser positiu");
        setId(id);
        if(nom==null || nom.isBlank()) throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        setNom(nom);
        if (categoria==null) throw new IllegalArgumentException("La categoria no pot ser null");
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
       /* if (idIndefinit()) {
            throw new UnsupportedOperationException("L'identificador no està disponible");
        }*/
        return categoria;
    }
    public void setCategoria(Categoria categoria){
        if (categoria==null) {
            throw new IllegalArgumentException("La categoria no pot ser null");
        }else{
            this.categoria=categoria;
        }
    }

    public boolean idIndefinit() { return getId() < 0; }


    @Override
    public String toString() {
        return "Animal(id:" +
            (id < 0 ? "indefinit" : id) +
            ", " + nom + ", " + categoria + ")";
    }





}
