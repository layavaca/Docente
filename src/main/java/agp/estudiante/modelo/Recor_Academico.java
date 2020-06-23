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
public class Recor_Academico {
    private int rec_id;
    private String rec_nivel;
    private String rec_estado;

    public Recor_Academico(int rec_id, String rec_nivel, String rec_estado) {
        this.rec_id = rec_id;
        this.rec_nivel = rec_nivel;
        this.rec_estado = rec_estado;
    }

    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public String getRec_nivel() {
        return rec_nivel;
    }

    public void setRec_nivel(String rec_nivel) {
        this.rec_nivel = rec_nivel;
    }

    public String getRec_estado() {
        return rec_estado;
    }

    public void setRec_estado(String rec_estado) {
        this.rec_estado = rec_estado;
    }
    
}
