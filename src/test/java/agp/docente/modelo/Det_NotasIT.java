/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.docente.modelo;

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
public class Det_NotasIT {
    
    public Det_NotasIT() {
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
     * Test of getNot_id method, of class Det_Notas.
     */
    @Test
    public void testGetNot_id() {
        System.out.println("getNot_id");
        Det_Notas instance = null;
        int expResult = 0;
        int result = instance.getNot_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNot_id method, of class Det_Notas.
     */
    @Test
    public void testSetNot_id() {
        System.out.println("setNot_id");
        int not_id = 0;
        Det_Notas instance = null;
        instance.setNot_id(not_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNot_tipoNota method, of class Det_Notas.
     */
    @Test
    public void testGetNot_tipoNota() {
        System.out.println("getNot_tipoNota");
        Det_Notas instance = null;
        String expResult = "";
        String result = instance.getNot_tipoNota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNot_tipoNota method, of class Det_Notas.
     */
    @Test
    public void testSetNot_tipoNota() {
        System.out.println("setNot_tipoNota");
        String not_tipoNota = "";
        Det_Notas instance = null;
        instance.setNot_tipoNota(not_tipoNota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNot_nota method, of class Det_Notas.
     */
    @Test
    public void testGetNot_nota() {
        System.out.println("getNot_nota");
        Det_Notas instance = null;
        int expResult = 0;
        int result = instance.getNot_nota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNot_nota method, of class Det_Notas.
     */
    @Test
    public void testSetNot_nota() {
        System.out.println("setNot_nota");
        int not_nota = 0;
        Det_Notas instance = null;
        instance.setNot_nota(not_nota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
