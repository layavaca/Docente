/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.administrador.controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Monik
 */
public class controladorEstudianteIT {
    
    public controladorEstudianteIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearEstudiante method, of class controladorEstudiante.
     */
    @Test
    public void testCrearEstudiante() {
        System.out.println("crearEstudiante");
        controladorEstudiante instance = new controladorEstudiante();
        instance.crearEstudiante();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarEstudiante method, of class controladorEstudiante.
     */
    @Test
    public void testActualizarEstudiante() {
        System.out.println("actualizarEstudiante");
        controladorEstudiante instance = new controladorEstudiante();
        instance.actualizarEstudiante();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEstudiante method, of class controladorEstudiante.
     */
    @Test
    public void testEliminarEstudiante() {
        System.out.println("eliminarEstudiante");
        controladorEstudiante instance = new controladorEstudiante();
        instance.eliminarEstudiante();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
