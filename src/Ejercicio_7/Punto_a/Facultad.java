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
public class Facultad extends Empleado {

    
    public static void main(String[] args) {
        new Facultad();
        
        /*
        Aca como la clase hace un extends Empleado significa que hay herencia de la clase Empleado y por lo tanto se heredan los 
        atributos protegidos y los metodos publicos, y asi mismo Empleado hereda de Persona.
        Como estamos creando una Facultad, esta hereda de Empleado, asi pues, sera ("creara") un Empleado, y este a su vez, sera
        ("creara") una Persona. Pues segun el codigo, una facultad, es un empleado, que a su vez es una persona.
        Al crear una facultad, vemos que el constructor arroja un mensaje, pero al crear la facultad estamos "creando" un 
        empleado, entonces se llama el contructor de Empleado, el cual arrojara dos mensajes (aca utliza el contructor de Empleado 
        que no recibe nada), y seguidamente se "creara" una Persona, entonces se llama tambien el constructor de Persona, el cual
        arroja un mensaje.
        Al final recibiremos los mensajes de contructor de las tres clases.
        Cabe aclarar que al crear una Facultad estamos creando no tres, sino un unico objeto de tipo Facultad pero que hereda
        lo de las superclases.
        */
    }

    public Facultad() {
        System.out.println("Realizar tareas de la Facultad");
    }

    
    
    
    
}
