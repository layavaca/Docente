/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.matricula.modelo;

/**
 *
 * @author Monik
 */
public abstract class Beca {
    private int bec_id;
    private double bec_becas_niveles;
    private double bec_becas_UPS;
    private double bec_becas_estado;
    private double bec_total;

    public Beca(){
    }
    
    public abstract void calcularDescuento();
}
