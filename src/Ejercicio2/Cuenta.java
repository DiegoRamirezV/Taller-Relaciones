/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Diego
 */
public class Cuenta {
    private int numCuenta;
    private double saldoCuenta;
    private Date fechaCreacion;
    private String nombreCliente;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(int numCuenta, double saldoCuenta, String nombreCliente) {
        this.numCuenta = numCuenta;
        this.saldoCuenta = saldoCuenta;
        this.nombreCliente = nombreCliente;
        this.fechaCreacion = new java.util.Date();
        this.movimientos = new ArrayList<Movimiento>();
        
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double Cantidad) {
        this.saldoCuenta =  Cantidad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void addMovimientos(Movimiento movimiento) {
        this.movimientos.add(movimiento);
    }
    
    
    
}
