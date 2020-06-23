/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.login.controlador;

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
public class ControladorLoginIT {
    
    public ControladorLoginIT() {
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
     * Test of listaPersona method, of class ControladorLogin.
     */
    @Test
    public void testListaPersona() {
        System.out.println("listaPersona");
        ControladorLogin instance = new ControladorLogin();
        instance.listaPersona();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autentificacion method, of class ControladorLogin.
     */
    @Test
    public void testAutentificacion() {
        System.out.println("autentificacion");
        ControladorLogin instance = new ControladorLogin();
        instance.autentificacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
