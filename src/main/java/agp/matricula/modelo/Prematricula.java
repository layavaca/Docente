/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.matricula.modelo;

import javax.xml.crypto.Data;

/**
 *
 * @author Monik
 */
public class Prematricula {
    private int pre_id;
    private Data pre_fech;
    private double pre_valor_neto;
    private double pre_descuento;
    private double pre_subtotal;
    private double pre_IVA;
    private double pre_total;
    private String pre_tipo_pago;
    private Det_Prematricula pre_detalle;
    private Matricula pre_inscripcion;

    public Prematricula(int pre_id, Data pre_fech, double pre_valor_neto, double pre_descuento, double pre_subtotal, double pre_IVA, double pre_total, String pre_tipo_pago, Det_Prematricula pre_detalle, Matricula pre_inscripcion) {
        this.pre_id = pre_id;
        this.pre_fech = pre_fech;
        this.pre_valor_neto = pre_valor_neto;
        this.pre_descuento = pre_descuento;
        this.pre_subtotal = pre_subtotal;
        this.pre_IVA = pre_IVA;
        this.pre_total = pre_total;
        this.pre_tipo_pago = pre_tipo_pago;
        this.pre_detalle = pre_detalle;
        this.pre_inscripcion = pre_inscripcion;
    }

    public int getPre_id() {
        return pre_id;
    }

    public void setPre_id(int pre_id) {
        this.pre_id = pre_id;
    }

    public Data getPre_fech() {
        return pre_fech;
    }

    public void setPre_fech(Data pre_fech) {
        this.pre_fech = pre_fech;
    }

    public double getPre_valor_neto() {
        return pre_valor_neto;
    }

    public void setPre_valor_neto(double pre_valor_neto) {
        this.pre_valor_neto = pre_valor_neto;
    }

    public double getPre_descuento() {
        return pre_descuento;
    }

    public void setPre_descuento(double pre_descuento) {
        this.pre_descuento = pre_descuento;
    }

    public double getPre_subtotal() {
        return pre_subtotal;
    }

    public void setPre_subtotal(double pre_subtotal) {
        this.pre_subtotal = pre_subtotal;
    }

    public double getPre_IVA() {
        return pre_IVA;
    }

    public void setPre_IVA(double pre_IVA) {
        this.pre_IVA = pre_IVA;
    }

    public double getPre_total() {
        return pre_total;
    }

    public void setPre_total(double pre_total) {
        this.pre_total = pre_total;
    }

    public String getPre_tipo_pago() {
        return pre_tipo_pago;
    }

    public void setPre_tipo_pago(String pre_tipo_pago) {
        this.pre_tipo_pago = pre_tipo_pago;
    }

    public Det_Prematricula getPre_detalle() {
        return pre_detalle;
    }

    public void setPre_detalle(Det_Prematricula pre_detalle) {
        this.pre_detalle = pre_detalle;
    }

    public Matricula getPre_inscripcion() {
        return pre_inscripcion;
    }

    public void setPre_inscripcion(Matricula pre_inscripcion) {
        this.pre_inscripcion = pre_inscripcion;
    }

}
