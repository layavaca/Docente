/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.estudiante.modelo;


/**
 *
 * @author Monik
 */
public class Horario {
    private int hor_id;
    private String hor_dias;
    private String hor_hora;
    private Materia materia;
    private Grupo grupo;
    private Carrera carrera;

    public Horario(int hor_id, String hor_dias, String hor_hora, Materia materia, Grupo grupo, Carrera carrera) {
        this.hor_id = hor_id;
        this.hor_dias = hor_dias;
        this.hor_hora = hor_hora;
        this.materia = materia;
        this.grupo = grupo;
        this.carrera = carrera;
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

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

}
