/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.io.*;


/**
 *
 * @author Estudiante
 */
public class UnidadInvestigacionMeteorologica {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       File f= new File("Salida.txt");
        Ciudad b= new Ciudad("Bogota");
        FileWriter fw= new FileWriter(f);
        fw.write(b.Registro());
        fw.write(b.getNombre()+"Hola");
        fw.close();
    }
}
