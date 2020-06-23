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
public class Estudiante {
    
    private int est_id;
    private String est_cedula;
    private String est_nombres;
    private String est_direccion;
    private String est_telefono;

    public Estudiante(int est_id, String est_cedula, String est_nombres, String est_direccion, String est_telefono) {
        this.est_id = est_id;
        this.est_cedula = est_cedula;
        this.est_nombres = est_nombres;
        this.est_direccion = est_direccion;
        this.est_telefono = est_telefono;
    }
    
    public int getEst_id() {
        return est_id;
    }

    public void setEst_id(int est_id) {
        this.est_id = est_id;
    }

    public String getEst_cedula() {
        return est_cedula;
    }

    public void setEst_cedula(String est_cedula) {
        this.est_cedula = est_cedula;
    }

    public String getEst_nombres() {
        return est_nombres;
    }

    public void setEst_nombres(String est_nombres) {
        this.est_nombres = est_nombres;
    }

    public String getEst_direccion() {
        return est_direccion;
    }

    public void setEst_direccion(String est_direccion) {
        this.est_direccion = est_direccion;
    }

    public String getEst_telefono() {
        return est_telefono;
    }

    public void setEst_telefono(String est_telefono) {
        this.est_telefono = est_telefono;
    }
    
    
}
