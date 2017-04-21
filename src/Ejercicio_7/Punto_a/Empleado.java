/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7.Punto_a;

/**
 *
 * @author Diego
 */
public class Empleado extends Persona{

    public Empleado(){
        this("Invocar empleado");
        System.out.println("Realizar Tareas del Empleado");
    }
    
    public Empleado(String s) {
        System.out.println(s);
    }
    
}
