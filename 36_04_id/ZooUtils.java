/* 
 * Aquest es el programa que va de guardar alguns metodes
 * mes utilitzats de zoo per cridarlos directamen desde aqui
 * i no tornarlo a esciurels, es com el util string, pero per zoo
 *
 *
 */


import java.util.LinkedList;
import java.util.List;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class ZooUtils {

    public static void mostraCategories(List<Categoria> categories) {
        if (categories.isEmpty()) {
        
            System.out.println("Cap categoria");
        } else {
        
            System.out.println("Nombre de categories: " + categories.size());
        }
        
        for (Categoria categoria : categories) {
            System.out.println("\t" + categoria);
        }
        
    }
    
}
