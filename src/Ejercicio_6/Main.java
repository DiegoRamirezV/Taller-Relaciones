/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Main {

    
    public static void readPets(Veterinaria v){
        System.out.println("Mascotas en la Veterinaria: \n ************************** \n");
        for (int i = 0; i < v.getMascotas().size(); i++) {
            Mascota m = v.getMascotas().get(i);
            
            System.out.println("Id mascota: " + m.getId() + "\n" +
                               "Nombre mascota: " + m.getNombre() + "\n" +
                               "color mascota: " + m.getColor() + "\n" +
                               "tipo mascota: " + m.getTipo() + "\n" +
                               "dueño: " + m.getDueño().getNombre() + "\n" );
        }
    }
        
    
    public static void main(String[] args) {
        
        Perro p1 = new Perro("Pastor Aleman","000346","Lucas");
        Perro p2 = new Perro("Pastor Collie","000487","Lazzie");
        Gato g1 = new Gato("000830","Misifú");
        Gato g2 = new Gato("000249","Gatubelo");
        Hamster h1 = new Hamster(350,"000758","Bruno");
        Hamster h2 = new Hamster(280,"000298","Puplin");
        
        Persona per1 = new Persona("Pedro","10384783");
        Persona per2 = new Persona("Juan","10839001");
        
        p1.setDueño(per1);
        p1.setTipo("perro");
        g1.setDueño(per1);
        g1.setTipo("gato");
        h1.setDueño(per1);
        h1.setTipo("hamster");
        p2.setDueño(per2);
        p2.setTipo("perro");
        g2.setDueño(per2);
        g2.setTipo("gato");
        h2.setDueño(per2);
        h2.setTipo("hasmter");
        
        Veterinaria v = new Veterinaria();
        v.addMascota(p1);
        v.addMascota(p2);
        v.addMascota(g1);
        v.addMascota(g2);
        v.addMascota(h1);
        v.addMascota(h2);
        
        v.mostrarMascotaPorTipo("perro");
        readPets(v);
    }
    
}
