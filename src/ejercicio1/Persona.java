/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private ArrayList<Vehiculo> vehiculos;

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void addVehiculo(Vehiculo v) {
        this.vehiculos.add(v);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void Vehiculos(){
        for (int i=0;i<vehiculos.size();i++){
            Vehiculo v= vehiculos.get(i);
            System.out.println("Vehiculo " +(i+1) + "\n" +
                    "Marca " +  v.getMarca() + "\n" +
                    "Chasis "+  v.getChasis() + "\n" +
                    "Motor " +  v.getMotor() + "\n");        
        }
    
    }
    
    
}
