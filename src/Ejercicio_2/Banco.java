/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Banco {
    private String codigo;
    private ArrayList<Tipo> tipos = new ArrayList<Tipo>();
    private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

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
    
    public void InformacionBanco(){
        for (int i=0 ; i < this.cuentas.size(); i++){
            Cuenta c = this.cuentas.get(i);
            
            System.out.println("Cuenta " + (i+1) + "\n" +
                               "Titular de la Cuenta: " +c.getNombreCliente()+ "\n"+
                               "Número de Cuenta: " + c.getNumCuenta() + "\n" +
                                "Saldo Cuenta: " + c.getSaldoCuenta() + "\n" +
                                "Fecha de Creación: " + c.getFechaCreacion() + "\n");
            System.out.println("Movimientos cuenta: " + (i+1) + "\n");
            for (int j=0; j<c.getMovimientos().size();j++){
                 Movimiento m = c.getMovimientos().get(j);
                 System.out.println("Movimiento " + (j+1) + "\n" + 
                                    "Tipo: " + m.getTipo().getCodigo() + "\n" +
                                    "Fecha : " +m.getFecha() + "\n" +
                                    "Monto: " + m.getMonto() + "\n" );
            }
        }
    
    }
}
