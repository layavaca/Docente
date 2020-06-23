/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.administrador.modelo;

import java.util.Date;

/**
 *
 * @author Monik
 */
public class Docente extends Persona{
    private String doc_titulo;
    private double doc_sueldo;
    private Carrera carrera;

     public Docente(String doc_titulo, double doc_sueldo, Carrera carrera, int per_id, String per_nombre, String per_cedula, Date per_fecha_naciminto, String per_telefono, String per_direccion, String per_email, String per_password) {
        super(per_id, per_nombre, per_cedula, per_fecha_naciminto, per_telefono, per_direccion, per_email, per_password);
        this.doc_titulo = doc_titulo;
        this.doc_sueldo = doc_sueldo;
        this.carrera = carrera;
    }
     
    public String getDoc_titulo() {
        return doc_titulo;
    }

    public void setDoc_titulo(String doc_titulo) {
        this.doc_titulo = doc_titulo;
    }

    public double getDoc_sueldo() {
        return doc_sueldo;
    }

    public void setDoc_sueldo(double doc_sueldo) {
        this.doc_sueldo = doc_sueldo;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
            
    
    
}
