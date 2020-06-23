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
public class controladorHorarioIT {
    
    public controladorHorarioIT() {
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
     * Test of crearHorario method, of class controladorHorario.
     */
    @Test
    public void testCrearHorario() {
        System.out.println("crearHorario");
        controladorHorario instance = new controladorHorario();
        instance.crearHorario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarHorario method, of class controladorHorario.
     */
    @Test
    public void testActualizarHorario() {
        System.out.println("actualizarHorario");
        controladorHorario instance = new controladorHorario();
        instance.actualizarHorario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarHorario method, of class controladorHorario.
     */
    @Test
    public void testEliminarHorario() {
        System.out.println("eliminarHorario");
        controladorHorario instance = new controladorHorario();
        instance.eliminarHorario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
