/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.matricula.modelo;

/**
 *
 * @author Monik
 */
public class Horario {
    private int hor_id;
    private String hor_dias;
    private String hor_hora;
    private Grupo hor_grupo;
    private Materia hor_materia;
    private Carrera hor_carrera;

    public Horario(int hor_id, String hor_dias, String hor_hora, Grupo hor_grupo, Materia hor_materia, Carrera hor_carrera) {
        this.hor_id = hor_id;
        this.hor_dias = hor_dias;
        this.hor_hora = hor_hora;
        this.hor_grupo = hor_grupo;
        this.hor_materia = hor_materia;
        this.hor_carrera = hor_carrera;
    }

    
    public int getHor_id() {
        return hor_id;
    }

    public void setHor_id(int hor_id) {
        this.hor_id = hor_id;
    }

    public String getHor_dias() {
        return hor_dias;
    }

    public void setHor_dias(String hor_dias) {
        this.hor_dias = hor_dias;
    }

    public String getHor_hora() {
        return hor_hora;
    }

    public void setHor_hora(String hor_hora) {
        this.hor_hora = hor_hora;
    }

    public Grupo getHor_grupo() {
        return hor_grupo;
    }

    public void setHor_grupo(Grupo hor_grupo) {
        this.hor_grupo = hor_grupo;
    }

    public Materia getHor_materia() {
        return hor_materia;
    }

    public void setHor_materia(Materia hor_materia) {
        this.hor_materia = hor_materia;
    }

    public Carrera getHor_carrera() {
        return hor_carrera;
    }

    public void setHor_carrera(Carrera hor_carrera) {
        this.hor_carrera = hor_carrera;
    }
    
    
}
