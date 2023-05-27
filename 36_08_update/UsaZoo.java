/*
 * el programa s'encarrega de connectar a una base de dades i fer operacions 
 * relacionades amb la creació i eliminació d'una taula anomenada "CATEGORIES" 
 * en aquesta base de dades.
 *
 */


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;
import java.util.Arrays;


class UsaZoo{


    public static void main( String args[]) throws SQLException {

        Zoo zoo = new Zoo();


        System.out.print("Primer connectem amb la base de dades: ");

        zoo.connecta();

        System.out.println("connectat");


        System.out.println();

        System.out.println("Creem les taules");

        zoo.creaTaulaAnimals();

        System.out.println("Taules resultants: " + zoo.getNomTaules());


        System.out.println();

        System.out.println("Introduïm una categoria");

        Categoria mamifer = new Categoria("mamífer");

        zoo.afegeixCategoria(mamifer);

        ZooUtils.mostraCategories(zoo.recuperaCategories());

        //

        // creem una llista d'animals amb algun malament classificat

        Animal balena = new Animal("balena", new Categoria("peix"));

        Animal tarantula = new Animal("taràntula", new Categoria("insecte"));

        List<Animal> animals = Arrays.asList(

            new Animal("pardal", new Categoria("ocell")),

            new Animal("gat", mamifer),

            new Animal("guppy", new Categoria("peix")),

            balena,

            tarantula

            );


        System.out.println();

        System.out.println("Afegim uns quants animals");

        for (Animal animal: animals) {

            zoo.afegeixAnimal(animal);

        }

        System.out.println("A la base de dades, els animals són:");

        ZooUtils.mostraAnimals(zoo.recuperaAnimals());

        System.out.println("A la base de dades, les categories són:");

        ZooUtils.mostraCategories(zoo.recuperaCategories());


        System.out.println();

        System.out.println("Corregim la categoria de la balena a una ja existent");

        zoo.canviaCategoria(balena, mamifer);

        System.out.println("A la base de dades, els animals són:");

        ZooUtils.mostraAnimals(zoo.recuperaAnimals());

        System.out.println("A la base de dades, les categories són:");

        ZooUtils.mostraCategories(zoo.recuperaCategories());


        System.out.println();

        System.out.println("Modifiquem la categoria de la taràntula a una que no existeix");

        zoo.canviaCategoria(tarantula, new Categoria("aràcnid"));

        System.out.println("A la base de dades, els animals són:");

        ZooUtils.mostraAnimals(zoo.recuperaAnimals());

        System.out.println("A la base de dades, les categories són:");

        ZooUtils.mostraCategories(zoo.recuperaCategories());


        System.out.println();

        System.out.println("Intentem modificar la categoria d'un animal que no existeix");

        zoo.canviaCategoria(new Animal("cavall de mar", mamifer), new Categoria("peix"));

        System.out.println("A la base de dades, els animals són:");

        ZooUtils.mostraAnimals(zoo.recuperaAnimals());

        System.out.println("A la base de dades, les categories són:");

        ZooUtils.mostraCategories(zoo.recuperaCategories());


        System.out.println();

        System.out.print("Finalment tanquem la connexió amb la base de dades: ");

        zoo.desconnecta();

        System.out.println("desconnectat");

    }

}
