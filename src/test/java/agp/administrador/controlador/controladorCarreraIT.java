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
public class controladorCarreraIT {
    
    public controladorCarreraIT() {
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
     * Test of crearCarrera method, of class controladorCarrera.
     */
    @Test
    public void testCrearCarrera() {
        System.out.println("crearCarrera");
        controladorCarrera instance = new controladorCarrera();
        instance.crearCarrera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarCarrera method, of class controladorCarrera.
     */
    @Test
    public void testActualizarCarrera() {
        System.out.println("actualizarCarrera");
        controladorCarrera instance = new controladorCarrera();
        instance.actualizarCarrera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCarrera method, of class controladorCarrera.
     */
    @Test
    public void testEliminarCarrera() {
        System.out.println("eliminarCarrera");
        controladorCarrera instance = new controladorCarrera();
        instance.eliminarCarrera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
