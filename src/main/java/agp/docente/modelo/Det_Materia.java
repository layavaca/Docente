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
public class Det_Materia {
    private int det_id;
    private int det_nivel;
    private Det_Notas notas;
    private Grupo grupo;
    private Horario horario;

    public Det_Materia(int det_id, int det_nivel, Det_Notas notas, Grupo grupo, Horario horario) {
        this.det_id = det_id;
        this.det_nivel = det_nivel;
        this.notas = notas;
        this.grupo = grupo;
        this.horario = horario;
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

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
}
