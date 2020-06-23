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
public class controladorDocenteIT {
    
    public controladorDocenteIT() {
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
     * Test of crearDocente method, of class controladorDocente.
     */
    @Test
    public void testCrearDocente() {
        System.out.println("crearDocente");
        controladorDocente instance = new controladorDocente();
        instance.crearDocente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarDocente method, of class controladorDocente.
     */
    @Test
    public void testActualizarDocente() {
        System.out.println("actualizarDocente");
        controladorDocente instance = new controladorDocente();
        instance.actualizarDocente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarDocente method, of class controladorDocente.
     */
    @Test
    public void testEliminarDocente() {
        System.out.println("eliminarDocente");
        controladorDocente instance = new controladorDocente();
        instance.eliminarDocente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
