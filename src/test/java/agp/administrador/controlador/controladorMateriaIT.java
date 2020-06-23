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
public class controladorMateriaIT {
    
    public controladorMateriaIT() {
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
     * Test of crearMateria method, of class controladorMateria.
     */
    @Test
    public void testCrearMateria() {
        System.out.println("crearMateria");
        controladorMateria instance = new controladorMateria();
        instance.crearMateria();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarMateria method, of class controladorMateria.
     */
    @Test
    public void testActualizarMateria() {
        System.out.println("actualizarMateria");
        controladorMateria instance = new controladorMateria();
        instance.actualizarMateria();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarMateria method, of class controladorMateria.
     */
    @Test
    public void testEliminarMateria() {
        System.out.println("eliminarMateria");
        controladorMateria instance = new controladorMateria();
        instance.eliminarMateria();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
