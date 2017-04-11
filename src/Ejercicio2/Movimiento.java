/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Movimiento {
    private Date fecha;
    private double saldoAnterior;
    private double monto;
    private Tipo tipo;

    public Movimiento(Date fecha, double monto) {
        this.fecha = fecha;
        this.monto = monto;
        
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(String codigo_tipo) {
        this.tipo = new Tipo(codigo_tipo);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
