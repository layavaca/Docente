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
public class Det_Notas {
    
    private int not_id;
    private String not_tipoNota;
    private int not_nota;

    public Det_Notas(int not_id, String not_tipoNota, int not_nota) {
        this.not_id = not_id;
        this.not_tipoNota = not_tipoNota;
        this.not_nota = not_nota;
    }

    
    public int getNot_id() {
        return not_id;
    }

    public void setNot_id(int not_id) {
        this.not_id = not_id;
    }

    public String getNot_tipoNota() {
        return not_tipoNota;
    }

    public void setNot_tipoNota(String not_tipoNota) {
        this.not_tipoNota = not_tipoNota;
    }

    public int getNot_nota() {
        return not_nota;
    }

    public void setNot_nota(int not_nota) {
        this.not_nota = not_nota;
    }
    
    
}
