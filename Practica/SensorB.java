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
public abstract class SensorB extends Sensor{
   private double Temperatura; 

    public SensorB(double Temperatura, String Marca, String Referencia, String FechaInstalacionSensor) {
        super(Marca, Referencia, FechaInstalacionSensor);
        this.Temperatura = Temperatura;
    }

   @Override
    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double Temperatura) {
        this.Temperatura = Temperatura;
    }

    @Override
    public String toString() {
        return "SensorB{" + "Temperatura=" + Temperatura + '}'+"Sensor{" + "Marca=" + Marca + ", Referencia=" + Referencia + ", FechaInstalacionSensor=" + FechaInstalacionSensor + '}';
    }
    
}
