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
public class Persona {
    private int per_id;
    private String per_nombre;
    private String per_cedula;
    private Date per_fecha_naciminto;
    private String per_telefono;
    private String per_direccion;
    private String per_email;
    private String per_password;
    
      public Persona(int per_id, String per_nombre, String per_cedula, Date per_fecha_naciminto, String per_telefono, String per_direccion, String per_email, String per_password) {
        this.per_id = per_id;
        this.per_nombre = per_nombre;
        this.per_cedula = per_cedula;
        this.per_fecha_naciminto = per_fecha_naciminto;
        this.per_telefono = per_telefono;
        this.per_direccion = per_direccion;
        this.per_email = per_email;
        this.per_password = per_password;
    } 
      
    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    public String getPer_cedula() {
        return per_cedula;
    }

    public void setPer_cedula(String per_cedula) {
        this.per_cedula = per_cedula;
    }

    public Date getPer_fecha_naciminto() {
        return per_fecha_naciminto;
    }

    public void setPer_fecha_naciminto(Date per_fecha_naciminto) {
        this.per_fecha_naciminto = per_fecha_naciminto;
    }

    public String getPer_telefono() {
        return per_telefono;
    }

    public void setPer_telefono(String per_telefono) {
        this.per_telefono = per_telefono;
    }

    public String getPer_direccion() {
        return per_direccion;
    }

    public void setPer_direccion(String per_direccion) {
        this.per_direccion = per_direccion;
    }

    public String getPer_email() {
        return per_email;
    }

    public void setPer_email(String per_email) {
        this.per_email = per_email;
    }

    public String getPer_password() {
        return per_password;
    }

    public void setPer_password(String per_password) {
        this.per_password = per_password;
    }

  
    
}

