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
    
    public void informacionTotalProductos(){
        System.out.println("Categoria " + this.nombre + "\n");
        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            
            System.out.println("Nombre producto: " + p.getNombre() + "\n" +
                               "Descripción: " + p.getDescripcion() + "\n" +
                               "Items del producto: \n"  );
            for (int j = 0; j < p.getItems().size(); j++) {
                Item item = p.getItems().get(j);
                
                System.out.println("Nombre del item: " + item.getNombre() + "\n" +
                                   "Costo unidad: " + item.getCostoUnidad() + "\n");
                System.out.println("");
                
            }
        }
    
    }
    
}
