/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.estudiante.modelo;

import java.util.Date;

/**
 *
 * @author Monik
 */
public class Estudiante {
    private int est_id;
    private String est_nombre;
    private String est_cedula;
    private Date est_fecha_naciminto;
    private String est_telefono;
    private String est_direccion;
    private String est_email;
    private String est_password;

    public Estudiante(int est_id, String est_nombre, String est_cedula, Date est_fecha_naciminto, String est_telefono, String est_direccion, String est_email, String est_password) {
        this.est_id = est_id;
        this.est_nombre = est_nombre;
        this.est_cedula = est_cedula;
        this.est_fecha_naciminto = est_fecha_naciminto;
        this.est_telefono = est_telefono;
        this.est_direccion = est_direccion;
        this.est_email = est_email;
        this.est_password = est_password;
    }

    public int getEst_id() {
        return est_id;
    }

    public void setEst_id(int est_id) {
        this.est_id = est_id;
    }

    public String getEst_nombre() {
        return est_nombre;
    }

    public void setEst_nombre(String est_nombre) {
        this.est_nombre = est_nombre;
    }

    public String getEst_cedula() {
        return est_cedula;
    }

    public void setEst_cedula(String est_cedula) {
        this.est_cedula = est_cedula;
    }

    public Date getEst_fecha_naciminto() {
        return est_fecha_naciminto;
    }

    public void setEst_fecha_naciminto(Date est_fecha_naciminto) {
        this.est_fecha_naciminto = est_fecha_naciminto;
    }

    public String getEst_telefono() {
        return est_telefono;
    }

    public void setEst_telefono(String est_telefono) {
        this.est_telefono = est_telefono;
    }

    public String getEst_direccion() {
        return est_direccion;
    }

    public void setEst_direccion(String est_direccion) {
        this.est_direccion = est_direccion;
    }

    public String getEst_email() {
        return est_email;
    }

    public void setEst_email(String est_email) {
        this.est_email = est_email;
    }

    public String getEst_password() {
        return est_password;
    }

    public void setEst_password(String est_password) {
        this.est_password = est_password;
    }
    
    
}
