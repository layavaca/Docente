/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.matricula.modelo;

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
public class MateriaIT {
    
    public MateriaIT() {
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
     * Test of getMat_id method, of class Materia.
     */
    @Test
    public void testGetMat_id() {
        System.out.println("getMat_id");
        Materia instance = null;
        int expResult = 0;
        int result = instance.getMat_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMat_id method, of class Materia.
     */
    @Test
    public void testSetMat_id() {
        System.out.println("setMat_id");
        int mat_id = 0;
        Materia instance = null;
        instance.setMat_id(mat_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMat_nombre method, of class Materia.
     */
    @Test
    public void testGetMat_nombre() {
        System.out.println("getMat_nombre");
        Materia instance = null;
        String expResult = "";
        String result = instance.getMat_nombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMat_nombre method, of class Materia.
     */
    @Test
    public void testSetMat_nombre() {
        System.out.println("setMat_nombre");
        String mat_nombre = "";
        Materia instance = null;
        instance.setMat_nombre(mat_nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMat_codigo method, of class Materia.
     */
    @Test
    public void testGetMat_codigo() {
        System.out.println("getMat_codigo");
        Materia instance = null;
        int expResult = 0;
        int result = instance.getMat_codigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMat_codigo method, of class Materia.
     */
    @Test
    public void testSetMat_codigo() {
        System.out.println("setMat_codigo");
        int mat_codigo = 0;
        Materia instance = null;
        instance.setMat_codigo(mat_codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
