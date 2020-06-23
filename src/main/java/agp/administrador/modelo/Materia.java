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
public class Materia {
    
private int mat_id;
private String mat_nombre;
private int mat_codigo;

    public Materia(int mat_id, String mat_nombre, int mat_codigo) {
        this.mat_id = mat_id;
        this.mat_nombre = mat_nombre;
        this.mat_codigo = mat_codigo;
    }

    public int getMat_id() {
        return mat_id;
    }

    public void setMat_id(int mat_id) {
        this.mat_id = mat_id;
    }

    public String getMat_nombre() {
        return mat_nombre;
    }

    public void setMat_nombre(String mat_nombre) {
        this.mat_nombre = mat_nombre;
    }

    public int getMat_codigo() {
        return mat_codigo;
    }

    public void setMat_codigo(int mat_codigo) {
        this.mat_codigo = mat_codigo;
    }

}
