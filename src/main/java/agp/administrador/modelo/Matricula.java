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
public class Matricula {
   private int ins_id;
   private Date ins_fecha;
   private String ins_hora;
   private Estudiante ins_estudiantes;
   private Carrera ins_carrera;   

    public Matricula(int ins_id, Date ins_fecha, String ins_hora, Estudiante ins_estudiantes, Carrera ins_carrera) {
        this.ins_id = ins_id;
        this.ins_fecha = ins_fecha;
        this.ins_hora = ins_hora;
        this.ins_estudiantes = ins_estudiantes;
        this.ins_carrera = ins_carrera;
    }
    
    public int getIns_id() {
        return ins_id;
    }

    public void setIns_id(int ins_id) {
        this.ins_id = ins_id;
    }

    public Date getIns_fecha() {
        return ins_fecha;
    }

    public void setIns_fecha(Date ins_fecha) {
        this.ins_fecha = ins_fecha;
    }

    public String getIns_hora() {
        return ins_hora;
    }

    public void setIns_hora(String ins_hora) {
        this.ins_hora = ins_hora;
    }

    public Estudiante getIns_estudiantes() {
        return ins_estudiantes;
    }

    public void setIns_estudiantes(Estudiante ins_estudiantes) {
        this.ins_estudiantes = ins_estudiantes;
    }

    public Carrera getIns_carrera() {
        return ins_carrera;
    }

    public void setIns_carrera(Carrera ins_carrera) {
        this.ins_carrera = ins_carrera;
    }
   
   
}
