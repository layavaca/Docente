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
public class Grupo {
    private int gru_id;
    private int gru_numero;
    private String gru_estado;

    public Grupo(int gru_id, int gru_numero, String gru_estado) {
        this.gru_id = gru_id;
        this.gru_numero = gru_numero;
        this.gru_estado = gru_estado;
    }

    public int getGru_id() {
        return gru_id;
    }

    public void setGru_id(int gru_id) {
        this.gru_id = gru_id;
    }

    public int getGru_numero() {
        return gru_numero;
    }

    public void setGru_numero(int gru_numero) {
        this.gru_numero = gru_numero;
    }

    public String getGru_estado() {
        return gru_estado;
    }

    public void setGru_estado(String gru_estado) {
        this.gru_estado = gru_estado;
    }
}
