/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Diego","123214");
        Motor m1 = new Motor(2000);
        Motor m2 = new Motor(2400);
        Rueda r1 = new Rueda(24);
        Rueda r2 = new Rueda(19);
        
        Vehiculo v1 = new Vehiculo(m1, "Subaru",1234,"Camioneta");
        Vehiculo v2 = new Vehiculo(m2, "Toyota",5678,"Sedan");
        
        p1.addVehiculo(v1);
        p1.addVehiculo(v2);
        
        p1.Vehiculos();
    }
    
}
