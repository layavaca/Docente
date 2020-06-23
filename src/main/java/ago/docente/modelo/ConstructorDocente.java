/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ago.docente.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author domem
 */
public class ConstructorDocente {


    private PreparedStatement preSta;
    private ResultSet res;
    private String sql;

 

    public void crear(Docentes datos) {
        sql = "INSERT INTO \"Docentes\" VALUES (?,?,?,?,?)";
        Conexion.coneccion();
        try {
            preSta = Conexion.getCon().prepareStatement(sql);
            preSta.setInt(1, datos.getDoc_id());
            preSta.setString(2, datos.getDoc_cedula());
            preSta.setString(3, datos.getDoc_nombre());
            preSta.setString(4, datos.getDoc_direccion());
            preSta.setString(5, datos.getDoc_telefono());
            preSta.setString(6, datos.getDoc_titulo());
            preSta.setDouble(7, datos.getDoc_sueldo());

            preSta.execute();
            preSta.close();
            Conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al guardar el año" + e.getMessage());
        }
    }
//Actualizar el FacturaDetalle

 

    public void actualizar(Docentes datos) {
        sql = "UPDATE \"Docentes\" SET  doc_id =? , doc_cedula=? , doc_nombre=? ,doc_nombre=?, doc_direccion =?, doc_telefono=?, doc_titulo=?, doc_sueldo=?   WHERE doc_id=?";
        Conexion.coneccion();
        try {
            preSta = Conexion.getCon().prepareStatement(sql);
              preSta.setInt(1, datos.getDoc_id());
            preSta.setString(2, datos.getDoc_cedula());
            preSta.setString(3, datos.getDoc_nombre());
            preSta.setString(4, datos.getDoc_direccion());
            preSta.setString(5, datos.getDoc_telefono());
            preSta.setString(6, datos.getDoc_titulo());
            preSta.setDouble(7, datos.getDoc_sueldo());
            preSta.execute();
            preSta.close();
            Conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar la Guia" + e.getMessage());
        }
    }

 

    public void eliminar(Docentes datos) {
        sql = "DELETE FROM \"Docentes\" WHERE doc_id=?";
        Conexion.coneccion();
        try {
            preSta = Conexion.getCon().prepareStatement(sql);
            preSta.setInt(1, datos.getDoc_id());
            preSta.executeUpdate();
            preSta.close();
            Conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al eliminar la Guia" + e.getMessage());
        }
    }

 

}
        
    

