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
public class Det_Notas {
    
    private int det_id;
    private int det_promedio;
    private int det_nota;
    private Notas natas;
    private Materia materia;

    public Det_Notas(int det_id, int det_promedio, int det_nota, Notas natas, Materia materia) {
        this.det_id = det_id;
        this.det_promedio = det_promedio;
        this.det_nota = det_nota;
        this.natas = natas;
        this.materia = materia;
    }

    public int getDet_id() {
        return det_id;
    }

    public void setDet_id(int det_id) {
        this.det_id = det_id;
    }

    public int getDet_promedio() {
        return det_promedio;
    }

    public void setDet_promedio(int det_promedio) {
        this.det_promedio = det_promedio;
    }

    public int getDet_nota() {
        return det_nota;
    }

    public void setDet_nota(int det_nota) {
        this.det_nota = det_nota;
    }

    public Notas getNatas() {
        return natas;
    }

    public void setNatas(Notas natas) {
        this.natas = natas;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    

    
}
