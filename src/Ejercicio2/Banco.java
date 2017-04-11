/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Banco {
    private String codigo;
    private ArrayList<Tipo> tipos;
    private ArrayList<Cuenta> cuentas;

    public Banco(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void addTipo(Tipo tipo) {
        this.tipos.add(tipo);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void addCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }
    
}
