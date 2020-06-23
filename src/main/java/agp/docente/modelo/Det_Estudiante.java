/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.docente.modelo;

/**
 *
 * @author Monik
 */
public class Det_Estudiante {
    
    private int det_id;
    private Carrera carrera;
    private Estudiante estudiante;
    private Det_Materia detalleMateria;

    public Det_Estudiante(int det_id, Carrera carrera, Estudiante estudiante, Det_Materia detalleMateria) {
        this.det_id = det_id;
        this.carrera = carrera;
        this.estudiante = estudiante;
        this.detalleMateria = detalleMateria;
    }

    
    public int getDet_id() {
        return det_id;
    }

    public void setDet_id(int det_id) {
        this.det_id = det_id;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Det_Materia getDetalleMateria() {
        return detalleMateria;
    }

    public void setDetalleMateria(Det_Materia detalleMateria) {
        this.detalleMateria = detalleMateria;
    }
    
    
}
