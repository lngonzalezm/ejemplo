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
public abstract class SensorA extends Sensor{
    private double mmAguaLluviaPorMin;

    public SensorA(double mmAguaLluviaPorMin, String Marca, String Referencia, String FechaInstalacionSensor) {
        super(Marca, Referencia, FechaInstalacionSensor);
        this.mmAguaLluviaPorMin = mmAguaLluviaPorMin;
    }

    @Override
    public double getMmAguaLluviaPorMin() {
        return mmAguaLluviaPorMin;
    }

    public void setMmAguaLluviaPorMin(double mmAguaLluviaPorMin) {
        this.mmAguaLluviaPorMin = mmAguaLluviaPorMin;
    }

    @Override
    public String toString() {
        return "SensorA{" + "mmAguaLluviaPorMin=" + mmAguaLluviaPorMin + '}'+"Sensor{" + "Marca=" + Marca + ", Referencia=" + Referencia + ", FechaInstalacionSensor=" + FechaInstalacionSensor + '}';
    }
}
