/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.login.modelo;

import java.util.Date;
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
public class LoginIT {
    
    public LoginIT() {
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
     * Test of getLog_id method, of class Login.
     */
    @Test
    public void testGetLog_id() {
        System.out.println("getLog_id");
        Login instance = null;
        int expResult = 0;
        int result = instance.getLog_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLog_id method, of class Login.
     */
    @Test
    public void testSetLog_id() {
        System.out.println("setLog_id");
        int log_id = 0;
        Login instance = null;
        instance.setLog_id(log_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLog_fecha method, of class Login.
     */
    @Test
    public void testGetLog_fecha() {
        System.out.println("getLog_fecha");
        Login instance = null;
        Date expResult = null;
        Date result = instance.getLog_fecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLog_fecha method, of class Login.
     */
    @Test
    public void testSetLog_fecha() {
        System.out.println("setLog_fecha");
        Date log_fecha = null;
        Login instance = null;
        instance.setLog_fecha(log_fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLog_persona method, of class Login.
     */
    @Test
    public void testGetLog_persona() {
        System.out.println("getLog_persona");
        Login instance = null;
        Persona expResult = null;
        Persona result = instance.getLog_persona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLog_persona method, of class Login.
     */
    @Test
    public void testSetLog_persona() {
        System.out.println("setLog_persona");
        Persona log_persona = null;
        Login instance = null;
        instance.setLog_persona(log_persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
