/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Estudiante
 */
public class Vehiculo {
    private String marca;
    private Motor motor;
    private Chasis chasis;
    private Rueda[] ruedas;
    

    public Vehiculo(Motor motor, String marca,int id, String clase) {
        this.marca=marca;
        this.motor = motor;
        this.chasis = new Chasis(id,clase);
        this.ruedas = new Rueda[4];
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMotor() {
        return motor.getPotencia();
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis.getClase();
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void addRueda(Rueda r, int i) {
       if(0<i && i<5){
        this.ruedas[i-1]=r;
       }else{
           System.out.println("Ese numero de rueda no existe");
       }
    }

    

    
    
    
}
