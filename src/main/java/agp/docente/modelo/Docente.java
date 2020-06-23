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
public class Docente {
    private int doc_id;
    private String doc_cedula;
    private String doc_nombres;
    private String doc_direccion;
    private String doc_telefono;
    private String doc_titulo;
    private double doc_sueldo;

    public Docente(int doc_id, String doc_cedula, String doc_nombres, String doc_direccion, String doc_telefono, String doc_titulo, double doc_sueldo) {
        this.doc_id = doc_id;
        this.doc_cedula = doc_cedula;
        this.doc_nombres = doc_nombres;
        this.doc_direccion = doc_direccion;
        this.doc_telefono = doc_telefono;
        this.doc_titulo = doc_titulo;
        this.doc_sueldo = doc_sueldo;
    }

    
    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_cedula() {
        return doc_cedula;
    }

    public void setDoc_cedula(String doc_cedula) {
        this.doc_cedula = doc_cedula;
    }

    
    
    public String getDoc_nombres() {
        return doc_nombres;
    }

    public void setDoc_nombres(String doc_nombres) {
        this.doc_nombres = doc_nombres;
    }

    public String getDoc_direccion() {
        return doc_direccion;
    }

    public void setDoc_direccion(String doc_direccion) {
        this.doc_direccion = doc_direccion;
    }

    public String getDoc_telefono() {
        return doc_telefono;
    }

    public void setDoc_telefono(String doc_telefono) {
        this.doc_telefono = doc_telefono;
    }

    public String getDoc_titulo() {
        return doc_titulo;
    }

    public void setDoc_titulo(String doc_titulo) {
        this.doc_titulo = doc_titulo;
    }

    public double getDoc_sueldo() {
        return doc_sueldo;
    }

    public void setDoc_sueldo(double doc_sueldo) {
        this.doc_sueldo = doc_sueldo;
    }
    
    
}
