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
public class Veterinaria {
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    
    public Veterinaria() {
        
    }
    
    public void eliminarMascota(Mascota mascota){
        this.mascotas.remove(mascota);
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void addMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }
    
    public void mostrarMascotaPorTipo(String tipo){
            for (int i = 0; i < mascotas.size(); i++) {
                if (mascotas.get(i).getTipo()==tipo){
                Mascota m = mascotas.get(i);
                
                System.out.println("Id " + m.getId() + "\n" +
                                    "Nombre " + m.getNombre() + "\n" +
                                    "Color " + m.getColor()+"\n");
                }else{
                    System.out.println("No hay mascotas de ese tipo");
                }
        }
    }
    
    
}
