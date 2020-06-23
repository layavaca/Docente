/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.estudiante.modelo;

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
public class GrupoIT {
    
    public GrupoIT() {
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
     * Test of getGru_id method, of class Grupo.
     */
    @Test
    public void testGetGru_id() {
        System.out.println("getGru_id");
        Grupo instance = null;
        int expResult = 0;
        int result = instance.getGru_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGru_id method, of class Grupo.
     */
    @Test
    public void testSetGru_id() {
        System.out.println("setGru_id");
        int gru_id = 0;
        Grupo instance = null;
        instance.setGru_id(gru_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGru_numero method, of class Grupo.
     */
    @Test
    public void testGetGru_numero() {
        System.out.println("getGru_numero");
        Grupo instance = null;
        int expResult = 0;
        int result = instance.getGru_numero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGru_numero method, of class Grupo.
     */
    @Test
    public void testSetGru_numero() {
        System.out.println("setGru_numero");
        int gru_numero = 0;
        Grupo instance = null;
        instance.setGru_numero(gru_numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGru_estado method, of class Grupo.
     */
    @Test
    public void testGetGru_estado() {
        System.out.println("getGru_estado");
        Grupo instance = null;
        String expResult = "";
        String result = instance.getGru_estado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGru_estado method, of class Grupo.
     */
    @Test
    public void testSetGru_estado() {
        System.out.println("setGru_estado");
        String gru_estado = "";
        Grupo instance = null;
        instance.setGru_estado(gru_estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
