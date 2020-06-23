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
public class Estudiante extends Persona{
    
    public Estudiante(int per_id, String per_nombre, String per_cedula, Date per_fecha_naciminto, String per_telefono, String per_direccion, String per_email, String per_password) {
        super(per_id, per_nombre, per_cedula, per_fecha_naciminto, per_telefono, per_direccion, per_email, per_password);
    }
    
}
