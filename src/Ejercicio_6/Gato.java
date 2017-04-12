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
public class Gato extends Mascota{
    
    private boolean esCazador;
    

    
    public Gato(String id, String nombre) {
        super(id, nombre);
        
        
    }

    public boolean isEsCazador() {
        return esCazador;
    }

    public void setEsCazador(boolean esCazador) {
        this.esCazador = esCazador;
    }
    
    @Override
    public void sonido(){
        System.out.println("Miau Miau !!");
    }
    
    
}
