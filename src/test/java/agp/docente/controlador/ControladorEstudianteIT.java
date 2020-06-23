/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.docente.controlador;

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
public class ControladorEstudianteIT {
    
    public ControladorEstudianteIT() {
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
     * Test of listaEstudiante method, of class ControladorEstudiante.
     */
    @Test
    public void testListaEstudiante() {
        System.out.println("listaEstudiante");
        ControladorEstudiante instance = new ControladorEstudiante();
        instance.listaEstudiante();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaCarrera method, of class ControladorEstudiante.
     */
    @Test
    public void testListaCarrera() {
        System.out.println("listaCarrera");
        ControladorEstudiante instance = new ControladorEstudiante();
        instance.listaCarrera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaEstudianteCarrera method, of class ControladorEstudiante.
     */
    @Test
    public void testListaEstudianteCarrera() {
        System.out.println("listaEstudianteCarrera");
        ControladorEstudiante instance = new ControladorEstudiante();
        instance.listaEstudianteCarrera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
