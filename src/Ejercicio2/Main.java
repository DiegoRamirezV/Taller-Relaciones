/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco AvVillas = new Banco("000457869");
        Cuenta c1 = new Cuenta(1234,350000,"David Luna");
        Cuenta c2 = new Cuenta(5678,600000,"Pedro Villa");
        Tipo t1 = new Tipo("000567");
        Tipo t2 = new Tipo("000234");
        
        AvVillas.addCuenta(c1);
        AvVillas.addCuenta(c2);
        
        c1.addMovimientos(new Movimiento(t1,678000));
        c1.addMovimientos(new Movimiento(t2,200000));
        c2.addMovimientos(new Movimiento(t1,100000));
        c2.addMovimientos(new Movimiento(t2,346000));
        
        AvVillas.InformacionBanco();
    }
    
}
