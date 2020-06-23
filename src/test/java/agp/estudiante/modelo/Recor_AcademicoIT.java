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
public class Recor_AcademicoIT {
    
    public Recor_AcademicoIT() {
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
     * Test of getRec_id method, of class Recor_Academico.
     */
    @Test
    public void testGetRec_id() {
        System.out.println("getRec_id");
        Recor_Academico instance = null;
        int expResult = 0;
        int result = instance.getRec_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRec_id method, of class Recor_Academico.
     */
    @Test
    public void testSetRec_id() {
        System.out.println("setRec_id");
        int rec_id = 0;
        Recor_Academico instance = null;
        instance.setRec_id(rec_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRec_nivel method, of class Recor_Academico.
     */
    @Test
    public void testGetRec_nivel() {
        System.out.println("getRec_nivel");
        Recor_Academico instance = null;
        String expResult = "";
        String result = instance.getRec_nivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRec_nivel method, of class Recor_Academico.
     */
    @Test
    public void testSetRec_nivel() {
        System.out.println("setRec_nivel");
        String rec_nivel = "";
        Recor_Academico instance = null;
        instance.setRec_nivel(rec_nivel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRec_estado method, of class Recor_Academico.
     */
    @Test
    public void testGetRec_estado() {
        System.out.println("getRec_estado");
        Recor_Academico instance = null;
        String expResult = "";
        String result = instance.getRec_estado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRec_estado method, of class Recor_Academico.
     */
    @Test
    public void testSetRec_estado() {
        System.out.println("setRec_estado");
        String rec_estado = "";
        Recor_Academico instance = null;
        instance.setRec_estado(rec_estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
