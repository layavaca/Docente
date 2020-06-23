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
public class controladorMatriculaIT {
    
    public controladorMatriculaIT() {
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
     * Test of crearMatricula method, of class controladorMatricula.
     */
    @Test
    public void testCrearMatricula() {
        System.out.println("crearMatricula");
        controladorMatricula instance = new controladorMatricula();
        instance.crearMatricula();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarMatricula method, of class controladorMatricula.
     */
    @Test
    public void testActualizarMatricula() {
        System.out.println("actualizarMatricula");
        controladorMatricula instance = new controladorMatricula();
        instance.actualizarMatricula();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarMatricula method, of class controladorMatricula.
     */
    @Test
    public void testEliminarMatricula() {
        System.out.println("eliminarMatricula");
        controladorMatricula instance = new controladorMatricula();
        instance.eliminarMatricula();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
