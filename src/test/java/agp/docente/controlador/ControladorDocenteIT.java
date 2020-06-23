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
public class ControladorDocenteIT {
    
    public ControladorDocenteIT() {
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
     * Test of listaEstudiante method, of class ControladorDocente.
     */
    @Test
    public void testListaEstudiante() {
        System.out.println("listaEstudiante");
        ControladorDocente instance = new ControladorDocente();
        instance.listaEstudiante();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarNota method, of class ControladorDocente.
     */
    @Test
    public void testRegistrarNota() {
        System.out.println("registrarNota");
        ControladorDocente instance = new ControladorDocente();
        instance.registrarNota();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarReportes method, of class ControladorDocente.
     */
    @Test
    public void testGenerarReportes() {
        System.out.println("generarReportes");
        ControladorDocente instance = new ControladorDocente();
        instance.generarReportes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
