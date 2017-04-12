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
public class Programacion {
    private ArrayList<Sala> salas = new ArrayList<Sala>();

    public Programacion() {
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void addSala(Sala sala) {
        this.salas.add(sala);
    }
    
    public void programacionTotal(){
        for (int i=0 ; i<salas.size() ; i++){
            Sala s = salas.get(i);
            for (int j = 0; j < s.getSemanas().size(); j++) {
                Semana sem = s.getSemanas().get(j);
                for (int k = 0; k < sem.getDiasHabiles().length; k++) {
                    if((sem.getDiasHabiles()[k])!=null){
                    Dia d = sem.getDiasHabiles()[k];
                    
                    
                    System.out.println("Sala: "+ s.getNombre()+ "\n"+ 
                                           "Semana: " + sem.getNumero() + "\n" +
                                           "Dia: " + d.getNombre() + "\n" +
                                           "Fecha: "+ d.getFecha() + "\n" +
                                           "Segmentos Disponibles: \n");
                    for (int l = 0; l < d.getSegmentos().size(); l++) {
                        Segmento seg = d.getSegmentos().get(l);
                        
                        System.out.println("segmento "+ (l+1) + "\n"+
                                           "hora inicio: " + seg.getHoraInicio()+ "\n" +
                                           "hora fin: " + seg.getHoraFin()+ "\n");                        
                    }
                    }
                }
               
            }
        }
    
    }
}
