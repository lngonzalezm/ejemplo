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
public abstract class Sensor {
    protected String Marca;
    protected String Referencia;
    protected String FechaInstalacionSensor;

    public Sensor(String Marca, String Referencia, String FechaInstalacionSensor) {
        this.Marca = Marca;
        this.Referencia = Referencia;
        this.FechaInstalacionSensor = FechaInstalacionSensor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getFechaInstalacionSensor() {
        return FechaInstalacionSensor;
    }

    public void setFechaInstalacionSensor(String FechaInstalacionSensor) {
        this.FechaInstalacionSensor = FechaInstalacionSensor;
    }
    public abstract double getTemperatura();
    public abstract String getNivelCargaElectrica() ;
    public abstract double getMmAguaLluviaPorMin();

    @Override
    public String toString() {
        return "Sensor{" + "Marca=" + Marca + ", Referencia=" + Referencia + ", FechaInstalacionSensor=" + FechaInstalacionSensor + '}';
    }
    
    
}
