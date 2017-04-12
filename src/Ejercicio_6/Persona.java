/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Persona {
    private String nombre;
    private String id;
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>(); 

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void addMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }
    
    public void mostrarMascotas(){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            
            System.out.println("Mascotas:" + "\n" + "********** \n" );
            System.out.println("Mascota " + (i+1) + "\n" +
                               "Id " + m.getId() + "\n" + 
                               "Nombre " + m.getNombre() + "\n" + 
                               "Color " + m.getColor() + "\n");
        }
    }
}
