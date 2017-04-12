/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Sala {
    private String nombre;
    private ArrayList<Semana> semanas = new ArrayList<Semana>();

    public Sala() {
    }

    public Sala(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Semana> getSemanas() {
        return semanas;
    }

    public void addSemana(Semana semana) {
        this.semanas.add(semana);
    }
    
    
}
