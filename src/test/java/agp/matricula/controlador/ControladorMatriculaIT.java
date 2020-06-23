/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.matricula.controlador;

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
public class ControladorMatriculaIT {
    
    public ControladorMatriculaIT() {
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
     * Test of ListarCarrera method, of class ControladorMatricula.
     */
    @Test
    public void testListarCarrera() {
        System.out.println("ListarCarrera");
        ControladorMatricula instance = new ControladorMatricula();
        instance.ListarCarrera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarEstudiante method, of class ControladorMatricula.
     */
    @Test
    public void testListarEstudiante() {
        System.out.println("ListarEstudiante");
        ControladorMatricula instance = new ControladorMatricula();
        instance.ListarEstudiante();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
