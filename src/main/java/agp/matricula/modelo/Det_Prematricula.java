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
public class Det_Prematricula {
    private int det_id;
    private int det_codigo;
    private String det_concepto_rubro;
    private int det_cantidad;
    private double det_valor;
    private double det_total;

    public Det_Prematricula(int det_id, int det_codigo, String det_concepto_rubro, int det_cantidad, double det_valor, double det_total) {
        this.det_id = det_id;
        this.det_codigo = det_codigo;
        this.det_concepto_rubro = det_concepto_rubro;
        this.det_cantidad = det_cantidad;
        this.det_valor = det_valor;
        this.det_total = det_total;
    }

    public int getDet_id() {
        return det_id;
    }

    public void setDet_id(int det_id) {
        this.det_id = det_id;
    }

    public int getDet_codigo() {
        return det_codigo;
    }

    public void setDet_codigo(int det_codigo) {
        this.det_codigo = det_codigo;
    }

    public String getDet_concepto_rubro() {
        return det_concepto_rubro;
    }

    public void setDet_concepto_rubro(String det_concepto_rubro) {
        this.det_concepto_rubro = det_concepto_rubro;
    }

    public int getDet_cantidad() {
        return det_cantidad;
    }

    public void setDet_cantidad(int det_cantidad) {
        this.det_cantidad = det_cantidad;
    }

    public double getDet_valor() {
        return det_valor;
    }

    public void setDet_valor(double det_valor) {
        this.det_valor = det_valor;
    }

    public double getDet_total() {
        return det_total;
    }

    public void setDet_total(double det_total) {
        this.det_total = det_total;
    }

    
}
