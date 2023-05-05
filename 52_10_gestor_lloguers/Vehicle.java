/*
 * es la classe vehicle que el que fa es emagatzemar la ifnormacio dels vehicles 
 * tot el que te en format string es:model, marca i categoria
 * amb un contreuctor Vehicle 
 * i el basic, general i luxe son int
 * 
 */


import java.util.*;
public class Vehicle {
    
    public static int BASIC=1;
    public static int GENERAL=2;
    public static int LUXE=3;
    
    private String model;
    private String marca;
    private int categoria;
    

    public Vehicle(String marca, String model, int categoria) {
        this.model = model;
        this.marca = marca;
        this.categoria = categoria;
    }
    
    

    public String getModel()     { return model; }
    public void setModel(String model) { this.model = model; }
    
    public String getMarca()     { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    
    public int getCategoria()     { return categoria; }
    public void setCategoria(int categoria) { this.categoria = categoria; }





}

