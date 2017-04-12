/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class Dia {
    private Date fecha;
    private String nombre;
    private ArrayList<Segmento> segmentos = new ArrayList<Segmento>();

    public Dia(Date fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Segmento> getSegmentos() {
        return segmentos;
    }

    public void addSegmento(Segmento segmento) {
        this.segmentos.add(segmento);
    }
    
    
}
