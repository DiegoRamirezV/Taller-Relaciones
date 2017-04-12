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
public class Categoria extends Objeto_Dominio{
    
    private String nombre;
    private String descripcion;
    private ArrayList<Producto> productos;

    public Categoria(String nombre, String id) {
        super(id);
        this.nombre = nombre;
        this.productos = new ArrayList<Producto>();
        
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
