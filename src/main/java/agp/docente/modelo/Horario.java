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
public class Horario {
    private int hor_id;
    private String hor_dias;
    private String hor_hora;

    public Horario(int hor_id, String hor_dias, String hor_hora) {
        this.hor_id = hor_id;
        this.hor_dias = hor_dias;
        this.hor_hora = hor_hora;
    }

    
    public int getHor_id() {
        return hor_id;
    }

    public void setHor_id(int hor_id) {
        this.hor_id = hor_id;
    }

    public String getHor_dias() {
        return hor_dias;
    }

    public void setHor_dias(String hor_dias) {
        this.hor_dias = hor_dias;
    }

    public String getHor_hora() {
        return hor_hora;
    }

    public void setHor_hora(String hor_hora) {
        this.hor_hora = hor_hora;
    }

}
