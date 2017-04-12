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
public class Hamster extends Mascota{
    
    private double peso;

    public Hamster(double peso, String id, String nombre) {
        super(id, nombre);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public void sonido(){
        System.out.println("Prrrr Prrrr!!");
    }
}
