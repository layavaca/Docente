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
public class DocenteIT {
    
    public DocenteIT() {
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
     * Test of getDoc_id method, of class Docente.
     */
    @Test
    public void testGetDoc_id() {
        System.out.println("getDoc_id");
        Docente instance = new Docente();
        int expResult = 0;
        int result = instance.getDoc_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoc_id method, of class Docente.
     */
    @Test
    public void testSetDoc_id() {
        System.out.println("setDoc_id");
        int doc_id = 0;
        Docente instance = null;
        instance.setDoc_id(doc_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoc_cedula method, of class Docente.
     */
    @Test
    public void testGetDoc_cedula() {
        System.out.println("getDoc_cedula");
        Docente instance = null;
        String expResult = "";
        String result = instance.getDoc_cedula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoc_cedula method, of class Docente.
     */
    @Test
    public void testSetDoc_cedula() {
        System.out.println("setDoc_cedula");
        String doc_cedula = "";
        Docente instance = null;
        instance.setDoc_cedula(doc_cedula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoc_nombres method, of class Docente.
     */
    @Test
    public void testGetDoc_nombres() {
        System.out.println("getDoc_nombres");
        Docente instance = null;
        String expResult = "";
        String result = instance.getDoc_nombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoc_nombres method, of class Docente.
     */
    @Test
    public void testSetDoc_nombres() {
        System.out.println("setDoc_nombres");
        String doc_nombres = "";
        Docente instance = null;
        instance.setDoc_nombres(doc_nombres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoc_direccion method, of class Docente.
     */
    @Test
    public void testGetDoc_direccion() {
        System.out.println("getDoc_direccion");
        Docente instance = null;
        String expResult = "";
        String result = instance.getDoc_direccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoc_direccion method, of class Docente.
     */
    @Test
    public void testSetDoc_direccion() {
        System.out.println("setDoc_direccion");
        String doc_direccion = "";
        Docente instance = null;
        instance.setDoc_direccion(doc_direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoc_telefono method, of class Docente.
     */
    @Test
    public void testGetDoc_telefono() {
        System.out.println("getDoc_telefono");
        Docente instance = null;
        String expResult = "";
        String result = instance.getDoc_telefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoc_telefono method, of class Docente.
     */
    @Test
    public void testSetDoc_telefono() {
        System.out.println("setDoc_telefono");
        String doc_telefono = "";
        Docente instance = null;
        instance.setDoc_telefono(doc_telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoc_titulo method, of class Docente.
     */
    @Test
    public void testGetDoc_titulo() {
        System.out.println("getDoc_titulo");
        Docente instance = null;
        String expResult = "";
        String result = instance.getDoc_titulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoc_titulo method, of class Docente.
     */
    @Test
    public void testSetDoc_titulo() {
        System.out.println("setDoc_titulo");
        String doc_titulo = "";
        Docente instance = null;
        instance.setDoc_titulo(doc_titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoc_sueldo method, of class Docente.
     */
    @Test
    public void testGetDoc_sueldo() {
        System.out.println("getDoc_sueldo");
        Docente instance = null;
        double expResult = 0.0;
        double result = instance.getDoc_sueldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoc_sueldo method, of class Docente.
     */
    @Test
    public void testSetDoc_sueldo() {
        System.out.println("setDoc_sueldo");
        double doc_sueldo = 0.0;
        Docente instance = null;
        instance.setDoc_sueldo(doc_sueldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
