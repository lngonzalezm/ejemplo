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
public  class Ciudad {
    private String Nombre;

    public Ciudad(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    ArrayList<Sensor> sensores=new ArrayList<>();
    String a,b,c;
    EstacionMeteorologica e= new EstacionMeteorologica(a,b,c,sensores);
    ArrayList<EstacionMeteorologica> NumEstacionesRegistradas= new ArrayList<>();
    
    public  void Registro(){
        for (int i = 0; i < NumEstacionesRegistradas.size(); i++){
            NumEstacionesRegistradas.get(i).getNombreEstacion();
            sensores.size();
            NumEstacionesRegistradas.get(i).getFechaInstalacion();
            sensores.get(i).getFechaInstalacionSensor();
            sensores.get(i).getTemperatura();
            sensores.get(i).getMmAguaLluviaPorMin();
            sensores.get(i).getNivelCargaElectrica();
        }     
    }
}
