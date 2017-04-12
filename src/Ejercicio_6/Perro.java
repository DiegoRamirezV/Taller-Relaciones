/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

/**
 *
 * @author Diego
 */
public class Perro extends Mascota{
    
    private String raza;

    public Perro(String raza, String id, String nombre) {
        super(id, nombre);
        this.raza = raza;
        
    }
    

   
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    @Override
    public void sonido(){
        System.out.println("Guau Guau !!");
    }
    
   
}
