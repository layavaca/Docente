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
public class Carrera {
    private int car_id;
    private String car_nombre;
    private String car_modallidad;

    public Carrera(int car_id, String car_nombre, String car_modallidad) {
        this.car_id = car_id;
        this.car_nombre = car_nombre;
        this.car_modallidad = car_modallidad;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_nombre() {
        return car_nombre;
    }

    public void setCar_nombre(String car_nombre) {
        this.car_nombre = car_nombre;
    }

    public String getCar_modallidad() {
        return car_modallidad;
    }

    public void setCar_modallidad(String car_modallidad) {
        this.car_modallidad = car_modallidad;
    }
    
    
}
