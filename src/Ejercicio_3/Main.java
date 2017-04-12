/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sala s1 = new Sala("Premium");
        Sala s2 = new Sala("Platino");
        Semana sem1 = new Semana(1);
        Semana sem2 = new Semana(2);
        Semana sem3 = new Semana(3);
        Semana sem4 = new Semana(4);
        
        Dia d1 = new Dia(new java.util.Date(2017, 04, 10, 8, 15, 23),"Lunes");
        Dia d2 = new Dia(new java.util.Date(2017, 04, 12, 10, 15, 23),"Martes");
        Dia d3 = new Dia(new java.util.Date(2017, 04, 14, 11, 20, 15),"Viernes");
        d1.addSegmento(new Segmento(81523,101523));
        d1.addSegmento(new Segmento(120000,140000));
        d2.addSegmento(new Segmento(90000,110000));
        d2.addSegmento(new Segmento(110000,130000));
        d3.addSegmento(new Segmento(160000,180000));
        d3.addSegmento(new Segmento(180000,200000));
        sem1.addDiaHabil(0, d1);
        sem1.addDiaHabil(1, d3);
        sem2.addDiaHabil(0, d2);
        sem2.addDiaHabil(1, d3);
        s1.addSemana(sem1);
        s1.addSemana(sem2);
        
        Dia d4 = new Dia(new java.util.Date(2017, 04, 16, 8, 15, 23),"Martes");
        Dia d5 = new Dia(new java.util.Date(2017, 04, 18, 10, 15, 23),"Miercoles");
        Dia d6 = new Dia(new java.util.Date(2017, 04, 20, 11, 20, 15),"Viernes");
        d4.addSegmento(new Segmento(110000,130000));
        d4.addSegmento(new Segmento(120000,140000));
        d5.addSegmento(new Segmento(90000,110000));
        d5.addSegmento(new Segmento(110000,130000));
        d6.addSegmento(new Segmento(160000,180000));
        d6.addSegmento(new Segmento(180000,200000));
        sem3.addDiaHabil(0, d1);
        sem3.addDiaHabil(1, d3);
        sem4.addDiaHabil(0, d2);
        sem4.addDiaHabil(1, d3);
        s2.addSemana(sem3);
        s2.addSemana(sem4);
        
        Programacion p1 = new Programacion();
        p1.addSala(s1);
        p1.addSala(s2);
        
        p1.programacionTotal();
        
    }
    
}
