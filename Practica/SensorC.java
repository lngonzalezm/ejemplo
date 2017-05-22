/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

/**
 *
 * @author Estudiante
 */
public abstract class SensorC extends Sensor{
    private String nivelCargaElectrica;

    public SensorC(String nivelCargaElectrica, String Marca, String Referencia, String FechaInstalacionSensor) {
        super(Marca, Referencia, FechaInstalacionSensor);
        this.nivelCargaElectrica = nivelCargaElectrica;
    }

    @Override
    public String getNivelCargaElectrica() {
        return nivelCargaElectrica;
    }

    public void setNivelCargaElectrica(String nivelCargaElectrica) {
        this.nivelCargaElectrica = nivelCargaElectrica;
    }

    @Override
    public String toString() {
        return "SensorC{" + "nivelCargaElectrica=" + nivelCargaElectrica + '}'+"Sensor{" + "Marca=" + Marca + ", Referencia=" + Referencia + ", FechaInstalacionSensor=" + FechaInstalacionSensor + '}';
    }
    
    
    
}
