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
public class Semana {
    private int numero;
    private Dia[] diasHabiles = new Dia[5];
    private ArrayList<Sala> salas = new ArrayList<Sala>();

    public Semana(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Dia[] getDiasHabiles() {
        return diasHabiles;
    }

    public void addDiaHabil(int i,Dia diaHabil) {
        this.diasHabiles[i]=diaHabil;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void addSala(Sala sala) {
        this.salas.add(sala);
    }
    
    public ArrayList<Segmento> getDiasLibres(int dia) {
        return this.diasHabiles[dia].getSegmentos();
    }
    
    
}
