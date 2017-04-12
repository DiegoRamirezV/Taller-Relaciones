/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Categoria c1 = new Categoria("Aseo","0001234");
        Categoria c2 = new Categoria("Cosmeticos","0005678");
        
        
        c1.addProducto(new Producto("Jabon","0004435"));
        c1.addProducto(new Producto("Shampoo","3244435"));
        c1.addProducto(new Producto("Crema Dental","94328"));
        c1.addProducto(new Producto("Gel","9798527"));
        c1.addProducto(new Producto("Crema","489304"));
        c2.addProducto(new Producto("Pestañina","0954"));
        c2.addProducto(new Producto("Esmalte","764933"));
        c2.addProducto(new Producto("Polvos","123456"));
        c2.addProducto(new Producto("Labial","8765643"));
        c2.addProducto(new Producto("Secador","9876214"));
        
        c1.getProductos().get(0).addItem(new Item("Rey","124554"));
        c1.getProductos().get(1).addItem(new Item("Savital","54364"));
        c1.getProductos().get(2).addItem(new Item("Colgate","43654"));
        c1.getProductos().get(3).addItem(new Item("Ego","98765"));
        c1.getProductos().get(4).addItem(new Item("Ponds","87654"));
        c2.getProductos().get(0).addItem(new Item("Riac","76543"));
        c2.getProductos().get(1).addItem(new Item("chuci","876543"));
        c2.getProductos().get(2).addItem(new Item("turo","754634"));
        c2.getProductos().get(3).addItem(new Item("juito","64335"));
        c2.getProductos().get(4).addItem(new Item("BB","80432132"));
        
        c1.getProductos().get(0).getItems().get(0).setCostoUnidad(45645);
        c1.getProductos().get(1).getItems().get(0).setCostoUnidad(76574);
        c1.getProductos().get(2).getItems().get(0).setCostoUnidad(55000);
        c1.getProductos().get(3).getItems().get(0).setCostoUnidad(22000);
        c1.getProductos().get(4).getItems().get(0).setCostoUnidad(33000);
        c2.getProductos().get(0).getItems().get(0).setCostoUnidad(42000);
        c2.getProductos().get(1).getItems().get(0).setCostoUnidad(44500);
        c2.getProductos().get(2).getItems().get(0).setCostoUnidad(56000);
        c2.getProductos().get(3).getItems().get(0).setCostoUnidad(66000);
        c2.getProductos().get(4).getItems().get(0).setCostoUnidad(99000);
        
        c1.informacionTotalProductos();
        c2.informacionTotalProductos();
    }
    
}
