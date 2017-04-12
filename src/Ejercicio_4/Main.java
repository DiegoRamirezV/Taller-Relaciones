/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f1 = new Fecha(30,11,1993);
        Persona p1 = new Persona("Juan Romero");
        p1.setFecha(f1);
        
        Persona p2 = new Persona("Roman Ruiz");
        p2.setFecha(new Fecha(26,12,1992));
        
    }
    
}
