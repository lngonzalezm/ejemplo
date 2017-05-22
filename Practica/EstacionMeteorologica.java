/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class EstacionMeteorologica {
    private String nombreEstacion;
    private String ubicacion;
    private String FechaInstalacion;
    ArrayList <Sensor> s= new ArrayList<>();

    public EstacionMeteorologica(String nombreEstacion, String ubicacion, String FechaInstalacion,ArrayList s) {
        this.nombreEstacion = nombreEstacion;
        this.ubicacion = ubicacion;
        this.FechaInstalacion = FechaInstalacion;
        this.s= new ArrayList<>();
    }

    

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFechaInstalacion() {
        return FechaInstalacion;
    }

    public void setFechaInstalacion(String FechaInstalacion) {
        this.FechaInstalacion = FechaInstalacion;
    }

    @Override
    public String toString() {
        return "EstacionMeteorologica{" + "nombreEstacion=" + nombreEstacion + ", ubicacion=" + ubicacion + ", FechaInstalacion=" + FechaInstalacion + ", s=" + s + '}';
    }

}
