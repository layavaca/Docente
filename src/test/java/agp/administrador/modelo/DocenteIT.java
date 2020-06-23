/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.administrador.modelo;

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

    /**
     * Test of getCarrera method, of class Docente.
     */
    @Test
    public void testGetCarrera() {
        System.out.println("getCarrera");
        Docente instance = null;
        Carrera expResult = null;
        Carrera result = instance.getCarrera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarrera method, of class Docente.
     */
    @Test
    public void testSetCarrera() {
        System.out.println("setCarrera");
        Carrera carrera = null;
        Docente instance = null;
        instance.setCarrera(carrera);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
