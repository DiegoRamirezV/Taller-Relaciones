/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Item extends Objeto_Dominio {
    
    private String nombre;
    private double costoUnidad;
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public Item(String nombre, String id) {
        super(id);
        this.nombre = nombre;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoUnidad() {
        return costoUnidad;
    }

    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }
    
    
    
}
