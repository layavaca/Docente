/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.login.modelo;

import java.util.Date;



/**
 *
 * @author Monik
 */
public class Login {
    private int log_id;
    private Date log_fecha;
    private Persona log_persona;

    public Login(int log_id, Date log_fecha, Persona log_persona) {
        this.log_id = log_id;
        this.log_fecha = log_fecha;
        this.log_persona = log_persona;
    }

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public Date getLog_fecha() {
        return log_fecha;
    }

    public void setLog_fecha(Date log_fecha) {
        this.log_fecha = log_fecha;
    }

    public Persona getLog_persona() {
        return log_persona;
    }

    public void setLog_persona(Persona log_persona) {
        this.log_persona = log_persona;
    }
    
    
}
