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
public class Det_Materia {
    private int det_id;
    private int det_nivel;
    private Det_Notas notas;
    private Det_Estudiante det_estudiante;
    private Recor_Academico record;

    public Det_Materia(int det_id, int det_nivel, Det_Notas notas,Det_Estudiante det_estudiante, Recor_Academico record ) {
        this.det_id = det_id;
        this.det_nivel = det_nivel;
        this.notas = notas;
        this.det_estudiante = det_estudiante;
        this.record =  record;
    }
    
    public int getDet_id() {
        return det_id;
    }

    public void setDet_id(int det_id) {
        this.det_id = det_id;
    }

    public int getDet_nivel() {
        return det_nivel;
    }

    public void setDet_nivel(int det_nivel) {
        this.det_nivel = det_nivel;
    }

    public Det_Notas getNotas() {
        return notas;
    }

    public void setNotas(Det_Notas notas) {
        this.notas = notas;
    }

    public agp.estudiante.modelo.Det_Estudiante getDet_estudiante() {
        return det_estudiante;
    }

    public void setDet_estudiante(agp.estudiante.modelo.Det_Estudiante det_estudiante) {
        this.det_estudiante = det_estudiante;
    }

    public Recor_Academico getRecord() {
        return record;
    }

    public void setRecord(Recor_Academico record) {
        this.record = record;
    }

    
    
}
